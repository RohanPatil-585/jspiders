package org.array;
import java.util.Scanner;
public class sample1 
{
	static int[] readArray()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the size of the array = ");
		int size = s1.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("enter element = "+(i+1));
			a[i]=s1.nextInt();
		}
		return a;
	}
	static void displayArray(int a[])
	{
		System.out.println("displaying array element = ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("array elements = "+a[i]);
		}
		a[0]=100;
		return;
	}
	
	public static void main(String[] args) 
	{
//		int a[]={1,2,3,4,5};
		int a[]=readArray();
		displayArray(a);
		int b[]=a;
		
		b[3]=500;
	//	System.out.println(a[3]);
		displayArray(a);
		System.out.println();
		displayArray(a);
	}
}
