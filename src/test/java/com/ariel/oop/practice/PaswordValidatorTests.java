package com.ariel.oop.practice;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
/*
* 요구사항
• 비밀번호는 최소 8자 이상 12자 이하여야 한다.
• 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생 시킨다.
• 경계조건에 대해 테스트 코드를 작성해야 한다 (7자, 13자)
* */
@SpringBootTest
class PaswordValidatorTests {
	@DisplayName("8자 이상 12자 이하면 예외가 발생하지 않음")
	@Test
	void validatePasswordTest() {
		// given
		String password = "12345678901";
		
		// when, then
		assertThatCode(() -> PasswordValidator.validate(password))
			.doesNotThrowAnyException();
	}
	
	@DisplayName("비밀번호가 8자 미만 또는 12자 초과시 IllegalArgumentException 예외가 발생한다.")
	@ParameterizedTest
	@ValueSource(strings = {"1234567", "1234567890123"}) // 해당 값으로 test
	void validatePasswordTest1(String password) {
		// IllegalArgumentException 예외 사항이 발생하는지 확인
		assertThatCode(() -> PasswordValidator.validate(password))
			.isInstanceOf(IllegalArgumentException.class) // IllegalArgumentException를 발생했는가?
			.hasMessage("비밀번호는 8자 이상 11자 이하"); // 메시지가 일치하는지 확인
	}
}
