package com.evergent.Corejava.CaseStudy.EmployeeManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagementSystem {
		private HashMap<Integer,Employee> employeeMap;
		 public EmployeeManagementSystem () {
			 this.employeeMap = new HashMap<>();
		}
		// Add a new employee
		    public void addEmployee(Employee employee) {
		        employeeMap.put(employee.getEmpID(), employee);
		    }
		 // Retrieve employee details using ID
		    public Employee getEmployee(int id) {
		        return employeeMap.get(id);
		    }


}
