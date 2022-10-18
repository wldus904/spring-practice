package com.ariel.oop.practice.calculate;

import com.ariel.oop.practice.NewArithneticOperator;

public class DivisionOperator implements NewArithneticOperator {
	@Override
	public boolean supports(String operator) {
		return operator.equals("/");
	}
	
	@Override
	public int calculate(int operand1, int operand2) {
		return operand1 / operand2;
	}
}
