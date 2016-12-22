package chapter8;

public class Exercise8_10 {

}

class QuadraticEquation
{
	private double a,b,c;
	
	public QuadraticEquation(double newa,double newb,double newc)
	{
		this.a = newa;
		this.b = newb;
		this.c = newc;
	}
	
	public double getDiscriminant()
	{
		return b * b - 4 * a * c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
	double getRoot1()
	{
	    if (getDiscriminant() < 0)
	      return 0;
	    else
	    {
	      return (-b + getDiscriminant()) / (2 * a);
	    }
	}

	  double getRoot2() {
	    if (getDiscriminant() < 0)
	      return 0;
	    else {
	      return (-b - getDiscriminant()) / (2 * a);
	    }
	  }
}