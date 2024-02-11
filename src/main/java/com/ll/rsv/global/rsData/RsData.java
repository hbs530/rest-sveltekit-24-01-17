package com.ll.rsv.global.rsData;

import static lombok.AccessLevel.*;

import org.springframework.lang.NonNull;

import com.ll.rsv.standard.base.Empty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = PRIVATE)
@NoArgsConstructor(access = PRIVATE)
@Getter
public class RsData<T> {
	@NonNull
	String resultCode;
	@NonNull
	int statusCode;
	@NonNull
	String msg;
	@NonNull
	T data;

	public static <T> RsData<T> of(T data) {
		return of("200-1", "성공", data);
	}

	public static <T> RsData<T> of(String msg, T data) {
		return of("200-1", msg, data);
	}

	public static <T> RsData<T> of(String resultCode, String msg) {
		return of(resultCode, msg, (T) new Empty());
	}

	public static <T> RsData<T> of(String resultCode, String msg, T data) {
		int statusCode = Integer.parseInt(resultCode.split("-", 2)[0]);

		RsData<T> tRsData = new RsData<>(resultCode, statusCode, msg, data);

		return tRsData;
	}

	@NonNull
	public boolean isSuccess() {
		return getStatusCode() >= 200 && getStatusCode() < 400;
	}

	@NonNull
	public boolean isFail() {
		return !isSuccess();
	}

	public <T> RsData<T> newDataOf(T data) {
		return new RsData<>(resultCode, statusCode, msg, data);
	}
}
