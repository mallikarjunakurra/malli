package com.Employees;

public class Employee {

	//Data members
	private String name;
	private int age;
	private String department;
	private float salary;
	
	//Default Constructor
	public Employee() {
		super();
		
	}

	//Parameterized Constructor
	public Employee(String name, int age, String department, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}

	//Getter and Setter methods for all the data members
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	//Overriding Tostring method to convert byte code to String
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
