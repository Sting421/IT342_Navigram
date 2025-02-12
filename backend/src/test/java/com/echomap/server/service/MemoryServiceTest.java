package edu.cit.navigram.server.service;

import edu.cit.navigram.server.dto.MemoryDto;
import edu.cit.navigram.server.model.Memory;
import edu.cit.navigram.server.model.User;
import edu.cit.navigram.server.model.VisibilityType;
import edu.cit.navigram.server.repository.MemoryRepository;
import edu.cit.navigram.server.repository.UserRepository;
import edu.cit.navigram.server.util.DtoConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class MemoryServiceTest {

    @Mock
    private MemoryRepository memoryRepository;

    @Mock
    private UserRepository userRepository;

    @Mock
    private DtoConverter dtoConverter;

    @InjectMocks
    private MemoryService memoryService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateMemory() {
        MemoryDto memoryDto = new MemoryDto();
        memoryDto.setUserId("userId");
        memoryDto.setAudioUrl("audioUrl");
        memoryDto.setVisibility(VisibilityType.PUBLIC);

        User user = new User();
        user.setId("userId");

        Memory memory = new Memory();
        memory.setUser(user);
        memory.setAudioUrl("audioUrl");
        memory.setVisibility(VisibilityType.PUBLIC);

        when(userRepository.findById("userId")).thenReturn(Optional.of(user));
        when(dtoConverter.toEntity(memoryDto)).thenReturn(memory);
        when(memoryRepository.save(any(Memory.class))).thenReturn(memory);
        when(dtoConverter.toDto(memory)).thenReturn(memoryDto);

        MemoryDto createdMemory = memoryService.createMemory(memoryDto);

        assertNotNull(createdMemory);
        assertEquals("userId", createdMemory.getUserId());
        assertEquals("audioUrl", createdMemory.getAudioUrl());
        assertEquals(VisibilityType.PUBLIC, createdMemory.getVisibility());
        verify(memoryRepository, times(1)).save(any(Memory.class));
    }

    @Test
    void testGetMemoryById() {
        Memory memory = new Memory();
        memory.setId("memoryId");
        memory.setAudioUrl("audioUrl");
        memory.setVisibility(VisibilityType.PUBLIC);

        MemoryDto memoryDto = new MemoryDto();
        memoryDto.setId("memoryId");
        memoryDto.setAudioUrl("audioUrl");
        memoryDto.setVisibility(VisibilityType.PUBLIC);

        when(memoryRepository.findById("memoryId")).thenReturn(Optional.of(memory));
        when(dtoConverter.toDto(memory)).thenReturn(memoryDto);

        MemoryDto retrievedMemory = memoryService.getMemoryById("memoryId");

        assertNotNull(retrievedMemory);
        assertEquals("memoryId", retrievedMemory.getId());
        assertEquals("audioUrl", retrievedMemory.getAudioUrl());
        assertEquals(VisibilityType.PUBLIC, retrievedMemory.getVisibility());
    }
}

