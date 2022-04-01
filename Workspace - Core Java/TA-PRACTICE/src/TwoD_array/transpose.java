package TwoD_array;

import java.util.Scanner;

public class transpose 
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
	
	public int[][] transpose(int[][] array)
	{
		int temp;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i; j < array[i].length; j++) 
			{
				temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		transpose t1 = new transpose();
		int[][] array = t1.createArray();
		t1.readArray(array);
		t1.Display(array);
		System.out.println();
		int[][] result = t1.transpose(array);
		t1.Display(result);
	}
}