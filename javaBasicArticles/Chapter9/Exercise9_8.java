package chapter9;
/*(Binary to decimal)
 * public static int binaryToDecimal(String binaryString)
 */
public class Exercise9_8 {
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a binary number string: ");
		String s = input.nextLine();
		System.out.println("The decimal value is " + binaryToDecimal(s));
		input.close();
	}
	
	public static int binaryToDecimal(String binaryString){
		int value = binaryString.charAt(0) - '0';
		for (int i = 1; i < binaryString.length(); i++){
			value = value * 2 +binaryString.charAt(i) - '0';
		}
		return value;
	}
}
