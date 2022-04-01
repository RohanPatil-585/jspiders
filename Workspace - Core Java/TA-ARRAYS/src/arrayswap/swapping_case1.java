package arrayswap;

import java.util.Scanner;

public class swapping_case1 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter the size of the array = ");
		int size = s1.nextInt();
		int[] array = new int[size];
		System.out.println("enter the value in array = ");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("enter element "+(i+1));
			array[i]=s1.nextInt();
		}
		
		System.out.println("displaying origianal array ... ");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
		int k=array.length/2;
	//	System.out.println(" array of k = "+array[k]);
		for(int i=0; i<array.length/2; i++)
		{
			int temp=array[i];
		//	System.out.println("array of i = "+array[i]);
			array[i]=array[k];
			array[k++]=temp;
		}
		System.out.println("displaying swapped array ... ");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
		}
	}

}
