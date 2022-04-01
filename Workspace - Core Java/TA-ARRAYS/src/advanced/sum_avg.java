package advanced;
import java.util.Scanner;
public class sum_avg 
{
	static Scanner s1 = new Scanner(System.in);
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
			System.out.println("array["+i+"] = "+array[i]);
		}
//		return array;
	}
	
	public int sum(int[] array1)
	{
		int sum = 0;
		for (int i = 0; i < array1.length; i++) 
		{
			sum=sum+array1[i];
		}
		return sum;
	}
	
	public int avg(int arg, int[] array1)
	{
		int avg = arg/array1.length;
		return avg;
	}
	
	public int evenPositionSum(int[] array1)
	{
		int evensum=0;
		for (int i = 0; i < array1.length; i++)
		{
			if(i%2==0)
			{
				evensum=evensum+array1[i];
			}
		}
		return evensum;
	}
	
	public int evenNoAtOddPosition(int[] array1)
	{
		int evenavg=0;
		int evensum=0;
		int oddcounter=0;
		for (int i = 0; i < array1.length; i++)
		{
			if(i%2!=0 && array1[i]%2==0)
			{
				evensum=evensum+array1[i];
				oddcounter++;
			}
		}
		if(oddcounter!=0)
		{			
			evenavg=evensum/oddcounter;
		}
		else
		{
			System.out.println("no even numbers found at odd position... ");
		}
		return evenavg;
	}
	
	public int counter(int[] array1)
	{
		int counter=0;
		for (int i = 0; i < array1.length; i++) 
		{
			if((array1[i]%3==0 || array1[i]%6==0) || (array1[i]%11==0 && array1[i]%9==0))
			{
				counter++;
			}
		}
		return counter;
	}
	
	public void smallest(int[] array1)
	{
		int smallest1=array1[0];
		int smallest2=array1[0];
		for (int i = 0; i < array1.length; i++) 
		{
			if(smallest1>array1[i])
			{
				//smallest2=smallest1;
				smallest1=array1[i];	 
			}
			if(smallest2>array1[i] && array1[i]>smallest1)
			{
				smallest2=array1[i];
			}
		}
		System.out.println("1st smallest number is = "+smallest1);
		System.out.println("2nd smallest number is = "+smallest2);
	}
	public static void main(String[] args) 
	{
		sum_avg sa = new sum_avg();
		int[] array = sum_avg.readArray();
		sum_avg.enterElement(array);
		int sum = sa.sum(array);
		int avg = sa.avg(sum, array);
		sum_avg.display(array);
		System.out.println("sum ="+sum);
		System.out.println("avg ="+avg);
		System.out.println("sum of values at even position ="+sa.evenPositionSum(array));
		System.out.println("avg of even number at odd position ="+sa.evenNoAtOddPosition(array));
		System.out.println("counter for number divisible by 3,6, or both 11 & 9 = "+sa.counter(array));
		sa.smallest(array);
	}
}
