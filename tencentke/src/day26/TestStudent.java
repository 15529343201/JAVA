package day26;
//���췽��������
public class TestStudent 
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		printStudent(s1);
		Student s2 = new Student("����");
		printStudent(s2);
		Student s3 = new Student("����","49");
		printStudent(s3);
		Student s4 = new Student("����","49",12);
		printStudent(s4);
		Student s5 = new Student("����","49",12,"С��");
		printStudent(s5);
	}
	public static void printStudent(Student s)
	{
		System.out.println("����:"+s.name);
		System.out.println("ѧ��:"+s.stuNo);
		System.out.println("����:"+s.age);
		System.out.println("�ǳ�:"+s.pickName);
		System.out.println("---------------------");
	}

}
