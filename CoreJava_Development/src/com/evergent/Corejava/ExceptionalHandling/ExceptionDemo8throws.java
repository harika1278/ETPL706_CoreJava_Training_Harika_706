package com.evergent.Corejava.ExceptionalHandling;

public class ExceptionDemo8throws {
	String name = null;
	int k = 0;
	public void myData() throws NullPointerException{
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	public void myChange() throws NullPointerException{
		myData();
		System.out.println("My Change method");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo8throws ex1 = new ExceptionDemo8throws();
			ex1.myChange();
		}
		catch(Exception e) {
			System.out.println("I can handle "+e);
		}

	}

}
