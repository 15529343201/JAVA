//检查一个数是否是偶数
package chapter3;
import java.util.Scanner;
public class Exercise3_2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		
		System.out.println("Is " + number + " an even number? " +
			      (number % 2 == 0));
	}

}
