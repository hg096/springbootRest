package com.springB.springBoot.service;

import com.springB.springBoot.payload.PostDto;
import com.springB.springBoot.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(Integer pageNo, Integer pageSize, String sortBy, String sortDir);

    PostDto getPostById(Long id);

    PostDto updatePost( PostDto postDto, Long id );

    void deletePostById( Long id );
}
