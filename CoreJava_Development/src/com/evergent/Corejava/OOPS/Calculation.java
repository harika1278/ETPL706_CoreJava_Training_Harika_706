package com.evergent.Corejava.OOPS;

public class Calculation {
	
	int a = 10,b = 20,c;
	public void addition() {
		c = a + b;
		System.out.println("Addition: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		cal.addition();

	}

}
