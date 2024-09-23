package com.evergent.Corejava.BasicProgramming;

import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		if(a > b && a > c) {
			System.out.println(a +" is greater");
		}
		else if(b > a && b > c) {
			System.out.println(b +" is greater");
		}
		else {
			System.out.println(c +" is greater");
		}

	}

}
