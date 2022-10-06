import java.util.Scanner;

public class Duplicate {
	
	static void dupChar(String a)
	{
	    char[] ch = a.toCharArray();
	    System.out.print("\nThe duplicate characters in the string are: ");
	    for(int i=0;i< a.length();i++)
	    {
	       for(int j=i+1;j<a.length();j++)
	       {
	         if (ch[i]==ch[j])
	          {
	             System.out.print(ch[j] + " ");
	             break;
	          }
	       }
	     }
	  }
	  
     public static void main(String args[]) {		
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the String: ");
			String a=scan.nextLine();
			
			dupChar(a);
	  }						 
   }		
}