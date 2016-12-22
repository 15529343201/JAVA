package chapter9;
/*(Decimal to binary)
 * public static String decimalToBinary(int value)
 */
public class Exercise9_10 {
	public static void main(String[] args){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter an integer: ");
		int value = input.nextInt();
		System.out.println("The binary value is " + decimalToBinary(value));
		input.close();
	}
	
	public static String decimalToBinary(int value){
		StringBuffer buffer = new StringBuffer();
		
		while (value != 0){
			int bit = value % 2;
			buffer.insert(0, bit);
			value = value / 2;
		}
		return buffer.toString();
	}
}
