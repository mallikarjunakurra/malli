package com.Student;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class StudenttMain {
	
	
	
	public static void main(String[] args) throws IOException {
	
		//creating objects to a student class
		Studentt a=new Studentt("Daemon","s-11","9632445444");
		Studentt b=new Studentt("Aaemon","s-12","7632445458");
		Studentt c=new Studentt("Aaegon","s-13","6632445458");
		
		//creating a file
		File f=new File("Student");
		FileWriter fw=new FileWriter(f);
		FileReader fr=new FileReader(f);
		
		//writing objects into a file
		fw.write("a");
		fw.write("b");
		fw.write("c");
		//System.out.println(fr.read());
		
		//closing the reader and writer streams
		fw.close();
		fr.close();
		
		System.out.println("\nThe names starts with 'A' are..");
		String s[]= {a.getName(),b.getName(),c.getName()};
		for(int i=0;i<s.length;i++)
		{
		   if(Pattern.matches("[A]\\w+",s[i]))
		    {
				System.out.println(s[i]);		
			}
		}
   }
}
