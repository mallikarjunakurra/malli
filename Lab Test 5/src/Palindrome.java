import java.util.Scanner;

public class Palindrome {

	static void palindrome(String a)
	{	
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
			{b=b+a.charAt(i);}
		
		if (a.equals(b))
		   System.out.println("The entered string is a Palindrome");
		else 
		System.out.println("The entered string is not a Palindrome");
		
	}
	
	
	public static void main(String args[]) {
		
		
        @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a=scan.nextLine();
		
        palindrome(a);
	}
}
