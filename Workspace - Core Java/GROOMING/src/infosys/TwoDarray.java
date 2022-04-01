package infosys;

import java.util.Scanner;

public class TwoDarray 
{
	static Scanner s1 = new Scanner(System.in);
	
	public static int[][] createArray()
	{
		System.out.println("enter row size...");
		int row = s1.nextInt();
		System.out.println("enter col size...");
		int col = s1.nextInt();
		int[][] array = new int[row][col];
		return array;
	}
	
	public static void readElement(int[][] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.println("enter the element on index "+(i)+(j));
				array[i][j]=s1.nextInt();
			}
		}
	}
	
	public static void display(int[][] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int[][] array = createArray();
		readElement(array);
		display(array);
	}
}
