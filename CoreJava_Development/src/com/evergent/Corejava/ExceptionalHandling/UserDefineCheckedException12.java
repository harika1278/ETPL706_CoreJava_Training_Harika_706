package com.evergent.Corejava.ExceptionalHandling;

class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class UserDefineCheckedException12 {
	// methods that throws the custom unchecked exception
	public static void validateScore(int score) {
		if(score < 0 || score > 100) {
			throw new InvalidScoreException("Score must be between 0 and 100");
		}
		else {
			System.out.println("Score is valid");
		}
	}
	public static void main(String[] args) {
		try {
			validateScore(110); // This will trigger the exception
		}
		catch(InvalidScoreException e) {
			System.out.println("Caught the exception : "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after handling the exception");
	}

}
