package day60;
import java.util.ArrayList;
import java.util.Collection;
/*
 * ���ϣ������Ǵ洢�������ݵļ���������
 * 
 * ���ϱ���������ƣ�
 *    1.���Ͽ��Դ洢�������͵Ķ������ݣ�����ֻ�ܴ洢ͬһ���������͵�����
 *    2.���ϵĳ����ǻᷢ���仯�ģ�����ĳ����ǹ̶��ġ�
 *    
 * -----| Collection �������ϵĸ��ӿ�
 * --------| List �����ʵ����List�ӿڵļ����࣬�߱����ص㣺���򣬿��ظ�
 * --------| Set  �����ʵ����Set�ӿڵļ����࣬�߱��ص㣺���򣬲����ظ�
 * 
 * Collection�еķ���:
 *   ���ӣ�
 *      add(E e) ��ӳɹ�����true�����ʧ�ܷ���false
 *      addAll(Collection c) ��һ��������ӵ�����һ������ȥ
 *   ɾ����
 *      clear() 
 *      remove(Object o)
 *      removeAll(Collection<?> c)
 *      retainAll(Collection<?> c)
 *   �鿴:
 *      size()
 *   �жϣ�
 *      contains(Object o)
 *      containsAll(Collection<?> c)
 *      isEmpty()
 *   ����:
 *      toArray()
 *      iterator()
 */
public class Demo2 
{
	public static void main(String[] args)
	{
		//Collection c = new Collection();//���󣬽ӿڲ���ʵ����
        Collection c = new ArrayList();//ʹ�ö�̬��ʹ��ʵ����
        c.add("abc");
        c.add(1);
        System.out.println("��ӳɹ���?" + c.add(3.15));
        System.out.println("���ϵ�Ԫ��: " + c);
        
        //��������
//        Collection c2 = new ArrayList();
//        c2.add("����");
//        c2.add("������");
//        
//        c.addAll(c2);//��c2��Ԫ����ӵ�c��
        
        //ɾ������
        //c.clear();//clear()��ռ����е�Ԫ��
        //System.out.println("ɾ���ɹ���?" + c.remove(1));//removeָ�������е�Ԫ�أ�ɾ���ɹ�����true��ʧ��false
        //c.removeAll(c2);//ɾ��c��������c2�н���Ԫ�أ�
        //c.retainAll(c2);//����c��������c2�Ľ���Ԫ�أ�������Ԫ��һ��ɾ��
        
        //�鿴
        System.out.println("�鿴����Ԫ�ظ�����" + c.size());
        
        System.out.println("���ϵ�Ԫ��: " + c);
	}
}
