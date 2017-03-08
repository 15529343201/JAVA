package day58;

public class MyThread extends Thread
{
	String name;
	Source s;
	
	MyThread(String name,Source s)
	{
		this.name = name;
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if("method1".equals(name))
			s.method1();
		else
			s.method2();
	}
	
	public static void main(String[] args)
	{
		Source s = new Source();
		MyThread t1 = new MyThread("method1",s);
		MyThread t2 = new MyThread("method2",s);
		
		t1.start();
		t2.start();
	}
	

}
