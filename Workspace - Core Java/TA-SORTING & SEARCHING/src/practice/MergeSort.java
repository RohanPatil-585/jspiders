package practice;

public class MergeSort 
{
	public static int[] sort(int[] array, int low, int high )
	{
		if(low<high)
		{
			int mid = (low+high)/2;
			sort(array,low,mid);
			sort(array,mid+1,high);
			merge(array,low,mid,high);
		}
		return array;
	}
	
	public static void merge(int[] array, int low, int mid, int high)
	{
		int leftsize = mid-low+1;
		int rightsize = high-mid;
		
		int[] leftarray = new int[leftsize];
		int[] rightarray = new int[rightsize];
		
		for (int i = 0; i < leftarray.length; i++) 
		{
			leftarray[i]=array[low+i];
		}
		
		for (int j = 0; j < rightarray.length; j++) 
		{
			rightarray[j]=array[mid+1+j];
		}
		
		int i = 0, j = 0, k = low;
		
		while(i<leftsize && j<rightsize)
		{
			if(leftarray[i]<rightarray[j])
			{
				array[k++]=leftarray[i++];
			}
			else
			{
				array[k++]=rightarray[j++];
			}
		}
		
		while(i<leftsize)
		{
			array[k++]=leftarray[i++];
		}
		
		while(j<rightsize)
		{
			array[k++]=rightarray[j++];
		}
	}
	
	public static void display(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] array = {5,4,3,2,1,7,8,9,4};
		display(array);
		System.out.println();
		int[] sortedarray = sort(array, 0, array.length-1);
		display(sortedarray);
	}
}
