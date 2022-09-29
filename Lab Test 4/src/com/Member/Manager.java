package com.Member;

// Creating sub-class of member class
public class Manager extends Member {

	//Data members of manager class
	String specialization;
	String department;
	
	
	//Constructor to initialize data members
	Manager(String specialization,String department)
	{
		this.specialization=specialization;
		this.department=department;
	}

	
	//method to print data members
	void info2()
	{
		System.out.println("Department: "+department+"\nSpecialization: "+specialization);
	}
}
