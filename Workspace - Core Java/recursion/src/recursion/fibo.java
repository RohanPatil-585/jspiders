package recursion;

public class fibo
{
	 static int m=0,n=1,num=5;
	public static void fibo(int num)
	{
		int temp=m+n;
		m=n;
		n=temp;
		System.out.println(temp);
		if(num>0)
		{
			num--;
			fibo(num);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(m);
		System.out.println(n);
		fibo(num);
	}

}
