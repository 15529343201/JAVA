package day61;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
/*
 * ------| Collection �������ϵĸ��ӿ�
 *         | List �����ʵ����List�ӿڵļ����࣬�ü�����߱����ص㣺���򣬿��ظ�
 *         | Set �����ʵ����Set�ӿڵļ����࣬�ü��Ͼ߱����ص㣺���򣬲����ظ�
 *       Collection----�����ķ���:
 *          toArray()
 *          iterator()
 *������������:��������ץȡ�����е�Ԫ��
 *   hasNext()
 *     ���Ƿ�����һ��Ԫ�أ������Ԫ�ؿ��Ա���������true������false
 *   next()
 *     ���Ԫ�ء�����
 *   void remove
 *   
 *NoSuchElementException û��Ԫ�ص��쳣
 *  ���ֵ�ԭ��û��Ԫ�ؿ��Ա�ȡ���ˡ�����
 *
 */
public class Demo2 
{
	public static void main(String[] args)
	{
		Collection c = new ArrayList();
		c.add("����");
		c.add("��ʣ");
		c.add("����");
		c.add("����");
		//�������ϵ�Ԫ��-----����ʽһ������ʹ��toArray()����
//		Object[] arr = c.toArray();//�Ѽ��ϵ�Ԫ�ش洢��һ��Object���鷵��
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]+",");
//		}
		
		//Ҫ��ʹ��iterator����������
		Iterator it = c.iterator();//����һ�������� ���ʣ�iterator()��������һ���ӿ����ͣ�Ϊʲô�ӿ��ֿ��Ե��÷�������ʹ����?
	    //iteratorʵ���Ϸ��ص���iterator�ӿڵ�ʵ�������
		//System.out.println("��Ԫ�ؿ��Ա�����?"+it.hasNext());
		//System.out.println("��ȡԪ��: "+it.next());
//		while(it.hasNext())//hasNext()���Ƿ���Ԫ�ؿ��Ա���
//		{
//			System.out.println("��ȡԪ��: "+it.next());
//		}
		
		while(it.hasNext())
		{
			it.next();
		    it.remove();//ɾ�����������һ�η��ص�Ԫ��
		}
		System.out.println("���ϵ�Ԫ��: "+c);
	}
}
