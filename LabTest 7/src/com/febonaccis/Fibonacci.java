package com.febonaccis;
//creating a Thread class
public class Fibonacci extends Thread {

	//creating synchronized method for Febonacci series
	synchronized public void fibonacci()
	{
		int n1=0;
		int n2=1;
		System.out.println("The Febonacci series is...");
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<=7;i++)
		{
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}		
	}
	
	// run method to display the result of fibonacci method
	public void run()
	{
		//method calling in run() method
		fibonacci();
	}
}
