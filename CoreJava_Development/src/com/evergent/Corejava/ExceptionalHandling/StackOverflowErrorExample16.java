package com.evergent.Corejava.ExceptionalHandling;

public class StackOverflowErrorExample16 {

	public static void main(String[] args) {
		try {
			recursiveMethod(); // Start the recursive method
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverflowError Caught : " +e.getMessage());
			//e.PrintStacktrace();
		}
	}
	//Recursive method with no base case
	public static void recursiveMethod() {
		recursiveMethod(); // The method keeps calling istself
	}

}
