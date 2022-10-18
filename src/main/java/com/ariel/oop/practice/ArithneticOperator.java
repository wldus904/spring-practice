package com.ariel.oop.practice;

import java.util.Arrays;

public enum ArithneticOperator {
	// 추상 메소드에 관한 오버라이드 메소드
	ADDTION("+") {
		@Override
		public int arithneticCalculate(int operand1, int operand2) {
			return operand1 + operand2;
		}
	}, SUBTRACTION("-") {
		@Override
		public int arithneticCalculate(int operand1, int operand2) {
			return operand1 - operand2;
		}
	}, MULTIPLICATION("*") {
		@Override
		public int arithneticCalculate(int operand1, int operand2) {
			return operand1 * operand2;
		}
	}, DIVISION("/") {
		@Override
		public int arithneticCalculate(int operand1, int operand2) {
			return operand1 / operand2;
		}
	};
	
	private final String operator;
	
	ArithneticOperator(String operator) {
		this.operator = operator;
	}
	
	// 오버라이드 되는 추상 메소드
	public abstract int arithneticCalculate(final int operand1, final int operand2);
	
	// 외부에 노출되는 public 인터페이스
	public static int calculates(int operand1, String operator, int operand2) {
		ArithneticOperator arithneticOperator = Arrays.stream(values()) // ENUM안의 모든 요소를 순서대로 배열로 반환
			.filter(v -> v.operator.equals(operator)) // v.operator : ENUM의 operator
			.findFirst() // 일치하는 operator가 있을 경우 가지고 온다
			.orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다.")); // 일치하는 연한이 없을 경우 처리
		
		return arithneticOperator.arithneticCalculate(operand1, operand2); // 오버라이드 메소드 중 같은 메소드를 실행
	}
}
