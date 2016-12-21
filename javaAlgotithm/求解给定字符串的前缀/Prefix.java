package mooc;
import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s,S[];
		
		
		
		while(input.hasNext()){
			s=input.nextLine();
			S=s.split(" ");
			s=check(S);
			if(s.length()>0)
				System.out.println("The common prefix is "+s);
			else
				System.out.println("No common prefix");
		}
		input.close();

	}

	public static String check(String[] S){
		int i;
		for( i =0;i<(S[0].length()>S[1].length()?S[0].length():S[1].length());i++){
			if(S[0].charAt(i)!=S[1].charAt(i))
					break;
		}
		
		return S[0].substring(0, i);
		
	}
    
}