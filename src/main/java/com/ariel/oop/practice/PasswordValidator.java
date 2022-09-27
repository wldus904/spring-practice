package com.ariel.oop.practice;

public class PasswordValidator {
	private static final String WRONG_PASSWORD_LIMIT_EXCEPTION_MESSAGE = "비밀번호는 8자 이상 11자 이하";
	
	public static void validate(String password) {
		int length = password.length();
		
		if (length < 8 || length > 12) {
			throw new IllegalArgumentException(WRONG_PASSWORD_LIMIT_EXCEPTION_MESSAGE);
		}
	}
}
