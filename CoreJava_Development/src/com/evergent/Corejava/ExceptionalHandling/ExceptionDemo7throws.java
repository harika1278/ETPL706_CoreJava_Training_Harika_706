package com.evergent.Corejava.ExceptionalHandling;

public class ExceptionDemo7throws {
	String name = null;
	int k = 0;
	public void myData() throws NullPointerException{
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo7throws ex1 = new ExceptionDemo7throws();
			ex1.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle "+e);
		}

	}

}
