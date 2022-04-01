package largest_elements;

public class first_2nd_3rd_largest 
{
	public static void main(String[] args) 
	{
	//	int array[] = {10,34,9,111,98,27,36};
	//	int array[] = {2,3,4,5,6,7};
		int array[] = {29,11,111,45,24,125,67,117};
		int fbig = 0, sbig = 0, tbig = 0, forthbig = 0;
		for (int i = 0; i < array.length; i++) 
		{
			if(fbig<array[i])
			{	forthbig=tbig;
				tbig=sbig;
				sbig=fbig;
				fbig=array[i];
				
			}
			else if(sbig<array[i] && fbig>array[i])
			{
				forthbig=tbig;
				tbig=sbig;
				sbig=array[i];
			}
			else if(tbig<array[i] && sbig>array[i])
			{   forthbig=tbig;
				tbig=array[i];
			}
			else if(forthbig<array[i] && tbig>array[i])
			{
				forthbig=array[i];
			}
//			if(fbig<array[i])
//			{	forthbig=tbig;
//				tbig=sbig;
//				sbig = fbig;
//				fbig = array[i];
//			}
//			
//			// if(array[i]>sbig && array[i]<fbig)
//			if(sbig<array[i])
//			{
//				tbig = sbig;
//				sbig = array[i];
//			}
//			
//			 //if(array[i]>tbig && array[i]<sbig && array[i]<fbig)
//			if(tbig<array[i])
//			{
//			//	System.out.println("third big = "+tbig);
//				forthbig = tbig;
//				tbig = array[i];
//			}
//			
//			// if(array[i]>forthbig && array[i]<tbig && array[i]<sbig && array[i]<fbig)
//			if(forthbig<array[i]) 
//			{
//				forthbig = array[i];
//			}
		}
		System.out.println("first big = "+fbig);
		System.out.println("second big = "+sbig);
		System.out.println("third big = "+tbig);
		System.out.println("forth big = "+forthbig);
	}
}
