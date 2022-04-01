package numbers;

class gropattarn1
{
	public static void main(String[] args) 
	{
		int n=5;
		int sp=4;
		for(int i=0;i<n;i++)
		{
			for(int k=sp;k>0;k--)
			{
				System.out.print(" ");
			}
			sp--;
			for(int j=0; j<=i;j++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
