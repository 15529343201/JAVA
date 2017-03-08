package day56;

import java.util.Date;

public class TestSleep 
{
	public static void main(String[] args)
	{
//		for(int i = 0; i < 10; i++)
//		{
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	
	
	    while(true)
	    {
		     System.out.println(new Date());
		     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
}
