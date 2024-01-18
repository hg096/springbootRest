package com.springB.springBoot.repository;

import com.springB.springBoot.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
