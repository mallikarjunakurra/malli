package com.mail_Id;

public class EmailId {
//Creating a method to verify mail ID
 public void validateEmail(String a) throws InvalidMailIdException
  {
	if(a.contains("@")&& a.contains("."))
      {
	   if(a.endsWith(".") || a.endsWith("@") || a.contains(" ") || a.indexOf("@")>a.indexOf("."))
		 {
		   //method throws exception if condition gets true
		   throw new InvalidMailIdException("please enter a valid Email...");
		 }
	   else System.out.println("This is a valid Email ID: "+a);
      }
	}
}	