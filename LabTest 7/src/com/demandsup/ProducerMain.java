package com.demandsup;

public class ProducerMain {

	public static void main(String args[]) {
		
		//creating object to producer class
		Producer p=new Producer();
		
		DemandThread dt=new DemandThread(p);  //creating object to demand thread class
		SupplyThread st=new SupplyThread(p);  //creating object to supply thread class
		
		dt.start();                     //starting the demand method
		st.start();                     //starting the supply method
	}
}
