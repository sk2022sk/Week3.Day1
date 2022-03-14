package week3.day1.overloading;

public class Assign4Students {
	
	public void getStudentInfo(int id) {
	 
				System.out.println("This is Student ID : "+id);
		
	}
	
	public void getSudentInfo(int id, String name) 
	{
		System.out.println("This is Student ID : "+id+" and Student Name is "+name);
	}

	public void getStudentInfo(String Email, long phone ) 
	{
		System.out.println("This is Student Email ID : " +Email+" and Phone Number is : " +phone);
	}
	public static void main(String[] args) {
		

		Assign4Students stud = new Assign4Students();
		stud.getStudentInfo(54321);
		stud.getSudentInfo(54321,"SABARI");
		stud.getStudentInfo("sabari@gmail.com",9876543210L);
	
			
	}

}
