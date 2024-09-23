package com.evergent.Corejava.Final;

// final methods can't override

final class MyClass{
	final public void myProduct() {
		System.out.println("All products");
	}
}

public class FinalDemo2  {
	final String cname = "India";
	public void myProduct() {
		System.out.println("New product");
	}
	public void myData(){
		System.out.println(cname);
	}
	public static void main(String[] args) {
		FinalDemo2 fd1 = new FinalDemo2();
		fd1.myData();
		fd1.myProduct();
	}
		
		

	}


