package chapter9;
/*(Anagrams)Write a method that checks whether two words are anagrams .Two words
 * are anagrams if they contain the same letters in any order.
 * For example,"silent" and "listen" are anagrams.
 *     public static boolean isAnagram(String s1,String s2)
 */
import java.util.Scanner;
public class Exercise9_12 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String first = input.nextLine();
		System.out.print("Enter the second string: ");
		String second = input.nextLine();
		System.out.println(first + " and " + second + " is " + (isAnagram(first,second) ? "anagram." : "not anagram."));
		input.close();
	}
	

	public static String sort(String str){
		char[] s = str.toCharArray();
		for(int i=0;i<s.length;i++){
			for(int j=0;j<i;j++){
				if(s[i]<s[j]){
					char temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		return String.valueOf(s);
	}
	
	public static boolean isAnagram(String s1,String s2){
		String news1 = sort(s1);
		String news2 = sort(s2);
		
		if (news1.length() != news2.length()) 
			return false;
		for (int i = 0; i < news1.length(); i++){
			if (news1.charAt(i) != news2.charAt(i))
				return false;
		}
		return true;
	}
}
/*
Êä³ö½á¹û:
Enter the first string: listen
Enter the second string: silten
listen and silten is anagram.
*/