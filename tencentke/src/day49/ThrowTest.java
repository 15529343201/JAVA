package day49;
/*
 * 1 �ֶ��׳��쳣
 *     throw exception;����exception��ʾҪ�׳����쳣����
 *     ���ö�����throwable������࣬����ֻ����һ��
 */
public class ThrowTest 
{
	public static void main(String[] args) 
	{
		ThrowTest t = new ThrowTest();
		try {
			t.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public void test() throws Exception//�����쳣
	{
		throw new Exception("�����ֶ��׳����쳣");
	}

}

