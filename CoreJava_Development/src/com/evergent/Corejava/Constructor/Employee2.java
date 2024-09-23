package com.evergent.Corejava.Constructor;
//We can access constructor while creation of object


public class Employee2 {
	int eno;
	String ename;      //step 7
	double sal;
	Employee2(){
		System.out.println("Default Constructor");
	}
	Employee2(int eno1,String ename1,double sal1){
		eno = eno1;			//step 6
		ename = ename1;
		sal = sal1;
	}
	public void display() {  //step 9
		System.out.println("Employee No : "+eno);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+sal);
	}
	public static void main(String[] args) {    //step 1
		new Employee2();						//step 2
		Employee2 emp = new Employee2(123,"raj",55000); //step 4
		emp.display();   //step 8
	}

}
