package week3.day1;

import java.lang.String;

public class StringMethods {

	public static void main(String[] args) {

    String Text1 = " Testleaf is located in Teynampet and above tacobell";
    String lowertext = Text1.toLowerCase();
    System.out.println(lowertext);
    
    String[] split = lowertext.split(lowertext);
    
    for (int i=0; i<=split.length;i++)
    {
    	System.out.println(split);
    	
    }
    
    
    
    
    
    		
		

	}

}
