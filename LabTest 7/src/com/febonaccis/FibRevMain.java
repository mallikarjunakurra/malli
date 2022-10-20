package com.febonaccis;

//main class for two thread classes
public class FibRevMain {

	//main method to instantiate two thread classes
	public static void main(String args[]) throws InterruptedException {
		
		Fibonacci fb=new Fibonacci();    //creating objects to two thread classes
		Reverse rv=new Reverse();
		
		fb.start();                      //Starting the methods to display output
		rv.start();
	}
}
