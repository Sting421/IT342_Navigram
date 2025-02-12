package edu.cit.navigram.server.controller;

import edu.cit.navigram.server.dto.FlagDto;
import edu.cit.navigram.server.service.FlagService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/flags")
@CrossOrigin(origins = "*")
public class FlagController {
    private final FlagService flagService;

    public FlagController(FlagService flagService) {
        this.flagService = flagService;
    }

    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<FlagDto> createFlag(@Valid @RequestBody FlagDto flagDto) {
        return new ResponseEntity<>(flagService.createFlag(flagDto), HttpStatus.CREATED);
    }

    @GetMapping("/memory/{memoryId}")
    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    public ResponseEntity<List<FlagDto>> getFlagsForMemory(@PathVariable String memoryId) {
        return ResponseEntity.ok(flagService.getFlagsForMemory(memoryId));
    }

    @GetMapping("/memory/{memoryId}/status")
    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    public ResponseEntity<Boolean> isMemoryFlagged(@PathVariable String memoryId) {
        return ResponseEntity.ok(flagService.isMemoryFlagged(memoryId));
    }

    @PatchMapping("/{id}/resolve")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> resolveFlag(@PathVariable String id) {
        flagService.resolveFlag(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/memories/{id}/hide")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> hideMemory(@PathVariable String id) {
        flagService.hideMemory(id);
        return ResponseEntity.noContent().build();
    }
}

