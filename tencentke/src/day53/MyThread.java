package day53;
/*
 * 1.�̳�Thread�ഴ���߳�
 * class ���� extends Thread
 * {
 *   public void run()
 *   {
 *         //��ش���
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
			}//100����
			System.out.println("MyThread" + i);
		}
	}

}
