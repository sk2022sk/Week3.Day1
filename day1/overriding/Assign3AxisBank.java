package week3.day1.overriding;

public class Assign3AxisBank extends Assign3BankInfo

{
	
	public void Deposit() 
	{
		System.out.println("Deposit the Money from AxisBank");
		
	}
	
	public static void main(String[] args) {
		
		Assign3AxisBank object = new Assign3AxisBank();
		
		object.Fixed();
		object.Saving();
		object.Deposit();
	}
	

}
