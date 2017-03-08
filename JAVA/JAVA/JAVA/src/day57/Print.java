package day57;

public class Print 
{
	/*
	 * @param name 学生姓名
	 * @param eScore 英文成绩
	 * @param mScore 数学成绩
	 * @param yScore 语文成绩
	 */
	public void printScore(String name,int eScore,int mScore,int yScore)
	{
		System.out.println(name + "的英文成绩: " + eScore);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "的语文成绩: " + yScore);
		System.out.println(name + "的数学成绩: " + mScore);
	}
}
