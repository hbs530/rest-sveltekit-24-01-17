package com.ll.rsv.domain.post.post.entity;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.FetchType.*;

import com.ll.rsv.domain.member.member.entity.Member;
import com.ll.rsv.global.jpa.entity.BaseTime;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class Post extends BaseTime {
	@ManyToOne(fetch = LAZY)
	private Member author;
	private String title;
	@OneToOne(fetch = LAZY, cascade = ALL)
	@ToString.Exclude
	private PostDetail detailBody;
	private boolean published;
}
