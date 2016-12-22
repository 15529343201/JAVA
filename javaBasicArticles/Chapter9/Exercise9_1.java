package chapter9;
/*(Checking SSN) Write a program that prompts the user to enter a social security
 * number in the format DDD-DD-DDDD,where D is a digit,The program displays
 * "Valid SSN" for a correct social security number and "Invalid SSN" otherwise
 */
import java.util.Scanner;
public class Exercise9_1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string for SSN: ");
		String s = input.nextLine();
		
		if (isValidSSN(s))
			System.out.println("Valid SSN");
		else
			System.out.println("Invalid SSN");
		input.close();
	}
	
	public static boolean isValidSSN(String ssn){
		return ssn.length() == 11 &&
				Character.isDigit(ssn.charAt(0)) &&
				Character.isDigit(ssn.charAt(1)) &&
				Character.isDigit(ssn.charAt(2)) &&
				ssn.charAt(3) == '-' &&
				Character.isDigit(ssn.charAt(4)) &&
				Character.isDigit(ssn.charAt(5)) &&
				ssn.charAt(6) == '-' &&
				Character.isDigit(ssn.charAt(7)) &&
				Character.isDigit(ssn.charAt(8)) &&
				Character.isDigit(ssn.charAt(9)) &&
				Character.isDigit(ssn.charAt(10)); 
	}
}
