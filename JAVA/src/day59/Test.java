package day59;
/*
 * ��������:
 *    A�߳���Ҫ������Դ1���ܼ���ִ�У�����Դ1���߳�B��ռ�С�
 *    ���߳�B��Ҫ������Դ2���ܼ���ִ�У�����Դ2���߳�A��ռ��
 *    
 *    �߳�A����ռ����Դ2����Ҫ������Դ1
 *    �߳�B����ռ����Դ1����Ҫ������Դ2
 */
public class Test 
{
	public static void main(String[] args)
	{
		Resource rs1 = new Resource("��Դ1");
		Resource rs2 = new Resource("��Դ2");
		Resource rs3 = new Resource("��Դ3");
		
		MyThread t1 = new MyThread(rs1,rs2,"�߳�1");
		MyThread t2 = new MyThread(rs2,rs3,"�߳�2");
		MyThread t3 = new MyThread(rs3,rs1,"�߳�3");
	
        t1.start();
        t2.start();
        t3.start();
	}
}
