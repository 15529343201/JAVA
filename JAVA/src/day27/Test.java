package day27;
/*
 * �������͵Ĳ�������
 *   java��ֻ��ֵ���ݣ��������Ͷ�����⣬ֱ�Ӵ�ֵ
 *                 ���������أ����ݵ������ã���������þ���ֵ
 *   ��������������Ϊ����,ֱ�Ӳ���
 *   ����������Ϊ������������������ָ��Ķ��ڴ��еĶ���
 */
public class Test 
{
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.name = "С��";
		a.skin = "��ɫ";
		a.type = "С��";
		
		printAnimal(a);
	}
	
	public static void printAnimal(Animal a)
	{
		System.out.println("������:"+a.name+
		 ",��ɫ��:"+a.skin+",Ʒ����:"+a.type);
	}
}
