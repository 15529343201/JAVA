package day28;
/*
 * ��̬������������ģ��Ͷ���û�й�ϵ
 * �Ǿ�̬��������ĳ������ģ�ÿ�������и����ݵĸ���������̬
 * ����ֻ��һ��
 * 
 * ���ʾ�̬������ͨ��(����.������)�����ʵ�
 */
public class StaticTest
{
	int commonint = 0;//��ͨ����
    static int staticint = 0;//��̬����
    
    StaticTest(int x)
    {
    	this.commonint = x;
    }
    
    public static void main(String[] args)
    {
    	StaticTest s1 = new StaticTest(1);
    	StaticTest s2 = new StaticTest(2);
    	
    	System.out.println("s1.commonint="+s1.commonint);
    	System.out.println("s2.commonint="+s2.commonint);
    	
    	StaticTest.staticint = 1;
    	System.out.println("s1Ϊstaticint��ֵΪ1");
    	System.out.println("s1.staticint="+StaticTest.staticint);
    	System.out.println("s2.staticint="+StaticTest.staticint);
    	System.out.println("s2Ϊstaticint��ֵΪ15");
    	StaticTest.staticint = 15;
    	System.out.println("s1.staticint="+StaticTest.staticint);
    	System.out.println("s2.staticint="+StaticTest.staticint);
    }
}
