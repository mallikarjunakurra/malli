package com.List_of_directory;
import java.io.File;
import java.io.IOException;
public class Directory {
	public static void main (String args[]) throws IOException {

		//creating a object of folder
		 File f=new File("Malli's Folder");
		 
		 //creating objects of files
		 File f1=new File("Malli's Folder/file 1");
		 File f2=new File("Malli's Folder/file 2");	
		
		 //creating a folder
		 f.mkdir();
		 
		 //creating files
		 f1.createNewFile();
		 f2.createNewFile();
		
		 System.out.println(f.listFiles());
		 
		 //names of folder and files are...
		 System.out.println("\nNames of folder and files are...");
		 System.out.println("Folder name     : "+f.getName());
		 System.out.println("First file name : "+f1.getName());
		 System.out.println("Seconf file name: "+f2.getName());
		 
		 //storing all file objects in a string 
		 File s[]= {f1,f2};
		 
		 System.out.println("\nThe length of the files are...");
		 for(int i=0;i<s.length;i++)
			 System.out.println("length of file "+(i+1)+" is "+s[i].length());
		 
		 System.out.println("\ncanRead properties of the files are...");
		 for(int i=0;i<s.length;i++)
			 System.out.println("File"+(i+1)+": "+s[i].canRead());
		 
		 System.out.println("\ncanWrite properties of the files are...");
		 for(int i=0;i<s.length;i++)
			 System.out.println("File"+(i+1)+": "+s[i].canWrite());
		 
		 System.out.println("\ncanExecute properties of the files are...");
		 for(int i=0;i<s.length;i++)
			 System.out.println("File"+(i+1)+": "+s[i].canExecute());
	}
}
