package com.ll.rsv.domain.member.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

	private static final long serialVersionUID = -34995787L;

	public static final QMember member = new QMember("member1");

	public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

	public final NumberPath<Long> id = createNumber("id", Long.class);

	public final DateTimePath<java.time.LocalDateTime> modifyDate = createDateTime("modifyDate", java.time.LocalDateTime.class);

	public final StringPath password = createString("password");

	public final StringPath refreshToken = createString("refreshToken");

	public final StringPath username = createString("username");

	public QMember(String variable) {
		super(Member.class, forVariable(variable));
	}

	public QMember(Path<? extends Member> path) {
		super(path.getType(), path.getMetadata());
	}

	public QMember(PathMetadata metadata) {
		super(Member.class, metadata);
	}

}
