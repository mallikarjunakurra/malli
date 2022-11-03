package com.three;

import java.util.Comparator;

public class Student4 implements Comparator<Student4>{

	//private data members
	private int id;
	private String name;
	
	//default constructor
	public Student4() 
	{
		super();
	}

	//parameterized constructor
	public Student4(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}

	//Getter and Setter methods for all data members
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Student4 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compare(Student4 o1, Student4 o2) 
	{
		if(o1.id>o2.id)
			return 1;
		else if(o1.id<o2.id)
			return -1;
		else
			return 0;
	}
}
