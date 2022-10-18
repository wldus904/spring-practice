package com.ariel.oop.practice;

public class Calculator {
	public static int calculate(int operand1,String operator, int operand2) {
		return ArithneticOperator.calculates(operand1, operator, operand2); // ENUM에 작업 위임
	}
}
