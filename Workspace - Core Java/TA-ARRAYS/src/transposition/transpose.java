package transposition;

import java.util.Scanner;

import org.array.mainclass2;

public class transpose 
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
	
	public int[][] swap(int array[][])
	{
		int temp;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i; j < array[i].length; j++) 
			{
				temp=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;
				//System.out.print(array[i][j]);
			}
		//	System.out.println();
		}
		return array;
	}	
	public static void main(String[] args) 
	{
		transpose t1=new transpose();
		int array[][] = t1.arraysize();
		t1.arrayelements(array);
		t1.display(array);
		System.out.println();
		t1.swap(array);
		t1.display(array);
//	System.out.println();
//	t1.swap(array);
//	t1.display(array);
//	System.out.println();
//	t1.display(array);
//	System.out.println();
//	t1.swap(array);
//	t1.display(array);
	}
}