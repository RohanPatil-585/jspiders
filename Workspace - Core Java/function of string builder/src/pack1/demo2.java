package pack1;

public class demo2 
{
	public static void main(String[] args) 
	{
		String s1 = "java developer";
		StringBuilder sb = new StringBuilder(s1);
		
		System.out.println(sb);
		
		System.out.println("appending char ");
		sb.append('s');
		System.out.println(sb);
		
		System.out.println("inserting char ");
		sb.insert(2, 'w');
		System.out.println(sb);
		
		System.out.println("replace char ");
		sb.setCharAt(5, 'L');
		System.out.println(sb);
		
		System.out.println("reversing string ");
		sb.reverse();
		System.out.println(sb);

		s1 = sb.toString();
	}
}
