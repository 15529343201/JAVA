package chapter9;
/*(Finding the number of uppercase letters in a string)Write a program that passes
 * a string to the main method and displays the number of uppercase letters in a string
 */
public class Exercise9_15 {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java Exercise9_15 string");
			System.exit(0);
		}
		
		String s = args[0];
		int total = 0;
		
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				total++;
		}
		System.out.println("The number of uppercase letters is " + total);
	}
}
