package com.evergent.Corejava.ExceptionalHandling;

public class ArrayIndexOutofException13 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		try {
			System.out.println("Accessing element at index 10 : "+numbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught the exception "+e.getMessage());
		}
		System.out.println("Program continues after handling the exception");

	}

}
