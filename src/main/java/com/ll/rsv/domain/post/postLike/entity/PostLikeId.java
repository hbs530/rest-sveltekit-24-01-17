package com.ll.rsv.domain.post.postLike.entity;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

import java.io.Serializable;

import com.ll.rsv.domain.member.member.entity.Member;
import com.ll.rsv.domain.post.post.entity.Post;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Embeddable
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@EqualsAndHashCode
@Getter
public class PostLikeId implements Serializable {
	@ManyToOne(fetch = LAZY)
	private Post post;
	@ManyToOne(fetch = LAZY)
	private Member member;
}
