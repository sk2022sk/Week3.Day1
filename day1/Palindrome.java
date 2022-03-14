package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		
	   //Declare A String value as"madam"
 
		String str = "madam";
		
				
	   // Declare another String rev value as ""
	 
		String rev = "";
		
		// Iterate over the String in reverse order
	
		for (int i=str.length()-1; i>=0; --i)
		{
			// Add the char into rev
			char a=str.charAt(i);
			rev = rev + a;
			
		}
				
		
		// Compare the original String with the reversed String, 
		//if it is same then print palinDrome

		System.out.println(rev);

	}

}
