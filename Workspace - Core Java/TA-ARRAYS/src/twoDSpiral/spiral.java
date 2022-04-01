package twoDSpiral;

import java.util.Scanner;

public class spiral
{
static Scanner s1=new Scanner(System.in);
	
	public static int[][] readArraysize1()
	{
		System.out.println("Enter the size of the row");
		int row=s1.nextInt();
		System.out.println("enter the size of the column");
		int column = s1.nextInt();
		int array[][]=new int[row][column];
		return array;
	}
	
	public static void readArray1(int[][] array)
	{
		System.out.println("read array elements");
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.println("enter array element at position "+(i)+(j));
				array[i][j] = s1.nextInt(); 
			}
			
		}
	}
	
	public static void displayArray(int[][] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] spiral(int[][] array)
	{
		int n=array.length;
		for (int i = 0, j= n-1; j>i; i++, j--)
		{
			for (int k=i; k<j; k++) 
			{
				System.out.print(array[i][k]+" ");
			}
			for(int k=i;k<j;k++)
			{
				System.out.print(array[k][j]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.print(array[j][k]+" ");
			}
			for(int k=j; k>i ;k--)
			{
				System.out.print(array[k][i]+" ");
			}
		}
		
		if(n%2==1)
		{
			System.out.println(array[n/2][n/2]);
		}
		
		return array;
	}
	
	public static void main(String[] args) 
	{
		spiral sp1 = new spiral();
	//	int[][] array = spiral.readArraysize1();
		int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	//	spiral.readArray1(array);
		System.out.println("original array....");
		spiral.displayArray(array);
		System.out.println("spiral of the array....");
		int[][] result = spiral.spiral(array);
		System.out.println("spiral in matrix form...");
		spiral.displayArray(result);
	}
}

