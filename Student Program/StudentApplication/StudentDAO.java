package com.evergent.Corejava.harika.StudentApplication;

import java.util.ArrayList;

public class StudentDAO {
					
	public int addStudent(StudentBean studentBean)
	{
		try{
			ArrayList<Comparable> bookList=new ArrayList<Comparable>();
			bookList.add(studentBean.getstuId());
			bookList.add(studentBean.getstuName());
			bookList.add(studentBean.getstuMarks());
			bookList.add(studentBean.getgrade());	
			
			System.out.println(bookList);
			
			System.out.println("Book ID :"+studentBean.getstuId());
			System.out.println("Book Name :"+studentBean.getstuName());
			System.out.println("Book Marks :"+studentBean.getstuMarks());
			System.out.println("Book Grade :"+studentBean.getgrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}


}
