package week3.day1.org.student;

import week3.day1.org.college.College;
import week3.day1.org.department.Department;

public class Student extends Department{
	
	public void StudentName()
	{
		System.out.println("Student Name is SABARINATH");
		this.CollegeCode();
		this.CollegeName();
		this.CollegeRank();
		this.DeptName();
	}
	
	public void StudentDept()
	{
		System.out.println("Student Department is CSE");
	}
	
	public void StudentId()
	{
		System.out.println("Student Id No is : SK001");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * College college1=new College(); college1.CollegeCode();
		 * college1.CollegeName(); college1.CollegeRank();
		 */
		/*
		 * Department depart=new Department(); depart.DeptName(); depart.CollegeCode();
		 * depart.CollegeName(); depart.CollegeRank();
		 */
		
		Student stud=new Student();
		stud.StudentId();
		stud.StudentDept();
		stud.StudentName();
		
	}

}
