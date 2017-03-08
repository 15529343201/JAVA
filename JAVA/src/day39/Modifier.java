package day39;

public interface Modifier 
{
	void print();
	public void print1();
	abstract void print2();
	public abstract void print3();
	abstract public  void print4();
	//protected void print5();报错
	//private void print6();报错
	//都相当于public abatract
}
