package arrayswap;
import java.util.Scanner;;
public class arrrayfunction 
{
	static Scanner s1=new Scanner(System.in);
	static int size;
	
	public static int[] createarray()
	{
		System.out.println("enter the array size");
		size=s1.nextInt();
		int[] a1=new int[size];
		return a1;
	}
	public static int[] addelement(int[] a1)
	{
		System.out.println("enter elements...  ");
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("enter elememt "+(i+1));
			a1[i]=s1.nextInt();
		}
		return a1;
	}
	public static void case1(int[] a1,int mid)
	{
		if(a1.length%2 != 0)
		{
			mid++;
		}
		for(int i=0;i<a1.length/2;i++)
		{
			a1[i]=a1[i]+a1[mid];
			a1[mid]=a1[i]-a1[mid];
			a1[i]=a1[i]-a1[mid];
			mid++;
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]);
		}
	}
	public static void main(String[] args) 
	{
		int[] a1=arrrayfunction.createarray();
		int[] a2=arrrayfunction.addelement(a1);
		arrrayfunction.case1(a2, a2.length/2);		
	}
}