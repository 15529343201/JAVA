package day54;
/*
 * 2.ʵ��Runnable�ӿ�
 *   class A implements Runnable
 *   {
 *     public void run()
 *     {
 *     }
 *   }
 *   
 *   A a = new A();
 *   Thread t = new Thread(A);
 *   Thread t1 =new Thread(A,"�߳�1");
 * 3.���ַ����ıȽ�
 *   extend Thread  ���̳�
 *   implements Runnable ��ʵ��
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
