package com.demandsup;
//creating a class producer
public class Producer {

	//declaring data member
	private int availableProduct=50;
	
	synchronized public void demand(int n)   //synchronizing the demand method
	{
		System.out.println("available products before demanding: "+availableProduct);
		try 
		{
		   if (n>availableProduct)
		   wait();
		   availableProduct=availableProduct-n;
		   System.out.println("available products after Serving: "+availableProduct);
		}
		catch (InterruptedException ie) 
		{
			System.out.println(ie);
		}
	}
	
	synchronized public void supply(int n)  //synchronizing the supply method
	{
		System.out.println("available products before supply: "+availableProduct);
		availableProduct+=n;
		System.out.println("available products after supply: "+availableProduct);
	}
}
