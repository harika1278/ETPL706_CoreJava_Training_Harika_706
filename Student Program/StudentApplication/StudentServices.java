package com.evergent.Corejava.harika.StudentApplication;

public class StudentServices {
	public int addStudentServices(int stuId,String stuName,float stuMarks)
	{
		String grade = "";
		if(stuMarks > 80 && stuMarks <= 100) {
			grade = "A";
		}
		else if(stuMarks > 60 && stuMarks <= 80) {
			grade = "B";
		}
		if(stuMarks > 40 && stuMarks <= 60) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		StudentDAO sd = new StudentDAO();
		StudentBean sb = new StudentBean();
		sb.setstuName(stuName);
		sb.setstuId(stuId);
		sb.setstuMarks(stuMarks);
		sb.setgrade(grade);
		
		int updateResult= sd.addStudent(sb);
		
		return 1;
	}
}
