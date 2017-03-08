package day55;
/*
 * ���߳�Ӧ��
 * 1.����̲߳���ִ��
 *   Java�����߳�������Ψһ�ܱ�֤����ÿ���̶߳����������ҽ���
 *   �����Ƕ����Ǹ��߳���ִ�У��Ǹ���ִ�У�ʲôʱ��ִ�У���û�б�֤��
 * 2.�߳����ȼ�
 *   Java�����ȼ��ߵ��߳��и���Ŀ����Ի��cpu�����������ȼ��ߵ�����
 *   ��ִ�У�Ҳ�������ȼ��͵��߳����Ǻ�ִ�� 
 */
public class Test 
{
	public static void main(String[] args)
	{
		MyRunnable1 r1 = new MyRunnable1();
		MyRunnable2 r2 = new MyRunnable2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		System.out.println("t1�����ȼ�: " + t1.getPriority());
		System.out.println("t2�����ȼ�: " + t2.getPriority());
		
		//��t1������ߵ����ȼ�
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t1�ı�֮������ȼ���: " + t1.getPriority());
		//��t2������͵����ȼ�
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("t2�ı�֮������ȼ���: " + t2.getPriority());
		
		t1.start();
		t2.start();
	}
}
