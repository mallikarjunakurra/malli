package com.jdbc.Lab_Test_on_Spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.Lab_Test_on_Spring.Dao.StudentDao;
import com.jdbc.Lab_Test_on_Spring.Entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao sdao = (StudentDao) ac.getBean("stdao");
		
	   
		Student std1= new Student(1, "Malli");
		Student std2= new Student(2, "Rahul");
		Student std3= new Student(3, "Vishal");

		sdao.insertStudent(std1);
		sdao.insertStudent(std2);
		sdao.insertStudent(std3);

		std1= sdao.getStudent(1);
		List<Student> slist = sdao.getAllStudents();

		System.out.println(slist);
  
    }
}
