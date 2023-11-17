package com.example.SocialMedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SocialMedia.app.Post;
import com.example.SocialMedia.service.PostService;

@Controller
public class AppController {

	PostService postService;
	
	public AppController(PostService postService) {
		super();
		this.postService = postService;
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/blogs")
	public String getAllPosts(Model model) {
		model.addAttribute("posts", postService.getAllPosts());
		return "test";
	}
	
	@GetMapping("/blogs/new")
	public String createBlog(Model model) {
		Post newPost = new Post();
		model.addAttribute("post", newPost);
		return "newPost";
	}
	
	@PostMapping("/newPost")
	public String createNewPost(@ModelAttribute("post") Post post) {
		postService.addPost(post);
		return "redirect:/blogs";
	}
}
