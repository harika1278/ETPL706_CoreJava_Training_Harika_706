package com.evergent.Corejava.Abstract;

public class ProductImpl3 extends Product3 {
	public ProductImpl3() {
		System.out.println("ProductImpl sub class constructor");
	}
	public void newProduct() {
		System.out.println("My new product");
	}
	public void show() {
		System.out.println("Local method");
	}
	public static void main(String[] args) {
		Product3 p1 = new ProductImpl3();

	}

}
