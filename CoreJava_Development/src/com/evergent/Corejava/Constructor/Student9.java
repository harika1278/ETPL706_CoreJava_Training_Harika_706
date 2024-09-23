package com.evergent.Corejava.Constructor;

public class Student9 {
	String name;
	int age;
	//Constructor
	public Student9(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Student9(Student9 s) {
		this.name = s.name;
		this.age = s.age;
	}
	//Method to display student details
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	public static void main(String[] args) {
		//Creating an object of student
		Student9 student1 = new Student9("Bhanu",20); 
		//Creating a copy of student1
		Student9 student2 = new Student9(student1);
		// Display details of student1
		student1.displayDetails();
		//Display details of student2
		student2.displayDetails();
	}

}
