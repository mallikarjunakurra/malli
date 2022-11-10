package com.Employees;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeMain {

	public static void main(String[] args) {
		
		//Instances of Employee class
		Employee e1=new Employee("Malli",22,"Devops",15000f);
		Employee e2=new Employee("Aali",20,"As devops",12000f);
		Employee e3=new Employee("Surya",25,"Tester",10000f);
		Employee e4=new Employee("Laxman",23,"Manual",8000f);
		Employee e5=new Employee("Bravo",26,"Helper",10000f);
		Employee e6=new Employee("Levis",29,"Assist",9000f);
		
		//Creatin object of ArrayList
		List<Employee>s=new ArrayList<>();
		
		//Adding instances to list
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		s.add(e6);
		
// 1. Printing the List Sorted on their name
		System.out.println("Sorted list by names...\n"+
                s.stream().
				sorted((a,b)->a.getName().compareTo(b.getName())).
				collect(Collectors.toList()));

		
// 2. filtering and printing employees whose salary is above 10000 
		System.out.println("\nEmployees whose salary above 10000\n"+
                s.stream().
				filter((f1)->f1.getSalary()>10000).
				collect(Collectors.toList()));

// Total no.of employees having salary  greater than 10000
		System.out.println("Count: "+
                s.stream().
				filter((f1)->f1.getSalary()>10000).count());


// 3.Printing employee name and department whose salary is maximum.		
		System.out.println("\nDetails of max salary person:\n"
               +s.stream().
				max((a,b)->a.getSalary()>b.getSalary()?1:-1).
				map(p->"Name: "+p.getName()+"\nDepartment: "+p.getDepartment()).
				get());
		
	}

}
