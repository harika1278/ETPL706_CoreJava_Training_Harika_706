package com.evergent.Corejava.Abstract;

abstract public class Product3 {
	public Product3() {
		System.out.println("Product3 Abstract Constructor");
	}
	String cname = "India";
	abstract public void newProduct();
	public void allProducts() {
		System.out.println("All Products");
	}
}
