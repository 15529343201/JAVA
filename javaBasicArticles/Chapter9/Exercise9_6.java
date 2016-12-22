package chapter9;
/*(Counting the letters in a string) Write a method that counts the number of letters
 * in a string using the following header:
 *    public static int countLetters(String s)
 * Write a test program that prompts the user to enter a string and displays the
 * number of letters int the string
 */
public class Exercise9_6 {
	public static void main(String[] args){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.println("The number of letters is " + countLetters(s));
		input.close();
	}
	
	public static int countLetters(String s){
		int count = 0;
		for (int i = 0; i < s.length(); i++){
			if (Character.isLetter(s.charAt(i))){
				count++;
			}
		}
		return count;
	}
}
