package day54;
/*
 * 2.实现Runnable接口
 *   class A implements Runnable
 *   {
 *     public void run()
 *     {
 *     }
 *   }
 *   
 *   A a = new A();
 *   Thread t = new Thread(A);
 *   Thread t1 =new Thread(A,"线程1");
 * 3.两种方法的比较
 *   extend Thread  单继承
 *   implements Runnable 多实现
 */
public class MyThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("MyThread" + i);
		}
	}
}
