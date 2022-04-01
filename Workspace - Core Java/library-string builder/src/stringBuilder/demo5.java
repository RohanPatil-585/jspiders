package stringBuilder;

public class demo5 
{
	public static void main(String[] args) 
	{
		String s1 = "developer";
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(4));
		s1=sb.toString();
	}
}
