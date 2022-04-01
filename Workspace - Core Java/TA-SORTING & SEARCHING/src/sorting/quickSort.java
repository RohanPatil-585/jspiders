package sorting;

import java.util.Scanner;

public class quickSort 
{
	Scanner s1 = new Scanner(System.in);
	public int[] createArray()
	{	
		System.out.println("enter the size of array..");
		int size = s1.nextInt();
		int[] array = new int[size];
		return array;
	}
	
	public void readArray(int[] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
				System.out.println("enter the value at position " +(i+1));
				array[i] = s1.nextInt();
		}
	}
	
	public void display(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
				System.out.print(array[i]+"\t");
		}
		System.out.println();
	}
	
	public int partition(int[] array, int startindex, int endindex)
	{
		int pivot = array[endindex];
		int i = startindex-1;
			for (int j = startindex; j < endindex; j++) 
			{
				if(array[j] <= pivot )
				{											//19358
					i = i+1;
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			int temp1 = array[i+1];
			array[i+1] = array[endindex];
			array[endindex] = temp1;
			
			return i+1;
	}
	
	public int[] quickSort(int[] array,int sindex, int eindex)
	{
		if(sindex < eindex)
		{
			int q = partition(array, sindex, eindex);
			quickSort(array, sindex, q-1);
			quickSort(array, q+1, eindex);			
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		quickSort q1 = new quickSort();
		int[] array = q1.createArray();
		q1.readArray(array);
		System.out.println("original array...");
		q1.display(array);
		System.out.println("after sorting array...");
		int[] resultarray = q1.quickSort(array,0,array.length-1);
		q1.display(resultarray);
	}
}