package com.evergent.Corejava.LogicalProgramming1;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
