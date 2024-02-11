package com.ll.rsv.domain.post.postLike.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.rsv.domain.member.member.entity.Member;
import com.ll.rsv.domain.post.post.entity.Post;
import com.ll.rsv.domain.post.postLike.entity.PostLike;
import com.ll.rsv.domain.post.postLike.entity.PostLikeId;

public interface PostLikeRepository extends JpaRepository<PostLike, PostLikeId> {
	List<PostLike> findByIdPostInAndIdMember(List<Post> posts, Member member);
}
