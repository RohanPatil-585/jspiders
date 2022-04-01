package sorting;

import java.util.Scanner;

public class insertionSort
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
	
	public int[] insertionSort(int[] array)
	{
		for (int i = 1; i < array.length; i++) 
		{
			int key = i;
			for (int j = i-1; j >=0; j--) 
			{
				
				if(array[key] < array[j])
				{
					int temp =array[key];
					array[key] = array[j];
					array[j] = temp;
					key--;
				}
			}
		}
		return array;
	}
    //54321
	//45321
	//34521
	//23451
	//12345.
	public static void main(String[] args) 
	{
		insertionSort i1 = new insertionSort();
		int[] array = i1.createArray();
		i1.readArray(array);
		System.out.println("original array...");
		i1.display(array);
		System.out.println("after swaping array...");
		int[] result = i1.insertionSort(array);
		i1.display(result);
	}
}