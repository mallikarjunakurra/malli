package com.Member;

//Creating sub-class of member class
public class Employee extends Member {

	//Data members of Employee class
	String specialization;
	String department;
	
	
	//Constructor to initialize data members
	Employee(String specialization,String department)
	{
		this.specialization=specialization;
		this.department=department;
	}
	
	
	//method to print data members
	void info1()
	{
		System.out.println("Department: "+department+"\nSpecialization: "+specialization);
	}
}
