package day36;
/*
 * 1,������Ķ���:
 *  ������Ϊ�����ṩһ���淶
 *  ���η� abstract ����
 *  {//����
 *     ���η� abstract ����ֵ���� ������(�����б�);
 *  }
 *  ���󷽷�û�з�����:public abstract void test();
 *  ��ͨ�����з�����:public abstract void test(){//�������ڵĴ���}
 *  
 *  1.����һ���࣬���������ǳ����࣬��ô�����������һ�����󷽷�
 *  2.�ڳ������еķ�����һ���ǳ��󷽷������Ǻ��г��󷽷�����һ���ǳ�����
 * 2,�������ʹ��
 *   @Override ��������Ƿ���д�ɹ�
 *   1��һ����̳��˳����࣬�ͱ���Ҫ��д�ó���������еĳ��󷽷���
 *   2�������һ����û����д������ĳ��󷽷�����ô�����ҲҪ����Ϊ������public abstract class SubText extends Test
 */
public abstract class AbstractTest1
{
	//����ĳ��󷽷�������ǹ淶�ľ��巽ʽ
	public abstract void test();//���󷽷�
	
	//������ͨ����
	public void test2()
	{
		System.out.println("������ͨ����");
	}
}
