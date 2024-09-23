package com.evergent.Corejava.ExceptionalHandling;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
public class UserDefineExceptionDemo10 {
	// Methods that throws a custom checked exception
	public static void withdraw(double amount) throws InsufficientFundsException{
		double balance = 500.00;
		if(amount > balance) {
			throw new InsufficientFundsException("Insufficient Funds with drawal");
		}
		else {
			System.out.println("Withdrawal successfull!");
		}
	}
	public static void main(String[] args) {
		try {
			withdraw(600); // This will trigger the exception
		}
		catch(InsufficientFundsException e) {
			System.out.println("Caught the exception : "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after handling the exception");
	}

}
