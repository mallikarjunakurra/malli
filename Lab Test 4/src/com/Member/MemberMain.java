package com.Member;

public class MemberMain {

	public static void main(String args[]) {
		
		// Creating objects to Employee class
		Member emp=new Employee("Employee","Development");
		Employee e=new Employee("Employee","Development");
		
		//Creating objects to Manager class
		Member mng=new Manager("Manager","Management");
		Manager m=new Manager("Manager","Management");
		
		// Assigning employee values to data members of member class
		emp.Name="Malli";
		emp.Age="25";
		emp.Phone_number="9640836793";
		emp.Address="Chembur, Mumbai";
		emp.Salary=35000;
		
		// Assigning Manager values to data members of member class
		mng.Name="Ragnar";
		mng.Age="30";
		mng.Phone_number="9502794498";
		mng.Address="Kurla, Mumbai";
		mng.Salary=50000;
		
		
		// Printing the details of Employee...
		System.out.println("The Employee details are.....");
		//calling employee method
		e.info1();                  
		System.out.println("Name: "+emp.Name+"\nAge: "+emp.Age+"\nPhone Number: "+emp.Phone_number+"\nAddress: "+emp.Address);
		//calling employee salary
		emp.printSalary();       
		
		
		// Printing the details of Manager...
		System.out.println("\nThe Manager details are.....");
		//calling method for manager method
		m.info2();
		System.out.println("Name: "+mng.Name+"\nAge: "+mng.Age+"\nPhone Number: "+mng.Phone_number+"\nAddress: "+mng.Address);
		//calling method for manager salary
		mng.printSalary();
	}
}
