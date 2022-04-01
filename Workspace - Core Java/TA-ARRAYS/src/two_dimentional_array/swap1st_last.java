package two_dimentional_array;

import java.util.Scanner;

public class swap1st_last 
{
	static Scanner s1 = new Scanner(System.in);
	public static int[][] readArraysize()
	{
		System.out.println("enter size of the array...");
		System.out.println("enter size of the row = ");
		int rowsize = s1.nextInt();
		System.out.println("enter size of the collumn = ");
		int collsize = s1.nextInt();
		int [][] array = new int[rowsize][collsize];
		return array;
	}
	
	public static int[][] readArray(int[][] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.println("enter the value = ");
				array[i][j] = s1.nextInt();
			}
		}
		return array;
	}
	
	public static void display(int array[][])
	{
	//	System.out.println(array.length);
	//	int temp;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
			        System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	public int[][] swap(int array[][])
	{
		int length = array.length-1;
	//	System.out.println("length = "+length);
		for (int i = 0; i < array.length/2; i++) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				int temp1 = array[i][j];
				array[i][j] = array[length][j];
				array[length][j] = temp1;
			}
			length--;
		}
		return array;				
//		for (int i = array.length-1; i>=0; i--) 
//		{
//			for (int j = 0; j < array[i].length; j++) 
//			{
//					System.out.print(array[i][j]);
//			}
//			System.out.println();
//		}
	}
	
	public void swapping(int[][]array)
	{
		for (int i = array.length-1; i>=0; i--) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
					System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) 
	{
		swap1st_last sw1 = new swap1st_last();
		int array[][]=swap1st_last.readArraysize();
		swap1st_last.readArray(array);
		swap1st_last.display(array);
		System.out.println();
//		int[][] array1 = sw1.swap(array);
//		sw1.display(array);
		System.out.println();
		sw1.swapping(array);
	}
}