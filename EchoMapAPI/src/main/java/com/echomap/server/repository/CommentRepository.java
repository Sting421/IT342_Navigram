package com.echomap.server.repository;

import com.echomap.server.model.Comment;
import com.echomap.server.model.Memory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
    List<Comment> findByMemoryOrderByCreatedAtDesc(Memory memory);
}
