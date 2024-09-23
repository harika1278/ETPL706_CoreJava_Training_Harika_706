package com.evergent.Corejava.ExceptionalHandling;

//Custom Exception Class
class InvalidPasswordException extends Exception {
 public InvalidPasswordException(String message) {
     super(message);
 }
}

public class PasswordValidator {
	 public static void validatePassword(String password) throws InvalidPasswordException {
	        if (password == null || password.length() < 8) {
	            throw new InvalidPasswordException("Password must be at least 8 characters long.");
	        }
	        // Additional password checks can go here (e.g., contains special characters, digits, etc.)
	        System.out.println("Password is valid.");
	    }

	    public static void main(String[] args) {
	        String password = "pass"; // Example of an invalid password

	        try {
	            validatePassword(password);
	        } catch (InvalidPasswordException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
