package day36;

public class Cat extends Feline
{
    //猫的捕食方法
	@Override
	public void catchAnimal(Animal animal) {
		// TODO Auto-generated method stub
		//首先要判断捕食的animal是否是老鼠，如果是，可以捕食
		if(animal instanceof Mouse)
			System.out.println("猫正在捕食老鼠");
		else
			System.out.println("猫不能捕食老鼠");
	}
}
