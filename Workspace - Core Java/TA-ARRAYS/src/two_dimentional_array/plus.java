package two_dimentional_array;
import java.util.Scanner;
public class plus 
{
	Scanner s1 = new Scanner(System.in);
	public int[][] arraysize(int[][] array)
	{
		System.out.println("enter the size of the array...");
		System.out.println("enter row size = ");
		int rowsize = s1.nextInt();
		System.out.println("enter collumn size = ");
		int collumnsize = s1.nextInt();
		return array;
	}
	
	public int[][] arrayelements(int[][] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				array[i][j] = s1.nextInt();
			}
		}
		return array;
	}
	
	public void display(int array[][])
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.println(array[i][j]);
			}
		}
	}
}
