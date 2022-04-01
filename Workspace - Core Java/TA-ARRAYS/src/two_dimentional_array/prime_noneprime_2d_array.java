package two_dimentional_array;

import java.util.Scanner;

public class prime_noneprime_2d_array 
{
	static Scanner sc=new Scanner(System.in);
	public static void getArray(int arr[][])
	{
		System.out.println("Enter No. of Rows=");
		int n=sc.nextInt();
		System.out.println("Enter No. of Columns=");
		int m=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("a["+i+"]["+j+"]=");
				arr[i][j]=sc.nextInt();
			}
		}
	}
	public static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int cnt=0;
		int[][] arr={{1,2,3},{4,5,6},{5,7,10}};
	//	int[][] arr={{1,2,3},{1,2,3},{4,4,4}};
	//	prime_noneprime_2d_array pn1 = new prime_noneprime_2d_array();
	//	int arr[][] = pn1.getArray();
		int firstHalf=0,secondHalf=0,sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i<=arr.length/2)
				{					
					firstHalf=firstHalf+arr[i][j];
				}
				else
				{
					secondHalf=secondHalf+arr[i][j];
				}
			}
		}
		System.out.println(firstHalf);
		System.out.println(secondHalf);
		if(firstHalf==secondHalf)
		{
			System.out.println("***Prime Numbers***");
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					cnt=0;
					for(int k=2;k<=arr[i][j]/2;k++)
						if(arr[i][j]%k==0)
							cnt++;
						if(cnt==0 && arr[i][j]!=1)
							System.out.println(arr[i][j]);
				}
			}	
		}
		else
		{
			System.out.println("***Non-Prime Numbers***");
			for(int i=0;i<arr.length;i++)
			{
				
				for(int j=0;j<arr[i].length;j++)
				{	
					cnt=0;
//					System.out.println(arr[i][j]);
					for(int k=2;k<=arr[i][j]/2;k++)
						if(arr[i][j]%k==0)
							cnt++;
					if(cnt>=1||arr[i][j]==1)
						System.out.println(arr[i][j]);
				}
			}	
		}
		
	}
}
