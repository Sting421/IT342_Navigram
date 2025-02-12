package edu.cit.navigram.server.util;

import edu.cit.navigram.server.dto.FlagDto;
import edu.cit.navigram.server.dto.MemoryDto;
import edu.cit.navigram.server.dto.UserDto;
import edu.cit.navigram.server.model.Flag;
import edu.cit.navigram.server.model.Memory;
import edu.cit.navigram.server.model.User;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;
import org.springframework.stereotype.Component;

@Component
public class DtoConverter {
    private final GeometryFactory geometryFactory;

    public DtoConverter() {
        // SRID 4326 is for WGS84 coordinate system (standard GPS coordinates)
        this.geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
    }

    public User toEntity(UserDto dto) {
        System.out.println("Converting UserDto to User entity");
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        System.out.println("User entity created: " + user);
        return user;
    }

    public UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole());
        return dto;
    }

    public Memory toEntity(MemoryDto dto) {
        Memory memory = new Memory();
        memory.setAudioUrl(dto.getAudioUrl());
        memory.setVisibility(dto.getVisibility());

        // Convert lat/lng to Point
        Point point = geometryFactory.createPoint(
            new Coordinate(dto.getLongitude(), dto.getLatitude())
        );
        memory.setLocation(point);

        return memory;
    }

    public MemoryDto toDto(Memory memory) {
        MemoryDto dto = new MemoryDto();
        dto.setId(memory.getId());
        dto.setUserId(memory.getUser().getId());
        dto.setUsername(memory.getUser().getUsername());
        dto.setAudioUrl(memory.getAudioUrl());
        dto.setCreatedAt(memory.getCreatedAt());
        dto.setUpvoteCount(memory.getUpvoteCount());
        dto.setVisibility(memory.getVisibility());

        // Convert Point to lat/lng
        Point point = memory.getLocation();
        dto.setLatitude(point.getY());  // Y coordinate is latitude
        dto.setLongitude(point.getX()); // X coordinate is longitude

        return dto;
    }

    public Flag toEntity(FlagDto dto) {
        Flag flag = new Flag();
        flag.setReason(dto.getReason());
        return flag;
    }

    public FlagDto toDto(Flag flag) {
        FlagDto dto = new FlagDto();
        dto.setId(flag.getId());
        dto.setMemoryId(flag.getMemory().getId());
        dto.setMemoryUserId(flag.getMemory().getUser().getId());
        dto.setReason(flag.getReason());
        dto.setCreatedAt(flag.getCreatedAt());
        return dto;
    }
}

