package TwoD_array;

import java.util.Scanner;

public class leftShift_90_degree 
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
		int temp = 0;
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
	
	public int[][] leftShift(int[][] array)
	{
		// to do left shift we have to swap row
		for (int i = 0; i < array.length/2; i++) 
		{
			int temp;
			int k = array.length-1;
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
		leftShift_90_degree l1 = new leftShift_90_degree();
		int[][] array = l1.createArray();
		l1.readArray(array);
		System.out.println("before transpose...");
		l1.Display(array);
		System.out.println("after transpose...");
		l1.transpose(array);
		l1.Display(array);
		System.out.println("after 90' left shift...");
		l1.leftShift(array);
		l1.Display(array);
		System.out.println("after 180' left shift...");
		l1.transpose(array);
		l1.leftShift(array);
		l1.Display(array);
		System.out.println("after 270' left shift...");
		l1.transpose(array);
		l1.leftShift(array);
		l1.Display(array);
		System.out.println("after 360' left shift...");
		l1.transpose(array);
		l1.leftShift(array);
		l1.Display(array);
		
	}

}
