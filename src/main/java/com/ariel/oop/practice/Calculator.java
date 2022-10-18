package com.ariel.oop.practice;

import java.util.List;

import com.ariel.oop.practice.calculate.AdditionOperator;
import com.ariel.oop.practice.calculate.DivisionOperator;
import com.ariel.oop.practice.calculate.MultiplicationOperator;
import com.ariel.oop.practice.calculate.SubtractionOperator;

public class Calculator {
	private static final List<NewArithneticOperator> arithneticOperator = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
	
	public static int calculate(int operand1,String operator, int operand2) {
		return ArithneticOperator.calculates(operand1, operator, operand2); // ENUM에 작업 위임
	}
}
