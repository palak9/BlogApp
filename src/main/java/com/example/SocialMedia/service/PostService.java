package com.example.SocialMedia.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SocialMedia.app.Post;
import com.example.SocialMedia.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository postRepo;

	public List<Post> getAllPosts() {
		return postRepo.findAll();
	}

	public Post addPost(Post newPost) {
		newPost.setDate(new Date(System.currentTimeMillis()));
		return postRepo.save(newPost);
	}
}
