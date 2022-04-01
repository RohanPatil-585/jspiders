package arrayPatterns;
import java.awt.DisplayMode;
import java.util.Scanner;
public class pattern1 
{
	static Scanner s1 = new Scanner(System.in);
	static int k = 0;
	static int[] array1=null,array2=null, array3=null; 
	static int sum1=0, sum2=0;
	
	public static int[] readArray()
	{
		System.out.println("enter the size of the array = ");
		int size = s1. nextInt();
		int array[] = new int[size];
		return array;
	}
	
	public static int[] enterElement(int[] array)
	{
		System.out.println("read array elements...");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("enter element "+(i+1));
			array[i]=s1.nextInt();
		}
		return array;
	}
	
	public static void display(int[] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("array["+i+"]"+array[i]);
		}
//		return array;
	}
	
	public static void merge(int[] array1, int[] array2)
	{
		for (int i = 0; i < array1.length; i++) 
		{
			array2[k++] = array1[i];
		}
	}
	
	public static void merge(int[] array1, int[] array2,int mid )
	{
		for (int i = mid; i < array1.length; i++) 
		{
			array2[k++] = array1[i];
		}
		for (int i = mid-1; i >=0; i--) 
		{
			array2[k++] = array1[i];
		}
	}
	
	public static void main(String[] args) 
	{
		int array1[]=readArray();
		enterElement(array1);
		int array2[]=readArray();
		enterElement(array2);
		array3=new int[array1.length+array2.length];
		
		if(array1.length < array2.length)
		{
			merge(array1, array3);
			merge(array2, array3, array2.length/2);
		}
		else if(array1.length > array2.length)
		{
			merge(array2, array3);
			merge(array1, array3, array1.length/2);
		}
		else
		{
			for (int i = 0; i < array1.length; i++)
			{
				sum1 = sum1+array1[i];
				sum2 = sum2+array2[i];
			}
			if(sum1<sum2)
			{
				merge(array1, array3);
				merge(array2, array3, array2.length/2);
			}
			else
			{
				merge(array2, array3);
				merge(array1, array3, array1.length/2);	
			}
		}
//		for(int i=0;i<array3.length;i++)
//		{
//			System.out.println(array3[i]);
//		}
		display(array3);
	}
}