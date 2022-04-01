package TwoD_array;

import java.util.Scanner;
public class RightShift_90degree 
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
	
	public int[][] rightShift(int[][] array)
	{
		// to do right shift we have to swap column
		for (int i = 0; i < array.length; i++) 
		{
			int temp;
			int k = array[i].length-1;
			for (int j = 0; j < array[i].length/2; j++)
			{
				temp = array[i][j];
				array[i][j] = array[i][k];
				array[i][k] = temp;
			}
		}
		return array;
	}
	public static void main(String[] args) 
	{
		RightShift_90degree r1 = new RightShift_90degree();
		int[][] array = r1.createArray();
		r1.readArray(array);
		System.out.println("before transpose...");
		r1.Display(array);
		System.out.println("after transpose...");
		r1.transpose(array);
		r1.Display(array);
		System.out.println("after 90' right shift...");
		r1.rightShift(array);
		r1.Display(array);
		System.out.println("after 180' right shift...");
		r1.transpose(array);
		r1.rightShift(array);
		r1.Display(array);
		System.out.println("after 270' right shift...");
		r1.transpose(array);
		r1.rightShift(array);
		r1.Display(array);
		System.out.println("after 3600' right shift...");
		r1.transpose(array);
		r1.rightShift(array);
		r1.Display(array);
	}
}
