package com.evergent.Corejava.Strings;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World!";
		StringBuilder reversed = new StringBuilder(str).reverse();
		System.out.println(reversed);
	}

}
