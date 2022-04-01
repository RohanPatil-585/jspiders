package org.interView.sarthaaApp;

public class SumNonDUblicateNumber
{
	public static int nonDublicateSum(int [] arr)
	{
		int sum=0;
		int flag=0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(i!=j)
				{
					if(arr[i]!=arr[j])
					{
						flag=1;
						
					}
					else
					{
					  break;
					}
					
				}
			}
				if(flag==1)
				{
					sum=sum+arr[i];
				
					
				}
				
			}
		System.out.println(sum);
           
		return sum;
	}
	public static void main(String[] args) 
	{
		int arr[]={1,2,2,3,3};
		nonDublicateSum(arr);
		
	}

}
