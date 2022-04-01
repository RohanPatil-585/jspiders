package org.interView.sarthaaApp;

public class MaxRowAndClm 
{
	public static void main(String[] args)
	{
		int arr[][]={{12,24,36},{21,31,11},{7,14,28}};
		for (int i = 0; i < arr.length; i++) 
		{
			int rowbig=arr[i][0];
			int colbig=arr[0][i];
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[i][j]>rowbig)
					rowbig=arr[i][j];
				if(arr[j][i]>colbig)
					colbig=arr[j][i];
				
			}
			System.out.println(i+1+" row big element is "+rowbig);
			System.out.println(i+1+" colm big element is "+colbig);
			
		}
		
	}

}
