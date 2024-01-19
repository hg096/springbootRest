package com.springB.springBoot.service;

import com.springB.springBoot.payload.PostDto;
import com.springB.springBoot.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost( PostDto postDto, long id );

    void deletePostById( long id );
}
