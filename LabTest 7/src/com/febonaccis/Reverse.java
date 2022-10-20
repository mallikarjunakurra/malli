package com.febonaccis;
//creating a Thread class
public class Reverse extends Thread{

	//creating synchronized method for Febonacci series
	synchronized public void reverse()
	{
		System.out.println("The Reverse order of 1 to 10 numbers are...");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	// run method to display the result of fibonacci method
	public void run()
	{
		//method calling in run() method
		reverse();
	}
}
