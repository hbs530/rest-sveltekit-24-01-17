package com.ll.rsv.domain.post.post.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.rsv.domain.post.post.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	List<Post> findByPublishedOrderByIdDesc(boolean published);
}
