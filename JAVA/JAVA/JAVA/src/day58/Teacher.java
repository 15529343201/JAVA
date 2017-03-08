package day58;

public class Teacher implements Runnable 
{
	private Print p;
	private String name;
	private int eScore,mScore,yScore;
	
	public Teacher(Print p,String name,int eScore,int mScore,int yScore)
	{
		this.eScore = eScore;
		this.yScore = yScore;
		this.p = p;
		this.mScore = mScore;
		this.name = name;
	}

	public Print getP() {
		return p;
	}

	public String getName() {
		return name;
	}

	public int geteScore() {
		return eScore;
	}

	public int getmScore() {
		return mScore;
	}

	public int getyScore() {
		return yScore;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(p)
		{
			//锁定打印机对象，让它单线程工作
			p.printScore(name, eScore, mScore, yScore);
		}
	}
}
