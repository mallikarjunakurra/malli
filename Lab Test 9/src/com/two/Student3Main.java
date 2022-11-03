package com.two;

import java.util.Iterator;
import java.util.TreeSet;

public class Student3Main {
	
	static TreeSet<Student3>set1;
	
	//method to fill elements in list
	 public static void fillSet()
     {
	    //creating Tree Set 
   	    set1=new TreeSet<>();
   	  
   	    //creating objects to student3 class
   	    Student3 s1=new Student3("1","Malli","964983");
    	Student3 s2=new Student3("2","Rahul","834232");
    	Student3 s3=new Student3("3","Raju","7342356");
    	Student3 s4=new Student3("4","Vishal","66498");
     	Student3 s5=new Student3("5","Abhi","8834232");
     	Student3 s6=new Student3("6","Prash","763423");
    	
     	//adding elements to the object
     	set1.add(s1);
     	set1.add(s2);
     	set1.add(s3);
     	set1.add(s4);
     	set1.add(s5);
     	set1.add(s6);
     }
	 
	 //method to print the list
	 public static void printSet()
	 { 
		 Iterator<Student3> i=set1.iterator();
		 while(i.hasNext())
			 System.out.println(i.next());
		 
		 System.out.println("\nThe first element is\n"+set1.first());
		 System.out.println("\nThe last element is\n"+set1.last());
	 }	
	

	public static void main(String[] args) {

		fillSet();
		printSet();
		
	}
}
