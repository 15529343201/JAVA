package day33;
/*
 * ���� ���� ����
 * ���� ������
 * extendsֻ�ܼ̳�һ���࣬java��֧�ֶ��ؼ̳�
 * ����̳и���֮��������Ե��ø�������Ժͷ���
 * Ҳ������д��������Ժͷ����������������Լ������Ժͷ���
 */
//����(������)
public class Animal
{
	private String type;//���
	private String skin;//��ɫ
	private int legCount;//������
    
	public void eat()
	{
		System.out.println("�����ڳԶ���");
	}
	
	public void huxi()
	{
		System.out.println("�����ں���");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public int getLegCount() {
		return legCount;
	}

	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}
}
