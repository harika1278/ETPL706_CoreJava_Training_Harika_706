package com.evergent.Corejava.Final;
// final methods we can't overirde
class MyClass1{
	final public void myProducts() {
		System.out.println("All Products");
	}
}
public class FinalDemo3 extends MyClass1{
	final String cname = "India";
	public void myProducts1() {
		System.out.println("new product");
	}

	public static void main(String[] args) {
		FinalDemo3 fd1 = new FinalDemo3();
		fd1.myProducts();
		fd1.myProducts1();

	}

}
