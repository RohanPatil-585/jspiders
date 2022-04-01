package package1;

import java.util.Scanner;

public class Search 
{	
	static Scanner s1=new Scanner(System.in);
	
	public int[] createArray()
	{
		System.out.println("Enter size of the array...");
		int s2=s1.nextInt();
		int[] array=new int[s2];
		System.out.println("Enter Element");
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=s1.nextInt();
		}
		return array;		
	}
	
	public void display(int[] arg)
	{
		for (int i = 0; i < arg.length; i++) 
		{
			System.out.println("arg["+i+"]="+arg[i]);
		}
	}
	public void searchElement( int[] array , int arg1,int a)
	{
		int temp=0, count=0;
		int counter =0;
		int[] temporary=new int[a];
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]==arg1)
			{				
				temporary[counter++]=i;
				count++;
			}
		}	
		for (int j = 0; j < temporary.length; j++) 
		{
			
			if(count==a)
			{
				System.out.println(arg1+" is present in given Array at position="+temporary[j]+" And occurence="+count +"\t"+(j+1)+"occurence");
			}		
			else if(count==0)
			{
				System.out.println(arg1+" is not present in given Array");
			}
			else
			{
				System.out.println(arg1+" Is More Than or less Then Given Occurence: ");
			}
		}
	}
	public static void main(String[] args) 
	{
		Search sea=new Search();
		int[] a1=sea.createArray();
		sea.display(a1);
		System.out.println();
		System.out.println("Enter Element");
		int a2=s1.nextInt();
		sea.searchElement(a1, a2,3);
	}	
}