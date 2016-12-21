package chapter7;
//¾ØÕóÏà¼Ó
import java.util.Scanner;
public class Exercise7_5 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		final int N = 3;
		
		System.out.println("Enter matrix1: ");
		double[][] matrix1 = new double[N][N];
		for(int i = 0; i < matrix1.length; i++)
			for(int j = 0; j < matrix1[i].length; j++)//no i++
				matrix1[i][j] = input.nextDouble();
		
		System.out.println("Enter matrix2: ");
		double[][] matrix2 = new double[N][N];
		for(int i = 0; i < matrix1.length; i++)
			for(int j = 0; j < matrix1[i].length; j++)
				matrix2[i][j] = input.nextDouble();
		
		// Add two matrices and print the result
	    double[][] resultMatrix = addMatrix(matrix1, matrix2);
	    System.out.println("The addition of the matrices is ");
	    printResult(matrix1, matrix2, resultMatrix, '+');
	    input.close();
	}
	//The method for adding two matrices
	public static double[][] addMatrix(double[][] m1,double[][] m2)
	{
		double[][] result = new double[m1.length][m1[0].length];
		for(int i = 0; i < result.length; i++)
			for(int j = 0; j < result[0].length; j++)
				result[i][j] = m1[i][j] + m2[i][j];
		return result;
	}
	
	/** Print result */
	  public static void printResult(double[][] m1, double[][] m2, double[][] m3, char op)
	  {
	    for (int i = 0; i < m1.length; i++) 
	    {
	      for (int j = 0; j < m1[0].length; j++)
	        System.out.print(" " + m1[i][j]);

	      if (i == m1.length / 2)
	        System.out.print( "  " + op + "  " );
	      else
	        System.out.print( "     " );

	      for (int j = 0; j < m2[0].length; j++)
	        System.out.print(" " + m2[i][j]);

	      if (i == m1.length / 2)
	        System.out.print( "  =  " );
	      else
	        System.out.print( "     " );

	      for (int j = 0; j < m3[0].length; j++)
	        System.out.print(" " + m3[i][j]);

	      System.out.println();
	    }
	  }
}
