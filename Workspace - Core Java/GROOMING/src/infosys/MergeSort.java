package infosys;

public class MergeSort 
{
	public static int[] sort(int array[], int lowindex, int highindex)
	{
		if(lowindex < highindex)
		{			
			int mid = (lowindex+highindex)/2;
			sort(array, lowindex, mid);
			sort(array, mid+1, highindex);
			merge(array,lowindex,mid,highindex);
		}
		return array;
	}
	
	public static void merge(int array[], int low, int mid, int high)
	{
		int leftsize = mid-low+1;
		int rightsize = high-mid;
		
		int[] leftarray = new int[leftsize];
		int[] rightarray = new int[rightsize];
		
		for (int i = 0; i < rightarray.length; i++) 
		{
			leftarray[i] = array[low+i];
		}
		for (int j = 0; j < leftarray.length; j++) 
		{
			rightarray[j] = array[mid+1+j];
		}
		int i=0,j=0,k=low;
		
		while(i<leftsize && j<rightsize)
		{
			if(leftarray[i]<rightarray[j])
			{
				array[k++] = leftarray[i++];
			}
			else
			{
				array[k++] = rightarray[j++]; 
			}
		}
		
		while(i<leftsize)
		{
			array[k++] = leftarray[i++];
		}
		while(j<rightsize)
		{
			array[k++] = rightarray[j++];
		}
	}
	public static void main(String[] args) 
	{
		int[] array = {8,7,6,5,4,3,2,1};
		int[] sorting = sort(array, 0, array.length-1);
		for (int i = 0; i < sorting.length; i++)
		{
			System.out.print(sorting[i]);
		}
	}
}
