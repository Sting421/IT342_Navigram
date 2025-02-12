package edu.cit.navigram.server.service;

import edu.cit.navigram.server.dto.FlagDto;
import edu.cit.navigram.server.model.Flag;
import edu.cit.navigram.server.model.Memory;
import edu.cit.navigram.server.model.VisibilityType;
import edu.cit.navigram.server.repository.FlagRepository;
import edu.cit.navigram.server.repository.MemoryRepository;
import edu.cit.navigram.server.util.DtoConverter;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlagService {
    private static final int MAX_FLAGS_PER_MEMORY = 5;

    private final FlagRepository flagRepository;
    private final MemoryRepository memoryRepository;
    private final DtoConverter dtoConverter;

    public FlagService(FlagRepository flagRepository, MemoryRepository memoryRepository, DtoConverter dtoConverter) {
        this.flagRepository = flagRepository;
        this.memoryRepository = memoryRepository;
        this.dtoConverter = dtoConverter;
    }

    @Transactional
    public FlagDto createFlag(FlagDto flagDto) {
        Memory memory = memoryRepository.findById(flagDto.getMemoryId())
            .orElseThrow(() -> new EntityNotFoundException("Memory not found"));

        // Check if memory has reached maximum flags
        long flagCount = flagRepository.countByMemory(memory);
        if (flagCount >= MAX_FLAGS_PER_MEMORY) {
            // If max flags reached, memory should be hidden or reviewed
            memory.setVisibility(VisibilityType.PRIVATE);
            memoryRepository.save(memory);
            throw new IllegalStateException("Memory has been flagged too many times and is now hidden");
        }

        Flag flag = dtoConverter.toEntity(flagDto);
        memory.addFlag(flag);  // This will handle both sides of the relationship
        Flag savedFlag = flagRepository.save(flag);
        memoryRepository.save(memory);
        return dtoConverter.toDto(savedFlag);
    }

    @Transactional(readOnly = true)
    public List<FlagDto> getFlagsForMemory(String memoryId) {
        Memory memory = memoryRepository.findById(memoryId)
            .orElseThrow(() -> new EntityNotFoundException("Memory not found"));

        List<Flag> flags = flagRepository.findByMemory(memory);
        return flags.stream()
            .map(dtoConverter::toDto)
            .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public boolean isMemoryFlagged(String memoryId) {
        Memory memory = memoryRepository.findById(memoryId)
            .orElseThrow(() -> new EntityNotFoundException("Memory not found"));
        return flagRepository.existsByMemory(memory);
    }

    @Transactional
    public void resolveFlag(String id) {
        Flag flag = flagRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Flag not found"));
        flag.setResolved(true);
        flagRepository.save(flag);
    }

    @Transactional
    public void hideMemory(String id) {
        Memory memory = memoryRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Memory not found"));
        memory.setVisibility(VisibilityType.PRIVATE);
        memoryRepository.save(memory);
    }
}

