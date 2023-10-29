package com.example.SocialMedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.SocialMedia.service.PostService;

@Controller
public class AppController {

	PostService postService;
	
	public AppController(PostService postService) {
		super();
		this.postService = postService;
	}

	@GetMapping("/posts")
	public String getAllPosts(Model model) {
		model.addAttribute("posts", postService.getAllPosts());
		return "test";
	}
	
}
