package assignment13;
import java.lang.*;
import java.util.*;

class print 
{
	synchronized public void printe()
	{
		 {
			  
					int i;
					for(i=0;i<1000;i++)
						System.out.println(i);
					System.out.println();
				
                    }
		 
}
}
class MyThread1 extends Thread{  
print p2;  
MyThread1( print p2){  
this.p2=p2;  
}  
public void run(){  
p2.printe();  
}  
  
}  
class MyThread2 extends Thread{  
print p1;  
MyThread2(print p1){  
this.p1=p1;  
}  
public void run(){  
p1.printe();  
}  
}  

public class assignment13  {

	public static void main(String[] args) {
		print p1=new print();
		MyThread1 t1=new MyThread1(p1);
		MyThread2 t2=new MyThread2(p1);
		t1.start();
		t2.start();
		
		
		
	}

}
