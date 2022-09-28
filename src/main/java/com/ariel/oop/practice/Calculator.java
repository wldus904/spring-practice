package com.ariel.oop.practice;

public class Calculator {
	static int calculate(int operand1,String operator, int operand2) {
		if ("+".equals(operator)) {
			return operand1 + operand2; 
		} else if ("-".equals(operator)) {
			return operand1 - operand2;
		}
		
		return 0;
	}
}
