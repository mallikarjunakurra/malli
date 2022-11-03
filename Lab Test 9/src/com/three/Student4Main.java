package com.three;

import java.util.HashSet;

public class Student4Main {

	
	public static void main(String[] args) {
	
		//creating objects to student3 class
		Student4 s1=new Student4(101,"One");
		Student4 s2=new Student4(102,"Two");
		Student4 s3=new Student4(103,"zee");
		Student4 s4=new Student4(104,"Four");
		Student4 s5=new Student4(105,"Five");
		
		//creating HasSet
		HashSet<Student4>hs=new HashSet<>();
		
		//adding elements to the object
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		
		for(Student4 s:hs)
		{
			if(s.getId()>103)
			{System.out.println(s);}
		}
	}

}
