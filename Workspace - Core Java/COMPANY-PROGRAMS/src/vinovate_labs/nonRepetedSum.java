package vinovate_labs;

public class nonRepetedSum 
{
	public int nonRepetedSum(int[] array)
	{
		int temparray=0;
		int sum = 0;
		int flag=0;											//10,5,3,4,3,5,6
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i+1; j < array.length-1; j++) 
			{
				if(array[i] == array[j])
				{
					flag=1;
				}
			}
			for(int j=i-1;j>0;j--)
			{
				if(array[i]==array[j])
				{
					flag=1;
				}
			}
			if(flag== 0)
			{
				sum = sum + array[i];
			}
			flag=0;
		}
		return sum;
	}	
	public static void main(String[] args) 
	{
		nonRepetedSum n1 = new nonRepetedSum();
		int[] array = {10,5,3,4,3,5,6};
		int sum = n1.nonRepetedSum(array);
		System.out.println("sum = "+sum);
		System.out.println();
	}
}