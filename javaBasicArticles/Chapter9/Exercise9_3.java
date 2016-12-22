package chapter9;
/*(Checking password) Some Websites impose certain ruels for passwords.Write a method
 *  that checks whether a string is a valid password,Suppose the password rule is
 *  as follows:
 *     A password must have at least eight characters;
 *     A password consists of only letters and digits;
 *     A password must contain at least two digits
 * Write a program that prompts the user to enter a password and displays "Valid Password"
 * if the rule is followed or "Invalid Password" otherwise
 */
import java.util.Scanner;
public class Exercise9_3 {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string for password: ");
	String s = input.nextLine();
	
	if (isValidPassword(s))
		System.out.println("Valid password");
	else
		System.out.println("Invalid password");
	input.close();	
	}
	
	public static boolean isValidPassword(String s){
		
		for (int i = 0; i < s.length(); i++){
			if (!Character.isLetter(s.charAt(i)) &&
					!Character.isDigit(s.charAt(i)))
				return false;
		}
		
		if (s.length() < 8)
			return false;
		
		int count = 0;
		for (int i = 0; i < s.length(); i++){
			if (Character.isDigit(s.charAt(i)))
				count++;
		}
		
		if (count >= 2)
			return true;
		else
			return false;
	}
}
