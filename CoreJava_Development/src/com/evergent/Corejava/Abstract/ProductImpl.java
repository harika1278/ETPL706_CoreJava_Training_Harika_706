package com.evergent.Corejava.Abstract;

public class ProductImpl extends Product{
	public void newProduct() {
		System.out.println("Local methods of product Impl class");
	}
	
	public static void main(String[] args) {
		ProductImpl p1 = new ProductImpl();
		//p1.show();
		p1.allProduct();
		p1.newProduct();
	}

}
