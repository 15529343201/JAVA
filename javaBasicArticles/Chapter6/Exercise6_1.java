package chapter6;
/*指定等级*/
import java.util.Scanner;
public class Exercise6_1 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		
		int[] scores = new int[numberOfStudents];
		int best = 0;
		char grade;
		
		System.out.print("Enter " + numberOfStudents + " scores: ");
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = input.nextInt();
			
			if (scores[i] > best)
				best = scores[i];
		}
		
		String output = "";
		
		for (int i = 0; i < scores.length; i++)
		{
			 if (scores[i] >= best - 10)
			        grade = 'A';
			 else if (scores[i] >= best - 20)
			        grade = 'B';
			 else if (scores[i] >= best - 30)
			        grade = 'C';
			 else if (scores[i] >= best - 40)
			        grade = 'D';
			 else
			        grade = 'F';

			 output += "Student " + i + " score is " +
			        scores[i] + " and grade is " + grade + "\n";
		}
		System.out.println(output);
		input.close();
	}
}
