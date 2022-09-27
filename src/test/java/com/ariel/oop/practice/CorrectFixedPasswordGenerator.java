package com.ariel.oop.practice;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {
	
	@Override
	public String generatePassword() {
		return "12345678";
	}
}
