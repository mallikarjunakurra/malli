public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=12;
        int b=15;
        int c=20;
        if (a>b)
        {
        	if(b>c)       	
        		System.out.println("a is the greatest "+a);   
        }
        else if(b>a)
        {
        	if(b>c)
        		System.out.println("b is the greatest "+b);
        	else
        		System.out.println("c is the greatest "+c);
        }
       
	}
}