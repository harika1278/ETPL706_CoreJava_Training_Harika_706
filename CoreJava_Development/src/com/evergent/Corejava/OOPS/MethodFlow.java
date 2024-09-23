package com.evergent.Corejava.OOPS;

public class MethodFlow {
	
	// No Arguments with No Return Type
	public void display() {
		System.out.println("Display method: Hello");
	}
	
	// Arguments with No Return Type
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	// Arguments with Return Type
	public int myData(int a,int b) {
		return (a*b);
	}
	
	// No Arguments with Return Type
	public int myChange() {
		return 100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow mf = new MethodFlow();
		mf.display();
		mf.add(5, 15);
		int t = mf.myData(5,5);
		System.out.println(t);
		int k = mf.myChange();
		System.out.println(k);

	}

}
