package com.example.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SocialMedia.app.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
