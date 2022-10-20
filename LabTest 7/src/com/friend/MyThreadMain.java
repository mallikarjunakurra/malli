package com.friend;

//creating a main class
public class MyThreadMain {

	//main method to create objects and to start run() method
	public static void main(String[] args) {
	
		//creating 3 objects a,b & c 
		MyThread a=new MyThread();
		MyThread b=new MyThread();
		MyThread c=new MyThread();
		
		//start method to run the thread class
		a.start();
		b.start();	
		c.start();	
	}		
}