package day58;

public class Print 
{
	/*
	 * @param name ѧ������
	 * @param eScore Ӣ�ĳɼ�
	 * @param mScore ��ѧ�ɼ�
	 * @param yScore ���ĳɼ�
	 */
	public synchronized void printScore(String name,int eScore,int mScore,int yScore)
	{
		System.out.println(name + "��Ӣ�ĳɼ�: " + eScore);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "�����ĳɼ�: " + yScore);
		System.out.println(name + "����ѧ�ɼ�: " + mScore);
	}
}