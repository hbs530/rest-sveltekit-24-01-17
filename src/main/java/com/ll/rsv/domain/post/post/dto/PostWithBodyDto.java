package com.ll.rsv.domain.post.post.dto;

import org.springframework.lang.NonNull;

import com.ll.rsv.domain.post.post.entity.Post;

import lombok.Getter;

@Getter
public class PostWithBodyDto extends PostDto {
	@NonNull
	private String body;

	public PostWithBodyDto(Post post) {
		super(post);
		this.body = post.getDetailBody().getVal();
	}
}
