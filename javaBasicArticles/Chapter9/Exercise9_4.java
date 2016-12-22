package chapter9;
/*(Occurrences of a specified character) Write a method that finds the number of
 * occurrences of a specified character in the string using the following header:
 *   public static int count(String str,char a)
 * For example,count("Welcome",'e')returns 2.Write a test program that prompts the
 * user to enter a string followed by a character and displays the number of occurrences
 * of the character in the string 
 */
public class Exercise9_4 {
	public static void main(String[] args){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.print("Enter a character: ");
		char ch = input.nextLine().charAt(0);
		
		int count = count(s,ch);
		System.out.println(count);
		input.close();
	}
	
	public static int count(String str,char ch){
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == ch){
				count++;
			}
		}
		return count;
	}
}
