package TwoD_array;

import java.util.Scanner;

public class rowSwap 
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
	public int[][] rowSwap(int[][] array)
	{
		for (int i = 0; i < array.length/2; i++) 
		{
			int temp;
			int k = array[i].length-1;
		//	System.out.println("k = "+k);
			for (int j = 0; j < array[i].length; j++) 
			{	 
				 temp = array[i][j];
				 array[i][j] = array[k][j];
				 array[k][j] = temp;
			}
		}
		return array;
	}

	public static void main(String[] args) 
	{
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		rowSwap r1 = new rowSwap();
		r1.rowSwap(array);
		r1.Display(array);
	}
}
