package com.evergent.Corejava.Strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str = "Java is a powerful programming language";
		String[] words = str.split(" ");
		for(String w : words) {
			System.out.println(w);
		}
	}

}
