package com.count_vowel;

@SuppressWarnings("serial")
public class Vowel extends Exception{
	
	//creating method to count the no of vowels in given string
	public void countVowels(String a) throws Exception
	{
		
		a=a.toLowerCase();            //converting entire string to Lower case letters
		char[] b=a.toCharArray();     //converting string to character elements
	    int count=0;
		for(int i=0; i<b.length; i++)   //logic to count no of vowels
		   {
			char c=a.charAt(i);
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')		  
			  {
				 if (a.contains("x"))                     //condition to throw exception if given string contains x 
				    throw new Exception("It contains x"); 
				else    
			      count++;
			  }
		    }
		System.out.println("Total no of vowels is: "+count);
	}
}
