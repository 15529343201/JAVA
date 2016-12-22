package chapter9;
/*(Occurrences of each digit in a string) Write a method that counts the occurrences
 * of each digit in a string using the following header:
 *    public static int[] count(String s)
 * The method counts how many times a digit appears in the string.The return value
 * is an array of ten elements ,each of which holds the count for a digit.For example,
 * after executing int[] counts = count("12203AB3"),counts[0] is 1,counts[1] is 1,
 * counts[2] is 2,counts[3] is 2
 */
public class Exercise9_5 {
	public static void main(String[] args){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		int[] counts = count(s);
		
		for (int i = 0; i < 10; i++){
			System.out.println("Digit " + i + " occurs " + counts[i] + " times");
		}
		input.close();
	}
	
	public static int[] count(String s){
		int[] counts = new int[10];
		
		for (int i = 0; i < s.length(); i++){
			if (Character.isDigit(s.charAt(i))){
				counts[s.charAt(i) - '0']++;
			}
		}
		
		return counts;
	}
}
