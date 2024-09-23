package com.evergent.Corejava.BasicProgramming;
import java.util.*;
public class BiggestOgFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		scan.close();
		if(a > b && a > c && a > d && a > e){
			System.out.println(a+" is greater");
		}
		else if(b > a && b > c && b > d && b > e){
			System.out.println(b+" is greater");
		}
		else if(c > a && c > b && c > d && c > e){
			System.out.println(c+" is greater");
		}
		else if(d > a && d > b && d > c && d > e){
			System.out.println(d+" is greater");
		}
		else {
			System.out.println(e+" is greater");
		}
	}

}
