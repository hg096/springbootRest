package com.springB.springBoot.service;

import com.springB.springBoot.payload.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment ( long postId, CommentDto commentDto );

    List<CommentDto> getCommentsByPostId (long postId);

    CommentDto getCommentById(Long postId, Long commentId);
}
