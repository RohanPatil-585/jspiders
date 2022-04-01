package infosys;

public class QuickSort 
{
	public static int partition(int array[], int startindex, int endindex)
	{
		int pivot = array[endindex];
		int i = startindex-1;
		for (int j = startindex; j < endindex; j++) 
		{
			if (array[j]<=pivot) 
			{
				i = i+1;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp1 = array[i+1];
		array[i+1] = array[endindex];
		array[endindex] = temp1;
		return i+1;
	}
	
	public static int[] quicksort(int[] array, int startindex, int endindex)
	{
		if(startindex < endindex)
		{
			int q = partition(array, startindex, endindex);
			quicksort(array, startindex, q-1);
			quicksort(array, q+1, endindex);
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		int[] array ={5,4,3,2,1};
		int[] sort = quicksort(array,0, array.length-1);
		for (int i = 0; i < sort.length; i++) 
		{
			System.out.print(sort[i]);
		}
	}
}
