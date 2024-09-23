package com.evergent.Corejava.ram.application3;

public class EmployeeInformation  extends BankAccountDetails implements EmployeeInterface{
	
	int empno;
	double sal;
	String address;
	// Interface override methods
	public void employeeInfo(int eno,float sal){
		this.empno = eno;
		this.sal = sal;
	}
	public void employeeAddress(String add) {
		this.address = add;
	}
	public void employeeDetails() {
		System.out.println("Employee No : "+empno);
		System.out.println("Employee Sal : "+sal);
		System.out.println("Employee Address : "+address);
	}
	// Abstract class implementation
	public void accountDetails() {
		System.out.println("My =account details is : 123456789");
	}
	public void show() {
		System.out.println("This is show local method");
	}
	public static void main(String[] args) {
		// Interface methods calling
		EmployeeInformation emp = new EmployeeInformation();
		emp.employeeInfo(100,5000);
		emp.employeeAddress("Bangalore");
		emp.employeeDetails();
		// Abstract class
		emp.accountDetails();
		emp.bankDetails();
		//Call local method
		emp.show();
		// calling Bank RBI with HAS - A
		BankRBI rbi = new BankRBI();
		BankRBI rbi1= new BankRBI(3.3,3.3);
		BankRBI.getBankDetails();
	}

}
