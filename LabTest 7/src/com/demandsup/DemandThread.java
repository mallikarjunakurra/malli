package com.demandsup;

//creating a threadclass for demand method
public class DemandThread extends Thread{

	private Producer p;                  //declaring Producer class a varaiable

	public DemandThread(Producer p)      // constructor
	{
		super();
		this.p = p;
	}

	public void run()                     //run method to call demand method
	{
		p.demand(75);                     //calling demand() method
	}
}
