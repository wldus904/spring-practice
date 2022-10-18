package com.ariel.oop.practice.calculate;

import com.ariel.oop.practice.NewArithneticOperator;

public class AdditionOperator implements NewArithneticOperator {
	@Override
	public boolean supports(String operator) {
		return "+".equals(operator);
	}
	
	@Override
	public int calculate(int operand1, int operand2) {
		return operand1 + operand2;
	}
}
