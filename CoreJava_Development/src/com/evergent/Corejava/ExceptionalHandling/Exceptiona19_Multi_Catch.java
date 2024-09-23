package com.evergent.Corejava.ExceptionalHandling;

public class Exceptiona19_Multi_Catch {
	String name = "null";
	int k = 0;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t = 10/k;
			System.out.println("End");
		}
		catch(NullPointerException | ArithmeticException e) {
			System.out.println("I can handle : "+e);
		}
	}
	public static void main(String[] args) {
		Exceptiona19_Multi_Catch ed2 = new Exceptiona19_Multi_Catch();
		ed2.myData();

	}

}
