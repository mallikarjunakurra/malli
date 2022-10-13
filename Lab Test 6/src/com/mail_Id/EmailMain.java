package com.mail_Id;

public class EmailMain {

   public static void main(String[] args) {

	   //creating object to EmailId() class
		EmailId e=new EmailId();
		
			try 
			{
				e.validateEmail("mallik44@gmail.com");
			} 
			catch (InvalidMailIdException e1)
			{
				e1.printStackTrace();
			}
		    
			finally
			{
				System.out.println("Finally done...");
			}
	}

}
