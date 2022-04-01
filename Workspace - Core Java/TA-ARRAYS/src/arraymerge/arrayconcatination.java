package arraymerge;

import java.util.Scanner;

public class arrayconcatination 
{
static Scanner s1=new Scanner(System.in);
	
	public static int[] readArraysize()
	{
		System.out.println("Enter the size of the array");
		int size=s1.nextInt();
		int array[]=new int[size];
		return array;
	}
	
	public static int[] readArray(int[] array)
	{
		System.out.println("read array elements");
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=s1.nextInt();
		}
		return array;
	}
	
	
	public static void displayArray(int[] array)
	{
		System.out.println("Display Array");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+",");
		}
	}
	
	public static int[] readarray3(int[] array1,int[] array2)
	{
		int[] a3=new int[array1.length+array2.length];
		int k=0;
		for (int i = 0; i < array1.length; i++) 
		{
			a3[k++]=array1[i];	
		}
		for (int i = 0; i < array2.length; i++) 
		{
			a3[k++]=array2[i];
		}
		return a3;
	}
	
	public static void main(String[] args) 
	{	
		int a1[]=readArraysize();
		readArray(a1);
		int a2[]=readArraysize();
		readArray(a2);
		int a3[]=readarray3(a1, a2);
		displayArray(a3);			
	}
}