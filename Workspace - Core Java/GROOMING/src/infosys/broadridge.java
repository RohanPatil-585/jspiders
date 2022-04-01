package infosys;

public class broadridge
{
	
	public static void test(int pos,String gv,String mn)
	{
		String[] st=mn.split(" ");
		for (int i = 0; i < st.length; i++)
		{
			
			if(i==pos)
			{
				System.out.print(gv+" ");
			}
		System.out.print(st[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		String s1="my name saumya";
		String s2="good";
		test(2,s2,s1);
	}
}
