package day33;

public class Test 
{
	public static void main(String[] args)
	{
		Tiger t = new Tiger();
		t.eat();
		t.setType("�ϻ�");
		t.setSkin("���ɫ");
		t.setLegCount(4);
		
		System.out.println(t.getType()+","+t.getSkin()+","+t.getLegCount());
		
		t.run();
		
		Sheep e = new Sheep();
		e.eat();
		e.fire();
	}

}
