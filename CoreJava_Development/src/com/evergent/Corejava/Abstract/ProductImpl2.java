package com.evergent.Corejava.Abstract;

public class ProductImpl2 extends Product{
	public void newProduct() {
		System.out.println("My new Product");
	}
	public void show() {
		System.out.println("Local methods of product Impl class");
	}
	public static void main(String[] args) {
		ProductImpl2 p1 = new ProductImpl2();
		p1.show();
		p1.allProduct();
		p1.newProduct();
	}

}
