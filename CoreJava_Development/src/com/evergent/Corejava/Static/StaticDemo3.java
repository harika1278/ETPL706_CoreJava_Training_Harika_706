package com.evergent.Corejava.Static;

//Static methods can not access non static methods 
//and non static variables

public class StaticDemo3 {
	static String cname = "India";
	String name = "Ravi";
	static public void myData() {
		System.out.println("MyData");
	}
	public void myShow() {
		System.out.println("myShow non Static method");
	}
	public static void main(String[] args) {
		System.out.println(cname);
		myData();
	}

}
