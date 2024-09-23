package com.evergent.Corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		ProductBean product = new ProductBean(10,"Laptop",85000);
		System.out.println("Product No : "+product.getPno());
		System.out.println("Product No : "+product.getPname());
		System.out.println("Product No : "+product.getPrice());
	}

}
