package package1;

import java.util.Scanner;

public class Stringconcat2 
{
	
	static Scanner s1=new Scanner(System.in);
	
	public static int[] readArraysize1()
	{
		System.out.println("Enter the size of the array");
		int size=s1.nextInt();
		int array[]=new int[size];
		return array;
	}
	
	public static int[] readArray1(int[] array)
	{
		System.out.println("read array elements");
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=s1.nextInt();
			
		}
	//	System.out.println(array.length/2);
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
		int k=0;
		int[] a=new int[array1.length+array2.length];
		if(array1.length<array2.length)
		{
			for (int i = 0; i <array1.length; i++) 
			{
				a[k]=array1[i];
				k++;
			}
			for (int i = (array2.length/2); i < array2.length; i++) 
			{
				a[k]=array2[i];
				k++;
			}
			for (int i = (array2.length/2)-1; i>= 0; i--) 
			{
				a[k]=array2[i];
				k++;
			}
		}
		
		else if(array1.length>array2.length)
		{
			for (int i = 0; i <array2.length; i++) 
			{
				a[k]=array2[i];
				k++;
			}
			for (int i = (array1.length/2); i < array1.length; i++) 
			{
				a[k]=array1[i];
				k++;
			}
			for (int i = (array1.length/2)-1; i >= 0; i--) 
			{
				a[k]=array1[i];
				k++;
			}
		}
		else if(array1.length==array2.length)
		{
			int sum1=0;
			int sum2=0;
			for (int i = 0; i < array1.length; i++) 
			{
				sum1=sum1+array1[i];	
			}
			for (int i = 0; i < array2.length; i++) 
			{
				sum2=sum2+array2[i];
			}
			if(sum1<sum2)
			{
				for (int i = 0; i <array1.length; i++) 
				{
					a[k]=array1[i];
					k++;
				}
				for (int i = (array2.length/2); i < array2.length; i++) 
				{
					a[k]=array2[i];
					k++;
				}
				for (int i = (array2.length/2)-1; i >= 0; i--) 
				{
					a[k]=array2[i];
					k++;
				}
			}
			else if(sum2<sum1)
			{
				for (int i = 0; i <array2.length; i++) 
				{
					a[k]=array2[i];
					k++;
				}
				for (int i = (array1.length/2); i < array1.length; i++) 
				{
					a[k]=array1[i];
					k++;
				}
				for(int i = (array1.length/2)-1; i >= 0; i--) 
				{
					a[k]=array1[i];
					k++;
				}		
			}
		}
			return a;
	}
	
	public static void main(String[] args) {
		
		int a1[]=readArraysize1();
		readArray1(a1);
		int a2[]=readArraysize1();
		readArray1(a2);
		int a3[]=readarray3(a1, a2);
		displayArray(a3);
				
		}
}