package com.evergent.Corejava.OOPS;

public class Person {
	
	String name = "Harika";
	String address = "Manthani";
	int age = 21;
	public void display() {
		System.out.println("Name of the person: "+name);
		System.out.println("Name of the person: "+address);
		System.out.println("Name of the person: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.display();

	}

}
