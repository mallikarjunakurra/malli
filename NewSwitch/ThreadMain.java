
public class ThreadMain {

	public static void main(String args[]) {
		
		MyThread1 a=new MyThread1();
		MyThread1 b=new MyThread1();
		
		a.start();
		b.start();
	}
}
