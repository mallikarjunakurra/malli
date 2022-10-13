package com.mail_Id;

@SuppressWarnings("serial")
public class InvalidMailIdException extends Exception{

	public InvalidMailIdException()
	{
		super();
	}
	
	public InvalidMailIdException(String message)
	{
		super(message);
	}
}