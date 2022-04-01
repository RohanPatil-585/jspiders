package pack1;

public class account 
{
	String emailid;
	String password;
	long phoneno;
	void login(String emailid, String password)
	{
		this.emailid = emailid;
		this.password = password;
	
	}
	
	void login(long phoneno, String password)
	{
		
		this.password = password;
		this.phoneno = phoneno;
	}
}
