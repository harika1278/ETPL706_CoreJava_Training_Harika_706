package com.evergent.Corejava.Immutable;

public class MyData {

	public static void main(String[] args) {
		ImmutableString str = new ImmutableString("Hello,String World!");
		System.out.println(str.toString());
	}

}
