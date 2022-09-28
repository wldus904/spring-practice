package com.ariel.oop.practice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import net.bytebuddy.asm.Advice.Argument;

/*
 * 	요구사항
	• 간단한 사칙연산을 할 수 있다.
	• 양수로만 계산할 수 있다.
	• 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
	• MVC패턴(Model-View-Controller) 기반으로 구현한다
*/
public class CalculatorTest {
	
	// 1 + 2 --> Calculator
	// 3 <--
	@DisplayName("덧셈 연산을 수행한다.")
	@Test
	void addtionTest() {
		int result = Calculator.calculate(1, "+", 2);
		
		assertThat(result).isEqualTo(3);
	}
	
	// 1 + 2 --> Calculator
	// 3 <--
	@DisplayName("뺄셈 연산을 수행한다.")
	@Test
	void subtractionTest() {
		int result = Calculator.calculate(1, "-", 2);
		
		assertThat(result).isEqualTo(-1);
	}
	
	@DisplayName("연산을 수행한다.")
	@ParameterizedTest
	@MethodSource()
	void calculateTest() {
		int result = Calculator.calculate(0, null, 0)
				
		assertThat(result).isEqualTo(result)
	}
	
	Stream<Argument> formulaAndResult() {
		return Stream.of(
			arguments(1, "+", 2, 3),
			arguments(1, "-", 2, -1),
			arguments(4, "*", 2, 2),
			arguments(4, "/", 2, 8),
		);
	}
}
