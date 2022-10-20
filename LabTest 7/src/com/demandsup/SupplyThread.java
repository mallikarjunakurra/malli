package com.demandsup;

//creating a threadclass for Supply method
public class SupplyThread extends Thread{

	private Producer p;                //declaring Producer class a varaiable

	public SupplyThread(Producer p)    // constructor
	{
		super();
		this.p = p;
	}
	
	public void run()                  //run method to call Suply method
	{
		p.supply(30);                  //calling supply() method
	}
}
