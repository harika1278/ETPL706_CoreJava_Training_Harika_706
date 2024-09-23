package com.evergent.Corejava.LogicalProgramming1;

public class FibonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		for(int i = 1; i <= 5; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" "+c+" ");
		}

	}

}
