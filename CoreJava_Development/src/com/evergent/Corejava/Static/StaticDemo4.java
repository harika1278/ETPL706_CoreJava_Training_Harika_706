package com.evergent.Corejava.Static;

// Non static methods can access static methods and 
//static variables

public class StaticDemo4 {
	static String cname = "India";
	String name = "Ravi";
	static public void myData() {
		System.out.println("MyData : Static Method");
	}
	public void myShow() {
		System.out.println("myShow non Static method : "+cname);
	}
	public static void main(String[] args) {
		System.out.println(cname);
		myData();
		StaticDemo4 s4 = new StaticDemo4();
		s4.myShow();
	}

}
