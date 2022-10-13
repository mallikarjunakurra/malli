package com.sum;

public class Summ {

	//method to sum the elements inside given array
     int sum(int[] values, int start, int end) 
	 {
		  start=0;
		  end=values.length;
		 int sum=0;
		 for(int i=0;i<=values.length-1;i++)
		   {
			 sum=sum+values[i];
		   }
		 return sum;
		
      }	 	
}
