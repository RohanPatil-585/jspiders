package numbers;

class square2 
{
	static int square(int num)
	{
			int squ=num*num;
			//System.out.println("square of"+" " + num +"= " +squ);
			return squ;
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
				int x = square(i); // returned value is asigned to x...
				System.out.println("square is ="+x);
		}
	}
}