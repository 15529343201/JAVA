package day39;
/*
 * 1 ���������η�
 *      �ӿ��б��������η�:public static final
 *      �ӿ��з��������η�:public abstract
 * 2 �ӿ��������ñ���
 */
public class ModifierTest 
{
	public static void main(String[] args)
	{
		Modifier2 m = new Modifier2();
		Modifier m1 = new Modifier2();
		m.print();
		m.print1();
		m.print2();
		m.print3();
		m.print4();
		
		m1.print();
		m1.print1();
		m1.print2();
		m1.print3();
		m1.print4();
	}
}
