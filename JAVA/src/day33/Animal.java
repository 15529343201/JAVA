package day33;
/*
 * 父类 超类 基类
 * 子类 派生类
 * extends只能继承一个类，java不支持多重继承
 * 子类继承父类之后，子类可以调用父类的属性和方法
 * 也可以重写父类的属性和方法，还可以增加自己的属性和方法
 */
//父类(动物类)
public class Animal
{
	private String type;//类别
	private String skin;//肤色
	private int legCount;//几条腿
    
	public void eat()
	{
		System.out.println("动物在吃东西");
	}
	
	public void huxi()
	{
		System.out.println("动物在呼吸");
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
