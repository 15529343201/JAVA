package day58;
/*
 * ͬ������Java�Ľ������
 *   ͬ������:���߳̽���ͬ��������ʱ�򣬻���ͬ�������������������һ�����
 *          ���������������̲߳�����ִ�б�������������κ�ͬ��������
 *          ֻ����ͬ������ִ�����֮���ͷ������������̲߳���ִ��
 *          synchronized ��������
 *          {
 *          }
 *   ͬ����:
 *          synchronized(��Դ����)
 *          {
 *             //��Ҫ����ͬ���ķ���
 *          }
 */
public class Test 
{
	public static void main(String[] args)
	{
		Print p = new Print();
		Teacher t1 = new Teacher(p,"������",10,11,12);
		Teacher t2 = new Teacher(p,"������",23,56,1);
		Teacher t3 = new Teacher(p,"�ձ���",34,55,90);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
/*
�ձ����Ӣ�ĳɼ�: 34
�����ֵ�Ӣ�ĳɼ�: 23
�����ص�Ӣ�ĳɼ�: 10
�����ֵ����ĳɼ�: 1
�ձ�������ĳɼ�: 90
�����ص����ĳɼ�: 12
�ձ������ѧ�ɼ�: 55
�����ֵ���ѧ�ɼ�: 56
�����ص���ѧ�ɼ�: 11
*/