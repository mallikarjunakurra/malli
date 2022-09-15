public class Rectangle {
    int length;
    int width;
    
    // default Constructor
    Rectangle()
    {
  	  length=0;
  	  width=0;
    }
    
    // parameterized Constructor
    Rectangle(int len,int wid)
    {
  	  length=len;
  	  width=wid;
    }
    
    //  Method for area
    void area()
    {
  	  System.out.println("The area of the Rectangle is "+(length*width));
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		   Rectangle Rec=new Rectangle();
         Rec.area();                                 // calling default area
         
         Rectangle Rec2=new Rectangle(4,6);
         Rec2.area();                               //calling parameterized area
	}
}