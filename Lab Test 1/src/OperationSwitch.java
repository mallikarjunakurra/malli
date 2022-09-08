
public class OperationSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1=10;
        int n2=20;
        char ch='*';
        switch(ch)
        {
        case '+': System.out.println("addition of n1 and n2 is "+(n1+n2));
        break;
        case '-': System.out.println("subtraction of n1 and n2 is "+(n1-n2));
        break;
        case '*': System.out.println("multiplication of n1 and n2 is "+(n1*n2));
        break;
        case '/': System.out.println("division of n1 and n2 is "+(n1/n2));
        break;
        case '%': System.out.println("modulus of n1 and n2 is "+(n1%n2));
        break;
        default: System.out.println("Invalid operator");
        }
	}

}
