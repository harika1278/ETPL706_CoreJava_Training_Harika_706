package com.evergent.Corejava.Static;

// We can declare static as variables and methods

public class StaticDemo1 {
	static String cname = "India";
	static public void myData() {
		System.out.println("MyData");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();
	}

}
