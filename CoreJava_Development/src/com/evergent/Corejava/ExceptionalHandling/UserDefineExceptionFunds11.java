package com.evergent.Corejava.ExceptionalHandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class UserDefineExceptionFunds11 {
	public static void checkAge(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18 or older");
		}
		else {
			System.out.println("Access granted - You are old enough");
		}
	}
	public static void main(String[] args) {
		try {
			checkAge(16); // This will trigger the exception
		}
		catch(InvalidAgeException e) {
			System.out.println("Caught the exception : "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after handling the exception");
	}

}
