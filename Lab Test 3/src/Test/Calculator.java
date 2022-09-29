package Test;
//creating a class named calculator
public class Calculator {
	
	//Creating a method for addition using varargs....
	
	public double add(int n1,double...n2){
		double a=0;
		System.out.println("The addition of given numbers are....");
		for(int i=0;i<n2.length;i++)
		{
			a+=n2[i];		
		}
		return (a+n1);
	}	
	
	//Creating a method for Subtraction using varargs....
	public double sub(int n1,double...n2){	
		double a=0;
		System.out.println("The Subtraction of given numbers are....");
		for(int i=0;i<n2.length;i++)
		{
			a-=n2[i];		
		}
		return (a-n1);
	}
	
	//Creating a method for Multiplication using varargs....
	public double mult(int n1,double...n2){
		double a=1;
		System.out.println("The Multiplication of given numbers are....");
		for(int i=0;i<n2.length;i++)
		{
			a*=n2[i];		
		}
		return (a*n1);
	}
	
	//Creating a method for Division using varargs....
	public double div(int n1,double...n2){
		double a=1;
		System.out.println("The Division of given numbers are....");
		for(int i=0;i<n2.length;i++)
		{
			a/=n2[i];		
		}
		return (a/n1);
	}

	    // Creating a main method to print all the operational values
		public static void main(String...args) {
			
			Calculator calc=new Calculator();
			
			System.out.println(calc.add(2,3,5,10));
			System.out.println(calc.sub(2,3,5,10));
			System.out.println(calc.mult(2,3,5,10));
			System.out.println(calc.div(2,3,5,10));
		}
}
