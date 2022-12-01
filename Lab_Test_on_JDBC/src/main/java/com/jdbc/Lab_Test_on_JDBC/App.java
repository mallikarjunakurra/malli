package com.jdbc.Lab_Test_on_JDBC;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.Lab_Test_on_JDBC_Dao.UsersDao;
import com.jdbc.Lab_Test_on_JDBC_Daoimpl.UsersDaoimpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      System.out.println( "Hello World!" );
        
      UsersDao ud=new UsersDaoimpl();
    	
      System.out.println("1. To Create User:");
	  System.out.println("2. To Update Password:");
	  System.out.println("3. To Delete User:");
	  System.out.println("4. To Retrieve a User:");
	  System.out.println("5. To Retrieve All Users:");
	  System.out.println("9. To Exit:");
      
	  try {
      	
    	@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int ch=scan.nextInt();
        int i=0;
        	
        switch(ch)
        {
        
        case 1:
             {
        	  System.out.println("Enter User name: ");  
        	  String a=scan.next();
        	  System.out.println("Enter password: ");  
        	  String b=scan.next();
        	    	 
              i=ud.insertUser(a,b);
        	  System.out.println(i+" record inserted..");
        	  break;       		
        	 }
             
        case 2:
        	 {
              System.out.println("Enter User name whose password need to be updated: ");  
              String a=scan.next();
        	  System.out.println("Enter new password: ");  
           	  String b=scan.next();
           	  i=ud.updatePassword(a,b);
           	  System.out.println(i+" record updated..");
        	  break;
        	 }
        	 
        case 3:
        	 {
        	  System.out.println("Enter User name: ");  
           	  String a=scan.next();
           	  i=ud.deleteUser(a);
           	  System.out.println(i+" record deleted..");
   		      break;
   	          }
        	 
        case 4:
        	  {
        	   System.out.println("Enter User name: ");  
               String a=scan.next();
        	   ud.displayUser(a);
               break;
        	  }
        	  
        case 5:
        	  {
        	   ud.displayAllUsers();
   		       break;  
        	  }
        	  
        case 9:
        	  {
        	   System.exit(0);
        	  }
          	       
        default:
			    System.out.println("Enter valid choice...");
			    
        }	
			
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
    }
}
