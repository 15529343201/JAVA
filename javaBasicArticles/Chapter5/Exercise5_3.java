package chapter5;
//��������
import java.util.Scanner;

public class Exercise5_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a postive integer: ");
    int number = input.nextInt();
    
    if (isPalindrome(number)) 
      System.out.println(number + " is palindrome");
    else
      System.out.println(number + " is not palindrome");
    input.close();
  }
  
  public static boolean isPalindrome(int number) {
    return number == reverse(number);
  }

  public static int reverse(int number) {
    int result = 0;
    while (number != 0) {
      int remainder = number % 10;

      result = result * 10 + remainder;

      number = number / 10;
    }

    return result;
  }
}

