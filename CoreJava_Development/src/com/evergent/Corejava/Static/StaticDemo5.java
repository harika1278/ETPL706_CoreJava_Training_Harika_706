package com.evergent.Corejava.Static;

// Static block : Whenever  class is loaded in JVM, 
//static blocks are initialized first. Static blocks 
//are used database and networking


public class StaticDemo5 {
	static {
		System.out.println("Static Block : open db/network connections");
	}
	static String cname = "India";
	static public void myData() {
		System.out.println("myData");
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();
	}

}
