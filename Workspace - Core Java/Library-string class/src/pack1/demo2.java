package pack1;

public class demo2 
{
	public static void main(String[] args) 
	{
		String s1 = new String("javadeveloper");
		System.out.println("given string is = "+s1);
		
		System.out.println("total chars are = "+s1.length());
		System.out.println("char @ pos 4 = "+s1.charAt(4));
		System.out.println("first occurance of char 'e' ="+s1.indexOf('e'));
		System.out.println("second occurance of char 'e' ="+s1.indexOf('e',6));
		System.out.println("last occurance of char 'e' ="+s1.lastIndexOf('e'));
		System.out.println("contains 'dev' ="+s1.contains("dev"));
		System.out.println("starts with 'java' ="+s1.startsWith("java"));
		System.out.println("ends with 'per' ="+s1.endsWith("per"));
		System.out.println("substring ="+s1.substring(8));
		System.out.println("substring ="+s1.substring(4, 11));
		System.out.println("uppercase ="+s1.toUpperCase());
		System.out.println("uppercase ="+s1.toUpperCase());
		System.out.println(s1);
	}
}
