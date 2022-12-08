package com.jdbc.Lab_Test_on_Hibernate.Daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jdbc.Lab_Test_on_Hibernate.Dao.StudentDao;
import com.jdbc.Lab_Test_on_Hibernate.Entities.Student;
import com.jdbc.Lab_Test_on_Hibernate.HiberUtil.HiberUtil;

public class StudentDaoimpl implements StudentDao{

	//creating object of session provider class
	Session ses=HiberUtil.getSession();
	
	//inserting student
	public boolean insertStudent(Student st) 
	{
		Transaction tx = ses.beginTransaction();
		ses.save(st);
		tx.commit();
		ses.close();
		return true;
	}
	

	//getting student
	public Student getStudent(int id) 
	{
		return ses.get(Student.class,id);
	}
	

	//updating a student
	public boolean updateStudent(String name,int id) 
	{
		Transaction tx=ses.beginTransaction();
		Student b=ses.get(Student.class,id);
		b.setSname(name);
		ses.update(b);
		tx.commit();
		ses.close();
		return true;
	}
	
	
	//deleting a student
	public boolean deleteStudent(int id)
	{
		Transaction tx=ses.beginTransaction();
		Student b=ses.get(Student.class,id);
		ses.delete(b);
		tx.commit();
		ses.close();
		return true;
	}
	

}
