package com.example.SocialMedia.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jpa_posts2")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(name = "post_content")
	private String content;
	
	@Column(name = "post_title")
	private String title;

	public Post(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public Post() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
}
