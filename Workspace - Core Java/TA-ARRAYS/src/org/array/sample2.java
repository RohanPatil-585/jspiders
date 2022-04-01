package org.array;
import java.util.Scanner;
public class sample2 
{
	static int[] readArray()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the size of the array = ");
		int size = s1.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("enter element "+(i+1));
			a[i]=s1.nextInt();
		}
		return a;
	}
 
	static void display(int a[])
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("display elements = "+a[i]);
		}
		a[0]=500;
		a[2]=600;
	}
	public static void main(String[] args) 
	{
		int a[] = readArray();
		display(a);
		int b[]=a;
		
		b[3]=400;
		System.out.println();
		display(a);
		a[4]=700;
		System.out.println();
		display(a);
	}
}
