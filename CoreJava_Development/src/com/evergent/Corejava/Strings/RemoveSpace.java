package com.evergent.Corejava.Strings;

public class RemoveSpace {

	public static void main(String[] args) {
		String str = "hello world, this is a test";
		String noSpace = str.replace(" ","");
		System.out.println(noSpace);

	}

}
