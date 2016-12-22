package chapter9;
/*Counting characters,words,and lines in a file*/
import java.io.*;
import java.util.*;
public class Exercise9_17 {
	public static void main(String args[]) throws Exception {
		int charCount = 0, wordCount = 0, lineCount = 0;
		
		if (args.length != 1){
			System.out.println("Usage: java Exercise9_17 file");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
		       System.out.println("Source file " + args[0] + " not exist");
		       System.exit(0);
		}
		
		Scanner input = new Scanner(sourceFile);

	    while (input.hasNext()) {
	      String s = input.nextLine();
	      charCount += s.length();
	      lineCount++;
	      wordCount += countWords(s);
	    }

	    System.out.println("File " + sourceFile + " has ");
	    System.out.println(charCount + " characters");
	    System.out.println(wordCount + " words");
	    System.out.println(lineCount + " lines");
	    input.close();
	  }

	  private static int countWords(String s) {
	    Scanner input = new Scanner(s);
	    int count = 0;
	    input.close();

	    while (input.hasNext()) {
	      input.next(); count++;
	    }

	    return count;
	    
	  }
}


