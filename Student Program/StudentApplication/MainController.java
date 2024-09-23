package com.evergent.Corejava.harika.StudentApplication;
import java.util.Scanner;
public class MainController {
	public static void main(String[] args) {
		int stuId=0;
		String stuName="";
		float stuMarks = 0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		stuId=sin.nextInt();
		System.out.println(("Enter Student Name"));
		stuName = sin.next();
		System.out.println("Enter Student Marks");
		stuMarks = sin.nextFloat();
		
		StudentServices studentService = new StudentServices();
		
		int updeateCount=studentService.addStudentServices(stuId,stuName,stuMarks);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record ram Success");
		
		
		
		
	}
}
