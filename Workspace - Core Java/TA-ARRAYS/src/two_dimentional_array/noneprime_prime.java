package two_dimentional_array;
import java.util.Scanner;
public class noneprime_prime 
{
	static Scanner s1 = new Scanner(System.in);
	public static int[][] readArraysize()
	{
		System.out.println("enter size of the array...");
		System.out.println("enter size of the row = ");
		int rowsize = s1.nextInt();
		System.out.println("enter size of the collumn = ");
		int collsize = s1.nextInt();
		int [][] array = new int[rowsize][collsize];
		return array;
	}
	
	public static int[][] readArray(int[][] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.println("enter the value = ");
				array[i][j] = s1.nextInt();
			}
		}
		return array;
	}
	
	public static void display(int array[][])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public boolean isPrime(int array[][])
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		noneprime_prime np1 = new noneprime_prime();
		int array[][] = np1.readArraysize();
		np1.readArray(array);
		np1.display(array);
		int cnt=0;
	//	int[][] arr={{1,2,3},{4,5,6},{5,7,10}};
	//	prime_noneprime_2d_array pn1 = new prime_noneprime_2d_array();
	//	int arr[][] = pn1.getArray();
		int firstHalf=0,secondHalf=0,sum=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				if(i<=array.length/2)
				{					
					firstHalf=firstHalf+array[i][j];
				}
				else
				{
					secondHalf=secondHalf+array[i][j];
				}
			}
		}
		System.out.println("sum of the first half = "+firstHalf);
		System.out.println("sum of the second half = "+secondHalf);
		if(firstHalf==secondHalf)
		{
			System.out.println("***Prime Numbers***");
			for(int i=0;i<array.length;i++)
			{
				for(int j=0;j<array[i].length;j++)
				{
					cnt=0;
					for(int k=2;k<=array[i][j]/2;k++)
					{						
						if(array[i][j]%k==0)
						{
							cnt++;
						}
						if(cnt==0 && array[i][j]!=1)
						{							
							System.out.println(array[i][j]);
						}
					}
				}
			}	
		}
		else
		{
			System.out.println("***Non-Prime Numbers***");
			for(int i=0;i<array.length;i++)
			{
				for(int j=0;j<array[i].length;j++)
				{	
					cnt=0;
//					System.out.println(arr[i][j]);
					for(int k=2;k<=array[i][j]/2;k++)
					{
						if(array[i][j]%k==0)
						{
							cnt++;
						}
//						if(cnt>=1||array[i][j]==1)
//						{
//							System.out.println(array[i][j]);
//						}
					}
					if(cnt>=1||array[i][j]==1)
					{
						System.out.println(array[i][j]);
					}

				}
			}	
		}
	}
}