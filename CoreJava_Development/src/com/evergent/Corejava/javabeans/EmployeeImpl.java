package com.evergent.Corejava.javabeans;

public class EmployeeImpl {
	
	public static void main(String[] args) {
		EmployeeBean emp = new EmployeeBean();
		// Initializing values into the beans
		emp.setEno(100);
		emp.setEname("Ravi");
		emp.setSal(50000);
		// getting the data from beans
		System.out.println("Employee No : "+emp.getEno());
		System.out.println("Employee Name : "+emp.getEname());
		System.out.println("Employee sal : "+emp.getSal());
	}

}
