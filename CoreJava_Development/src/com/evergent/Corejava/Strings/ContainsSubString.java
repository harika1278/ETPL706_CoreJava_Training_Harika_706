package com.evergent.Corejava.Strings;

public class ContainsSubString {

	public static void main(String[] args) {
		String str = "the quick brown oooofox jumps over the lazy dog";
		String substr = "fox";
		boolean contains = str.contains(substr);
		System.out.println("Contains "+substr+" : "+contains);
	}

}
