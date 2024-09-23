package com.evergent.Corejava.javabeans;

public class StudentImpl {

	public static void main(String[] args) {
		StudentBean stu = new StudentBean();
		stu.setSno(100);
		stu.setSname("Ramesh");
		stu.setAddress("HYD");
		System.out.println(stu);
	}

}
