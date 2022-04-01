package stringBuilder;

public class demo4 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("developer");
		System.out.println(sb);
		
		System.out.println("appending the char ");
		sb.append('s');
		System.out.println(sb);
		
		System.out.println("inserting the char ");
		sb.insert(2, 'w');
		System.out.println(sb);
		
		System.out.println("replace the char ");
		sb.setCharAt(5, 'L');
		System.out.println(sb);
		
		System.out.println("reversing the string ");
		sb.reverse();
		System.out.println(sb);
	}
}
