package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
	//Declare a String 
		String text1 = "stops";
		
	 //Declare another String
		String text2 = "potss"; 
		boolean status = true;
		
		
		int length1 = text1.length();
		System.out.println("Length of Text1 is :"+length1);
		
		int length2 = text2.length();
		System.out.println("Length of Text2 is :" +length2);
		
	// Check length of the strings are same then (Use A Condition)
	
		if(length1==length2)
		{
		
					
	// Convert both Strings in to characters
	
		char [] arraystr1 = text1.toLowerCase().toCharArray();
		char [] arraystr2 = text2.toLowerCase().toCharArray();
		
	// Sort Both the arrays
	
		Arrays.sort(arraystr1);
		Arrays.sort(arraystr2);
		
	// Check both the arrays has same value
 
		status=Arrays.equals(arraystr1, arraystr2);
		
		if (status)
			
		{
			System.out.println(text1 + " and " +text2+ " String is Anagram ");
			
		}
		else
		{  
			System.out.println(text1 + " and "  +text2+ " String is not a Anagram ");
		}
			
		
		}
	}

}
