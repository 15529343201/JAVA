package day24;
/*
 * ����������
 *   ��һ�����п����ж����������ͬһ������
 *   ֻҪ���ǵĲ�����ͬ�Ϳ��ԣ����ݲ�������
 *   �Ͳ�������������Ҫ���õķ���
 *   
 *   ���أ�������ͬ�ķ������ƣ���ͬ�Ĳ����б�
 *   ��ͬ�Ĳ����б�ָ����:�������Ͳ�ͬ������������ͬ����������ͬ
 *   
 *   public static int sum(int a,int b){}
 *   ������ȷ���Ƿ����ص�ʱ���ж�������sum(int a,int b)
 *   ����public static int �⼸�����������ǲ����
 */
public class Test 
{
	public static void main(String[] args)
	{
		//Compute c = new Compute();
	    int sum = Compute.sum(3, 4);
		//int sum = c.sum(3, 4);
		System.out.println(sum);
		
		int sum1 = Compute.sum(5,1,2);
		System.out.println(sum1);
		
		double sum2 = Compute.sum(4.5,3.9);
		System.out.println(sum2);
	}
}
