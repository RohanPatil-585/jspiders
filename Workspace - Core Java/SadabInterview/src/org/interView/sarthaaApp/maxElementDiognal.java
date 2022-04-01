package org.interView.sarthaaApp;

public class maxElementDiognal 
{
	public static void maxDiognal(int [][]a)
	{
		int libig=a[0][0];
		int rlbig=a[0][a[0].length-1];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{      
				if(i==j)
					if(a[i][j]>libig)
						libig=a[i][j];
				if(i+j==a.length-1)
					if(a[i][j]<rlbig)
						rlbig=a[i][j];
				
			}
			
		}
		System.out.println(libig);
		System.out.println(rlbig);
		
	}
	public static void main(String[] args)
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		maxDiognal(arr);
		
	}

}
