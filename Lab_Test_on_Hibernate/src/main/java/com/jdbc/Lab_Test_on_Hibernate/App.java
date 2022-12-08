package com.jdbc.Lab_Test_on_Hibernate;

import java.util.Scanner;

import com.jdbc.Lab_Test_on_Hibernate.Dao.StudentDao;
import com.jdbc.Lab_Test_on_Hibernate.Daoimpl.StudentDaoimpl;
import com.jdbc.Lab_Test_on_Hibernate.Entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	//method calling methods of student
	public static void displayMenu()
	{
		StudentDao std=new StudentDaoimpl();
		
		System.out.println("Press 1. To Create Student :");
		System.out.println("Press 2. To Retrieve Student :");
		System.out.println("Press 3. To Update Student :");
		System.out.println("Press 4. To Delete Student :");
		System.out.println("Press 9. To Exit :");
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice: ");
    	int ch=scan.nextInt();
    	
    	int id;
    	Student st;
    	
    	switch(ch)
    	{
    	case 1:
    	   {
    		   //insertion of student 
    		st=new Student();
    		System.out.println("Enter Student name:");
    		String a=scan.next();
    		System.out.println("Enter Student contact:");
    		String b=scan.next();
    		st.setSname(a);
    		st.setScontact(b);
    		std.insertStudent(st);
    		break;
    	   }
    	case 2:
    	   {
    		   //retrieving a student
    		System.out.println("Enter Student id to retrieve:");
    		id=scan.nextInt();
    		st=std.getStudent(id);
    		System.out.println(st);
    		break;
    	   }
    	case 3:
    	   {
    		   //Updating a student
    		System.out.println("Enter Id to be updated:");
   			id = scan.nextInt();
   			scan.nextLine();
   			System.out.println("Enter new name:");
   			String a=scan.nextLine();
   			std.updateStudent(a,id);
   			break;
    	   }
    	case 4:
    	   {
    		   //Deleting a student
    		st=new Student();
    		System.out.println("Enter Student Id ");
   			id=scan.nextInt();
   			std.deleteStudent(id);
   			break;
    	   }
    	case 9:
    	   {
    		 System.exit(0);
    	   }
    	default:
    	   {
    		   System.out.println("Enter a valid choice ");
    	   }
    	}   
	}
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //calling method 
        displayMenu();
       
    }
}
