package sorting;

import java.util.Scanner;

public class selectionSort 
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
	}
	
	public int[] selectionSort(int[] array)
	{
		for (int i = 0; i < array.length; i++) 
		{													//12345
			for (int j = i+1; j < array.length; j++) 
			{
				int temp = 0;
				
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		selectionSort se1 = new selectionSort();
		int[] array = se1.createArray();
		se1.readArray(array);
		System.out.println("original array...");
		se1.display(array);
		System.out.println();
		System.out.println("after sorting array...");
		se1.selectionSort(array);
		se1.display(array);
	}
}