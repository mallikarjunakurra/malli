package com.sum;

public class SummMain {

	public static void main(String args[]) {
		
		Summ s=new Summ();
		
		int[] a= {1,3,2,4};
		
		// a NullPointerException when passed a null
		try
	    {
	       s.sum(null,0,0);
	    }
	    catch(NullPointerException ne)
	    {
	       System.out.println(ne);
	    }	
		
		//ArrayIndexOutOfBoundsException when start and end not in range
		try
		{
			s.sum(a,0,0);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
		
		//Exception 
		try
		{
			if (s.sum(a,0,3)==0);
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Finally done...");
		}
		
	}
}
