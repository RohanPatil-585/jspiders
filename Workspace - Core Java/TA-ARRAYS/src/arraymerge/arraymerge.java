package arraymerge;
import java.util.Scanner;
public class arraymerge 
{
	public static void main(String[] args) 
	{
		int j = 0;
		int k = 0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter size of the array1 = ");
		int size = s1.nextInt();
		System.out.println("enter size of the array2 = ");
		int size2 = s1.nextInt();
		
		int[] a1 = new int[size];
		int[] a2 = new int[size2];
		
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println("enter element "+(i+1));
			a1[i]=s1.nextInt();
		}
		
		for (int i = 0; i < a2.length; i++)
		{
			System.out.println("enter element "+(i+1));
			a2[i]=s1.nextInt();
		}
		
		int temp=a1.length+a2.length;
		
		int[] a3 =new int[temp];
		
		for (int i = 0; i < a1.length; i++)
		{
			a3[i]=a1[i];
		}
		
		for (int i = 0; i < a2.length; i++)
		{
			a3[i+a1.length]=a2[i];
		}
		
		while(j<a1.length)
		{
			System.out.println("a1"+"["+(j+1)+"]"+" = "+a1[j]);
			j++;
		}
		
		while(k<a2.length)
		{
			System.out.println("a2"+"["+(k+1)+"]"+" = "+a2[k]);
			k++;
		}
		
		for (int i = 0; i < a3.length; i++)
		{
			System.out.println("a3"+"["+(i+1)+"]"+" = "+a3[i]);
		}
	}
}
