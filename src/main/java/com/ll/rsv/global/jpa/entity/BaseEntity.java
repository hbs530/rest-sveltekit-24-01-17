package com.ll.rsv.global.jpa.entity;

import static jakarta.persistence.GenerationType.*;

import org.springframework.data.domain.Persistable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@MappedSuperclass
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class BaseEntity implements Persistable<Long> {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	@Override
	public boolean isNew() {
		return id == null;
	}
}
