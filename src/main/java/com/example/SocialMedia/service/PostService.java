package com.example.SocialMedia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SocialMedia.app.Post;
import com.example.SocialMedia.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepo;

	public List<Post> getAllPosts(){
		return postRepo.findAll();
	}
	
}
