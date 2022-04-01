//wap to display array element which sum of half half as sum of second half
package two_dimentional_array;

import java.util.Scanner;

public class rowswap 
{
	Scanner s1 = new Scanner(System.in);
	public int[][] arraysize()
	{
		System.out.println("enter the size of the array...");
		System.out.println("enter row size = ");
		int rowsize = s1.nextInt();
		System.out.println("enter collumn size = ");
		int collumnsize = s1.nextInt();
		int[][] array = new int[rowsize][collumnsize];
		return array;
	}
	
	public int[][] arrayelements(int[][] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.println("enter element on index "+(i)+(j));
				array[i][j] = s1.nextInt();
			}
		}
		return array;
	}
	
	public void display(int array[][])
	{		
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j <array.length; j++) 
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	public int[][] swapcolumn(int array[][])
	{
		int temp;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0 ; j < array[i].length/2; j++) 
			{	int temp1=array.length-1;
				temp=array[i][j];
				array[i][j]=array[temp1][j];
				array[temp1][j]=temp;
				temp1--;
				//stem.out.print(array[i][j]);
			}
			//System.out.println();
		}
		return array;
	}
	
	public int[][] swap(int array[][])
	{
		int temp,temp1=array.length-1;
		for (int i = 0; i < array.length/2; i++) 
		{
			for (int j = 0 ; j < array[i].length; j++) 
			{
				temp=array[i][j];
				array[i][j]=array[temp1][j];
				array[temp1][j]=temp;
				
				//stem.out.print(array[i][j]);
			}temp1--;
			//System.out.println();
		}
		return array;
	}
	public static void main(String[] args) 
	{
		rowswap r1 = new rowswap();
		int[][] array = r1.arraysize();
		r1.arrayelements(array);
		r1.display(array);
		System.out.println();
		r1.swap(array);
		r1.display(array);
		r1.swapcolumn(array);
		System.out.println();
		r1.display(array);
	}
}
