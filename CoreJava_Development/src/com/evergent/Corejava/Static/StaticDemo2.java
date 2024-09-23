package com.evergent.Corejava.Static;

//We can access static variables and static methods direct 
//through classname.methodname and classname.variablename

public class StaticDemo2 {
	static String cname = "India";
	static public void myData() {
		System.out.println("MyData");
	}
	public static void main(String[] args) {
		System.out.println(cname);
		myData();
		System.out.println(StaticDemo2.cname);
		StaticDemo2.myData();
	}

}
