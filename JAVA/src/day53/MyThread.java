package day53;
/*
 * 1.继承Thread类创建线程
 * class 类名 extends Thread
 * {
 *   public void run()
 *   {
 *         //相关代码
 *   }
 * }
 */
public class MyThread extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//100毫秒
			System.out.println("MyThread" + i);
		}
	}

}
