package day60;
import java.util.ArrayList;
import java.util.Collection;
/*
 * ����:
 *    toArray()
 */
public class Demo4 
{
	public static void main(String[] args)
	{
//		Collection c = new ArrayList();
//	    c.add("��ƻ�");
//	    c.add("��ź�");
//	    c.add("������");
//	    
//	    Object[] arr = c.toArray();//�Ѽ����е�Ԫ��ȫ���洢��һ��Object�������з���
//	    System.out.println("�����Ԫ��: "+Arrays.toString(arr));
	
	    Collection c = new ArrayList();
	    c.add(new Person(110,"����"));
	    c.add(new Person(119,"��ʣ"));
	    c.add(new Person(120,"����"));
	    Object[] arr = c.toArray();
	    //���󣺰ѱ����110������Ϣ���
	    for(int i = 0;i<arr.length;i++)
	    {
	    	Person p = (Person)arr[i];//��Object��ȡ����Ԫ��ֻ��ʹ��Object���������������ܣ������Ҫ����������Ҫ����ǿ��ת��
	    	if(p.id==110)
	    		System.out.println(p);
	    }
	}
}
