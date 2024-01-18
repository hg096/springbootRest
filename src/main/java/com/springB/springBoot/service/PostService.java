package com.springB.springBoot.service;

import com.springB.springBoot.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

}
