package TwoD_array;

import java.util.Scanner;

public class printTwoDArray
{
	Scanner s1 = new Scanner(System.in);
	
	public int[][] createArray()
	{
		System.out.println("enter the size of the row = ");
		int row = s1.nextInt();
		System.out.println("enter the size of the collumn = ");
		int collumn = s1.nextInt();
		
		int[][] array = new int[row][collumn];
		return array;
	}
	
	public void readArray(int[][] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.println("enter the value at position "+(i)+(j));
				array[i][j] = s1.nextInt();
			}
		}
	//	return array;
	}
	
	public void Display(int[][] array)
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
		printTwoDArray p1 = new printTwoDArray();
		int[][] array = p1.createArray();
		p1.readArray(array);
		p1.Display(array);
	}
}