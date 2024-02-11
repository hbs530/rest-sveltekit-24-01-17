package com.ll.rsv.global.transactionCache;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ll.rsv.global.scope.transaction.TransactionScope;

import lombok.experimental.Delegate;

@TransactionScope
@Component
public class TransactionCache {
	@Delegate
	private final Map<String, Object> data = new HashMap<>();

	public <T> T get(String key) {
		return (T) data.get(key);
	}
}
