package com.ariel.oop.practice;

public interface NewArithneticOperator {
	public boolean supports(String operator); // 오퍼레이터를 지원하는가
	int calculate(int operand1, int operand2);
}
