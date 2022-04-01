package TwoD_array;

import java.util.Scanner;

public class diagonalSum 
{
	int rightsum = 0 ;
	int leftsum = 0 ;
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
	
	public void Display(int[][] array, int rsum, int lsum)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				if(rsum > lsum)
				{
					if(i==j)
					{
						rightsum = rsum + array[i][j];
						System.out.print(array[i][j]);
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if( i+j == array.length-1)
					{
						leftsum = lsum + array[i][j];
						System.out.println(array[i][j]);
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void diagonal(int[][] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				if(i==j)
				{
				//	System.out.print(array[i][j]);
					rightsum = rightsum + array[i][j];
				}
				else
				{
					System.out.print(" ");
				}
				if( i+j == array.length-1)
				{
				//	System.out.println(array[i][j]);
					leftsum = leftsum + array[i][j];
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				if(rightsum > leftsum)
				{
					if(i==j)
					{
						System.out.print(array[i][j]);
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if( i+j == array.length-1)
					{
						System.out.println(array[i][j]);
						
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println("sum of right diagonal = "+rightsum);
		System.out.println("sum of left diagonal = "+leftsum);
	}
	public static void main(String[] args) 
	{
		diagonalSum d1 = new diagonalSum();
		int[][] array = d1.createArray();
		d1.readArray(array);
		System.out.println();
		
		d1.diagonal(array);
	}
}