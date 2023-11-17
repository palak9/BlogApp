package com.example.SocialMedia.app;

import java.util.Date;

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

	@Column(name = "post_content", columnDefinition = "NVARCHAR(MAX)")
	private String content;

	@Column(name = "post_title")
	private String title;

	@Column(name = "post_category")
	private String category;

	@Column(name = "post_date")
	private Date date;

	public Post(long id, String content, String title, String category, Date date) {
		super();
		this.id = id;
		this.content = content;
		this.title = title;
		this.category = category;
		this.date = date;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
