package com.evergent.Corejava.Interfaces;

public class BookImpl3 implements Book{
	
	public void bookTitle() {
		System.out.println("Core Java");
	}
	public void bookAuthor() {
		System.out.println("Oracle Crop : "+cname);
	}
	public void bookPrice() {
		System.out.println("Rs 550");
	}
	public void show() {
		System.out.println("Local methods of BookImpl");
	}
	public void myNewbook() {
		System.out.println("MyNewBook");
	}
	public static void main(String[] args) {
		BookImpl3 book1 = new BookImpl3();
		book1.bookAuthor();
		book1.bookTitle();
		book1.bookPrice();
		book1.show();
		book1.myNewbook();
	}

}
