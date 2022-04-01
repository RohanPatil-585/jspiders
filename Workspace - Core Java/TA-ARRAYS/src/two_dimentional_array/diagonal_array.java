package two_dimentional_array;

import java.util.Scanner;

public class diagonal_array 
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
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				if(i==j || i+j == array.length-1)
				{
					System.out.print(array[i][j]);
					//System.out.print(" ");
				}
				else
				{
					//	System.out.print(" ");
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		diagonal_array np1 = new diagonal_array();
		int array[][] = diagonal_array.readArraysize();
		
		diagonal_array.readArray(array);
		diagonal_array.display(array);
	}
}
