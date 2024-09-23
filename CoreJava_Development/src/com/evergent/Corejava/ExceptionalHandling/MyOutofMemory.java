package com.evergent.Corejava.ExceptionalHandling;

// Java program to illustrate heap error
public class MyOutofMemory {

	public static void main(String[] args)throws Exception {
		Integer[] array = new Integer[100000 * 100000];
		System.out.println(array);
	}

}
