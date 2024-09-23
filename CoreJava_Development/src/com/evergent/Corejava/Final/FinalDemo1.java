package com.evergent.Corejava.Final;

// final variable we can not modify
public class FinalDemo1 {
	final String cname = "India";
	public void myData() {
		// The final field FinalDemo1.cname cannot be assigned 
		// cname = "Welcome";
		System.out.println(cname);
	}

	public static void main(String[] args) {
		FinalDemo1 fd1 = new FinalDemo1();
		fd1.myData();
	}

}
