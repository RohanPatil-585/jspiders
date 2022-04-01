package practice;

public class QuickSort 
{
	public static int partition(int[] array, int sindex, int eindex)
	{
		int pivot = array[sindex];
		int i = sindex-1;
		
		for (int j = sindex; j < eindex; j++) 
		{
			if(array[j]<=pivot)
			{
				i=i+1;
				int temp = array[i];
				array[i]= array[j];
				array[j]= temp;
			}
		}
		
		int temp1 = array[i+1];
		array[i+1] = array[eindex];
		array[eindex]= temp1;
		
		return i+1;
	}
	
	public static void display(int[] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public static int[] quickSort(int[] array, int sindex, int eindex)
	{
		if(sindex<eindex)
		{
			int q = partition(array,sindex,eindex);
			quickSort(array,sindex,q-1);
			quickSort(array,q+1,eindex);
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		int[] array = {9,8,7,6,5,4,3,2,1};
		System.out.println();
		display(array);
		System.out.println();
		int[] sortedarray = quickSort(array,0,array.length-1);
		display(sortedarray);
	}
}