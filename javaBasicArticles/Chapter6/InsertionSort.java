package chapter6;
//≤Â»Î≈≈–Ú
public class InsertionSort
{
	public static void main(String[] args)
	{
		double[] list = {1,9,4.5,6.6,5.7,-4.5};
		insertionSort(list);
		for(int i = 0; i < list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
	}
	public static void insertionSort(double[] list)
	{
		for(int i = 1; i < list.length; i++)
		{
			double currentElement = list[i];
			int k;
			for(k = i - 1; k >= 0 && list[k] > currentElement;k--)
			{
				list[k + 1] = list[k];
			}
			
			list[k+1] = currentElement;
		}
	}
}
