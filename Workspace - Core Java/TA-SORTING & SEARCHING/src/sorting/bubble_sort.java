package sorting;

import java.util.Scanner;

public class bubble_sort 
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
	
	public int[] bubbleSort(int[] array)
	{
		for (int i = 0; i < array.length; i++) 
		{												// 12345
			for (int j = 0; j < array.length-1; j++) 
			{
				int temp = 0;
				if(array[j] > array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		bubble_sort b1 = new bubble_sort();
		int[] array = b1.createArray();
		b1.readArray(array);
		System.out.println("original array...");
		b1.display(array);
		System.out.println();
		System.out.println("after sorting...");
		b1.bubbleSort(array);
		b1.display(array);
	}
}