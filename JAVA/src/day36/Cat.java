package day36;

public class Cat extends Feline
{
    //è�Ĳ�ʳ����
	@Override
	public void catchAnimal(Animal animal) {
		// TODO Auto-generated method stub
		//����Ҫ�жϲ�ʳ��animal�Ƿ�����������ǣ����Բ�ʳ
		if(animal instanceof Mouse)
			System.out.println("è���ڲ�ʳ����");
		else
			System.out.println("è���ܲ�ʳ����");
	}
}
