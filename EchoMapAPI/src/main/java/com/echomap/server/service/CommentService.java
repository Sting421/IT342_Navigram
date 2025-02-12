package com.echomap.server.service;

import com.echomap.server.dto.CommentDto;
import java.util.List;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto);
    List<CommentDto> getCommentsForMemory(String memoryId);
    CommentDto getCommentById(String id);
    void deleteComment(String id);
}