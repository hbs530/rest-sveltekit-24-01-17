package com.ll.rsv.domain.post.postLike.entity;

import static lombok.AccessLevel.*;

import com.ll.rsv.domain.member.member.entity.Member;
import com.ll.rsv.domain.post.post.entity.Post;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Getter
@ToString
@EqualsAndHashCode
public class PostLike {
	@EmbeddedId
	private com.ll.rsv.domain.post.postLike.entity.PostLikeId id;

	@Builder
	private static PostLike of(Post post, Member member) {
		return new PostLike(
				com.ll.rsv.domain.post.postLike.entity.PostLikeId.builder()
						.post(post)
						.member(member)
						.build()
		);
	}
}
