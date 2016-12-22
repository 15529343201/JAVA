package chapter9;
/*(Checking substrings) You can check whether a string is a substring of another
 * string by using the indexOf() method in the String class.Write your own method 
 * for this function .Write a program that pormpts the user to enter two strings,and
 * check whether the first string is a substring of the second
 */
import java.util.Scanner;
public class Exercise9_2 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		
		if (isSubstring(s1,s2))
		{
			System.out.println(s1 + " is a substring of " + s2);
		}
		else
		{
			System.out.println(s1 + " is a substring of " + s2);
        }
		input.close();
	}
	
	public static boolean isSubstring(String first,String second)
	{
		int remainingLength = second.length();
		int startingIndex = 0;
		
		while (first.length() <= remainingLength)
		{
			for (int i = 0; i < first.length(); i++)
			{
				if (first.charAt(i) != second.charAt(startingIndex+i))
				{
					startingIndex++;
					remainingLength--;
				//	continue toWhile;
				}
			}
			return true;
		}
		return false;
	}
}
