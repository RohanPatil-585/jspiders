package pack1;
import java.util.Scanner;
public class mainaccount
{
	public static void main(String[] args)
	{
		int ch=1;
		Scanner s1 = new Scanner(System.in);
		account a1 = new account();
		//while(ch<3)
		//{
			System.out.println("\t 1. email \n \t 2. phone no \n \t 3. exit");
			System.out.println("enter your choice = ");
			ch = s1.nextInt();
			switch(ch)
			{
				case 1:
						System.out.println("enter emailid = ");
						String email = s1.next();
						
						System.out.println("enter password = ");
						String pass = s1.next();
						
						if(email.contains("@gmail.com"))
						{
							a1.login(email, pass);
							System.out.println("login success ... ");
							
						}
						else
						{
							System.out.println("login failed ... ");
						}
						
						break;
						
				case 2:
						System.out.println("enter phone no = ");
						String phone = s1.next();
						
						System.out.println("enter password = ");
						String passw = s1.next();					
						
						if(phone.length()==10)
						{
							a1.login(Long.parseLong(phone), passw);
							System.out.println("login success ... ");
							
						}
						else
						{
							System.out.println("login failed ...");
						}
						break;

			}
			s1.close();
		//}
	}
}
