package com.ll.rsv.domain.post.post.dto;

import java.time.LocalDateTime;

import org.springframework.lang.NonNull;

import com.ll.rsv.domain.post.post.entity.Post;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AbsPostDto {
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
	private boolean published;
	@NonNull
	private long likesCount;

	@Setter
	private Boolean actorCanRead;
	@Setter
	private Boolean actorCanEdit;
	@Setter
	private Boolean actorCanDelete;
	@Setter
	private Boolean actorCanLike;
	@Setter
	private Boolean actorCanCancelLike;

	public AbsPostDto(Post post) {
		this.id = post.getId();
		this.createDate = post.getCreateDate();
		this.modifyDate = post.getModifyDate();
		this.authorId = post.getAuthor().getId();
		this.authorName = post.getAuthor().getName();
		this.title = post.getTitle();
		this.published = post.isPublished();
		this.likesCount = post.getLikesCount();
	}
}
