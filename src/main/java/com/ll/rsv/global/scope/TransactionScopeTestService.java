package com.ll.rsv.global.scope;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ll.rsv.domain.member.member.repository.MemberRepository;
import com.ll.rsv.global.transactionCache.TransactionCache;

import lombok.RequiredArgsConstructor;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TransactionScopeTestService {
	private final TransactionCache transactionCache;
	private final MemberRepository memberRepository;

	public String test1() {
		return (String) transactionCache.computeIfAbsent("test", k -> UUID.randomUUID().toString());
	}

	public String test2() {
		return (String) transactionCache.computeIfAbsent("test", k -> UUID.randomUUID().toString());
	}
}
