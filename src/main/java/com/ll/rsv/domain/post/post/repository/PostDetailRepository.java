package com.ll.rsv.domain.post.post.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.rsv.domain.post.post.entity.Post;
import com.ll.rsv.domain.post.post.entity.PostDetail;

public interface PostDetailRepository extends JpaRepository<PostDetail, Long> {
	Optional<PostDetail> findByPostAndName(Post post, String name);
}
