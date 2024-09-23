package com.evergent.Corejava.ram.application3;

public class BankRBI {
	static {
		System.out.println("Welcome to Employee Details");
	}
	public BankRBI() {
		System.out.println("RBI Bank Home Loan and personal loan Interest");
	}
	public BankRBI(double p,double r) {
		System.out.println(p * r/100);
	}
	public static final void getBankDetails() {
		System.out.println("Home loan Interest in 8.5");
		System.out.println("personal loan Interest is 11%");
	}
}
