package two_dimentional_array;
import java.util.Scanner;
public class prime_noneprime 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter size of the array...");
		System.out.println("enter size of the row = ");
		int rowsize = s1.nextInt();
		System.out.println("enter size of the collumn = ");
		int collsize = s1.nextInt();
		int [][] array = new int[rowsize][collsize];
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.println("enter the value = ");
				array[i][j] = s1.nextInt();
			}
		}
//		for (int i = 0; i < array.length; i++)
//		{
//			for (int j = 0; j < array.length; j++) 
//			{
//				System.out.print(array[i][j]);
//			}
//			System.out.println();
//			
//		}
//		
//		for (int i = 0; i < array.length; i++) 
//		{
//			for (int j = 0; j < array.length; j++) 
//			{
//				if(i==j || i+j==array.length-1)
//				{					
//					System.out.print(array[i][j]);
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				if(i==0)
				{
					int sum = array[i][j] + array[i+1][j];
					
					if(sum==array[i][j])
					{
						for (int k = 0; k < array[i].length; k++) 
						{
							int num = array[k][j];
							
							for (int l = 2; l < num; l++) 
							{
								if(num%l==0)
								{
									System.out.println(num);
								}
							}
						}
					}
				}
	
			}
			System.out.println();
		}
	}
}