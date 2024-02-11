package com.ll.rsv.domain.post.post.dto;

import java.time.LocalDateTime;

import org.springframework.lang.NonNull;

import com.ll.rsv.domain.post.post.entity.Post;

import lombok.Getter;

@Getter
public class PostDto {
	@NonNull
	private long id;
	@NonNull
	private LocalDateTime createDate;
	@NonNull
	private LocalDateTime modifyDate;
	@NonNull
	private long authorId;
	@NonNull
	private String authorName;
	@NonNull
	private String title;
	@NonNull
	private String body;

	public PostDto(Post post) {
		this.id = post.getId();
		this.createDate = post.getCreateDate();
		this.modifyDate = post.getModifyDate();
		this.authorId = post.getAuthor().getId();
		this.authorName = post.getAuthor().getName();
		this.title = post.getTitle();
		this.body = post.getBody();
	}
}
