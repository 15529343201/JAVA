package day23;
/*���췽��
 * ���������ڳ�ʼ������
 * ���е����ֱ���ȫ������Ϊ0
 * ���е�boolean����ȫ������Ϊfalse
 * ���еĶ������ȫ������Ϊnull
 */
/*
 * ����Լ��Ĺ��췽��
 *   �������Ʊ�������������ͬ
 *   û�з���ֵ
 */
/*
 * ����Լ�д���вεĹ��췽������ô�������������ṩ
 * Ĭ�ϵĹ��췽����
 * ������ǻ������޲εĹ��췽����
 * ��ô��Ҫ�ֶ�ʵ��
 */
public class People 
{
	String name;
	String sex;
	int age;
	
	//�޲εĹ��췽��(���Բ�д�������Զ����ϣ�ǰ����û���κ��������췽��)
	People()//���췽������ɾ��,������Ĭ�ϼ���)
	{
//		name = null;
//		sex = null;
//		age = 0;
	}
	
	//�вεĹ��췽��
	People(String name,String sex,int age)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//���ֳ�ʼ��
	People(String name)
	{
		this.name = name;
	}
	
	People(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args)
	{
		People p = new People();
		System.out.println(p.name);
		System.out.println(p.sex);
		System.out.println(p.age);
		
		People p1 = new People("����","��",30);
		System.out.println(p1.name+","+p1.sex+","+p1.age);
		
		People p2 = new People("����");
		System.out.println(p2.name);
		
		People p3 = new People("С�ϻ�",3);
		System.out.println(p3.name+","+p2.age);
	}

}
