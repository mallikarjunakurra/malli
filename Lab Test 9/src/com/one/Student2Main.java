package com.one;

import java.util.ArrayList;
import java.util.ListIterator;

public class Student2Main {

	static ArrayList<Student2>list1;
	static ArrayList<Student2>list2;
	
	//method to fill elements in list
	 public static void fillList()
     {
	    //creating array lists
   	    list1=new ArrayList<>();
   	    list2=new ArrayList<>();
   	  
   	    //creating objects to student2 class
   	    Student2 s1=new Student2("11","Malli","964983");
    	Student2 s2=new Student2("12","Rahul","834232");
    	Student2 s3=new Student2("13","Raju","7342356");
    	Student2 s4=new Student2("14","Vishal","66498");
     	Student2 s5=new Student2("15","Abhi","8834232");
     	Student2 s6=new Student2("16","Prash","763423");
    	
     	//adding elements to the objects
    	list1.add(s1);
    	list1.add(s2);
    	list1.add(s3);
    	list2.add(s4);
    	list2.add(s5);
    	list2.add(s6);
     }
	 
	 //method to print the list
	 public static void printList()
	 { 
		 ListIterator<Student2> itr1=list1.listIterator();
		 System.out.println("List 1 students are...");
		 while(itr1.hasNext())
		 {
			 System.out.println(itr1.next());
		 }
		 
		 ListIterator<Student2> itr2=list2.listIterator();
		 System.out.println("\nList 2 students are...");
		 while(itr2.hasNext())
		 {
			 System.out.println(itr2.next());
		 }
	 }
	 
	public static void main(String[] args) {

		//calling methods to print the lists
		fillList();
		printList();
	}

}
