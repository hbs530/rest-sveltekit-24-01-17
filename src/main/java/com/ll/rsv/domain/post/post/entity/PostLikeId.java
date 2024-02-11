package com.ll.rsv.domain.post.postLike.entity;

import static jakarta.persistence.FetchType.*;
import static lombok.AccessLevel.*;

import java.io.Serializable;

import com.ll.rsv.domain.member.member.entity.Member;
import com.ll.rsv.domain.post.post.entity.Post;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@EqualsAndHashCode
public class PostLikeId implements Serializable {
	@ManyToOne(fetch = LAZY)
	private Post post;
	@ManyToOne(fetch = LAZY)
	private Member member;
}
