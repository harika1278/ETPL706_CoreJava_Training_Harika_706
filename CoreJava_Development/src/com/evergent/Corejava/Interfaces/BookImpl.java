package com.evergent.Corejava.Interfaces;

public class BookImpl implements Book{
	
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
	public static void main(String[] args) {
		BookImpl book1 = new BookImpl();
		book1.bookAuthor();
		book1.bookTitle();
		book1.bookPrice();
		book1.show();
	}

}
