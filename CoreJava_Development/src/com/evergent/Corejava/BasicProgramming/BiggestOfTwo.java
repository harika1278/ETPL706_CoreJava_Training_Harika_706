package com.evergent.Corejava.BasicProgramming;

import java.util.Scanner;

public class BiggestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if(a > b) {
			System.out.println(a +" is greater");
		}
		else {
			System.out.println(b +" is greater");
		}
	}

}
