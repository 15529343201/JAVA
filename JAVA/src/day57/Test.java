package day57;
/*
 * 1.线程同步问题的由来
 *   多个线程共享资源没有进行控制
 */
public class Test 
{
	public static void main(String[] args)
	{
		Print p = new Print();
		Teacher t1 = new Teacher(p,"博尔特",10,11,12);
		Teacher t2 = new Teacher(p,"加特林",23,56,1);
		Teacher t3 = new Teacher(p,"苏炳添",34,55,90);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
