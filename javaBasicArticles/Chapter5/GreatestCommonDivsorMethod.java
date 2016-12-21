package chapter5;

import java.util.Scanner;
public class GreatestCommonDivsorMethod{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();
        
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1,n2));
        input.close();
    }
    
    
    public static int gcd(int n1,int n2){
        int gcd = 1; //Initial gcd is 1
        int k = 2; //possible gcd
        
        while (k <= n1 && k <= n2){
             if (n1 % k == 0 && n2 % k == 0)
                gcd = k;//Update gcd
             k++;
        }
        return gcd;
    }
    
}