package com.ll.rsv.domain.post.postLike.entity;

import static lombok.AccessLevel.*;

import com.ll.rsv.domain.member.member.entity.Member;
import com.ll.rsv.domain.post.post.entity.Post;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Delegate;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PostLike {
	@EmbeddedId
	@Delegate
	@EqualsAndHashCode.Include
	private PostLikeId id;

	@Builder
	private static PostLike of(Post post, Member member) {
		return new PostLike(
				PostLikeId.builder()
						.post(post)
						.member(member)
						.build()
		);
	}
}
