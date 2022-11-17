package com.Palindrome;

public class Palindrome {

	public boolean palindrome(String a)
	{
        String b="";
		for(int i=a.length()-1;i>=0;i--)
			{b=b+a.charAt(i);}
		
		if (a.equals(b))
			return true;
		else
			return false;
	}
	
}
