package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
				// Declare the input as Follow
		  		String test = "I am a software tester"; 
		  		
		  		//split the words and have it in an array
		  		String[] str = test.split(" ");
				
				String newStr = "";
		  		
		  		//Traverse through each word (using loop)
		  		for (int i = 0; i<str.length; i++)
		  		{

		  			//System.out.println(str[i]);
		  			//find the odd index within the loop (use mod operator)
		  			if(i % 2 == 1)
		  			{
		  				String rev ="";
		  				char[] char1 = str[i].toCharArray();

		  				for(int j = char1.length-1; j>=0; j--)
		  				{
		  					rev = rev + char1[j];
		  		 			
		  				}
		  				newStr = newStr+rev+" ";
		  				
		 			}
		  			else
		  			{
		  				newStr = newStr+str[i]+" ";
		  				
		  			}
		  		}
		  		
		  		System.out.println(newStr);

	}

}
