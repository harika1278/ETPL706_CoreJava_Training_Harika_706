package com.evergent.Corejava.javabeans;

public class ProductBean {
	private int pno;
	private String pname;
	private double price;
	public ProductBean(int pno, String pname, double price) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	public double getPrice() {
		return price;
	}
	
}
