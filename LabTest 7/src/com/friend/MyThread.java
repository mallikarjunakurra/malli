package com.friend;
//creating a thread class
public class MyThread extends Thread {

	//default constructor
	public MyThread() 
	{
		super();
	}

	//parameterized constructor
	public MyThread(String name) 
	{
		super(name);
	}

	//run method to print names
	public void run()
	{
		String names[]= {"malli","rahul","raju","abhi","vishal","saurab","prashant","sury","venky","laxman"};
		System.out.println("The names of the 10 friends are...");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}	
}
