package com.count_vowel;

public class VowelMain {

	public static void main(String[] args) {
	
		Vowel v=new Vowel();
		
		try
		{
			v.countVowels("malliexk");
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}

}
