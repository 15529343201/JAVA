package chapter9;
/*(Sorting characters in a string)
 * public staitc String sort(String s)
 * For example,sort("acb") return abc.
 */
import java.util.Arrays;
public class Exercise9_11 {
	  public static void main(String args[]) {
	    // Prompt the user to enter a string
	    java.util.Scanner input = new java.util.Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String s = input.nextLine();
	    System.out.println("Sorted string is " + sort(s));
	    input.close();
	  }

	  /*public static String sort(String str){
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
			return String.valueOf(s1);
	  }*/
	  
	  public static String sort(String str){
		  char[] s = str.toCharArray();
		  Arrays.sort(s);
		  return String.valueOf(s);
	  }
}
