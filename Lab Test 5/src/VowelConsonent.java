import java.util.Scanner;

public class VowelConsonent {

	static void vowcons(String a)
	{
	   int vcount=0;
	   int ccount=0;
	   for(int i=0; i<a.length(); i++)
	   {
		 a=a.toLowerCase();
		 char b=a.charAt(i);
		 
		 if (b=='a' || b=='e' || b=='i' || b=='o' || b=='u')
		   {
			vcount++;
		   }	    
		 else if (b>='a' && b<='z')
	       {
	    	 ccount++;
	       }
	    }	
	   System.out.println("The number of Vowels in "+a+" is "+vcount);
	   System.out.println("The number of Consonents in "+a+" is "+ccount);
	}
	
	
	public static void main(String args[]) {		
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the String: ");
			String a=scan.nextLine();
			vowcons(a);
		}
	}
}
