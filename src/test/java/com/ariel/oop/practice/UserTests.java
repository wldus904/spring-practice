package com.ariel.oop.practice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTests {
	
	@DisplayName("패스워드 초기화")
	@Test
	void passwordTest() {
		// given
		User user = new User();
		
		// when
		user.initPassword(new CorrectFixedPasswordGenerator());
		
		// then
		assertThat(user.getPassword()).isNotNull();
	}
	
	@DisplayName("패스워드가 요구사항에 부합하지 않아 초기화 되지 않음")
	@Test
	void passwordTest2() {
		// given
		User user = new User();
		
		// when
//		user.initPassword(new WrongFixedPasswordGenerator());
		// PasswordGenerator가 @FunctionalInterface 이기 때문에 가능
		user.initPassword(() -> "12");
		
		// then
		assertThat(user.getPassword()).isNull();
		/*
		 * assterThatCode : code의 exception 처리
		 * assterThat : 해당 값의 특정 문자 포함, null인지 등 확인
		*/
	}
}
