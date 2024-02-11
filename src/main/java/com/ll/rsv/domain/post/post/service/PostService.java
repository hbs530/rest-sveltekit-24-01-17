package com.ll.rsv.domain.post.post.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ll.rsv.domain.member.member.entity.Member;
import com.ll.rsv.domain.post.post.entity.Post;
import com.ll.rsv.domain.post.post.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
	private final PostRepository postRepository;

	@Transactional
	public void write(Member author, String title, String body, boolean published) {
		Post post = Post.builder()
				.author(author)
				.title(title)
				.body(body)
				.published(published)
				.build();

		postRepository.save(post);
	}

	public List<Post> findByPublished(boolean published) {
		return postRepository.findByPublishedOrderByIdDesc(published);
	}

	public Optional<Post> findById(long id) {
		return postRepository.findById(id);
	}
}
