package com.jdbc.Lab_Test_on_Hibernate.Dao;

import com.jdbc.Lab_Test_on_Hibernate.Entities.Student;

//creating interface
public interface StudentDao {

	//abstract methods
	
	public boolean insertStudent(Student st);
	
    public Student getStudent(int id);
    
    public boolean deleteStudent(int id);
    
    public boolean updateStudent(String name,int id);
}
