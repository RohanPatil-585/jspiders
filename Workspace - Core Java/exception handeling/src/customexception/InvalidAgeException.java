package customexception;

public class InvalidAgeException extends Exception
{
	String s;
	
	public InvalidAgeException(String s)
	{
		super(s);
		this.s = s;
	}

	public static void main(String[] args) 
	{
		String str = "InvalidAgeException";
		
	}
}
