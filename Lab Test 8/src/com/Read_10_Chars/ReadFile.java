package com.Read_10_Chars;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
	
	  //creating a file
      File f=new File("ReadChars");
      //Creating a Random access file
      RandomAccessFile raf = new RandomAccessFile(f,"rw");;
	 
      //Writing a string into a file
	  raf.writeChars("There is a beast beneath the boards");
      long a=raf.length()-10;
      raf.seek(a);
      for(int i=0;i<=10;i++)          //logic to print last 10 characters
	  {
	    System.out.println((char)raf.read());
	  }
  }
}
