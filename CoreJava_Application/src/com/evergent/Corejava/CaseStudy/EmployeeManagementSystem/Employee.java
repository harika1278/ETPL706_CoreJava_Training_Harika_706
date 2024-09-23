package com.evergent.Corejava.CaseStudy.EmployeeManagementSystem;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empID;
	private String empName;
	private String empDpt;
	
	public Employee(int empID,String empName,String empDpt) {
		this.empID = empID;
		this.empName = empName;
		this.empDpt = empDpt;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	
	public String getEmpDpt() {
		return empDpt;
	}
	
	
}
