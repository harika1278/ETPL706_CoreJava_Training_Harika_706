package com.evergent.Corejava.Constructor;

//super keyword always call super class constructor

class MyEmployee{
	int eno;
	public MyEmployee() {
	}
	public MyEmployee(int eno) {
		System.out.println("MyEmployee No : "+eno);
	}

}
public class Employee6 extends MyEmployee{
	String ename;
	double sal;
	Employee6(){
		System.out.println("Default Constructor");
	}
	Employee6(int eno,String ename,double sal){
		super(eno);
		this.ename = ename;
		this.sal = sal;
	}
	public void display() {
		System.out.println("Employee No : "+eno);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+sal);
	}
	public static void main(String[] args) {
		new Employee6();
		Employee6 emp = new Employee6(123,"raj",55000);
		emp.display();
	}

}
