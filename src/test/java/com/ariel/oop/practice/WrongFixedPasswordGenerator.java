package com.ariel.oop.practice;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

	@Override
	public String generatePassword() {
		return "12";
	}
}
