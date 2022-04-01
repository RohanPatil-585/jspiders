package dynamicBank;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class startBankApp 
{
	public static void main(String[] args) 
	{
		int ch=1;
		int ch1=1;
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter customer = ");
		String name = s1.next();
	
		account a1 = accountDB.getAccount('s', 50000.00, name);
		account a2 = accountDB.getAccount('l', 50000.00, name);
	
		System.out.println("\t 1. create saving account \n\t 2. create loan account \n\t 3. exit");
		System.out.println("enter your choice = ");
		ch = s1.nextInt();

		while(ch<3)
		{	
			if(ch == 1)
			{
				switch(ch)
				{
					case 1:
						System.out.println(" === saving account ===");
						while(ch1<4)
						{
							System.out.println("\t 1. deposit \n\t 2. withdraw \n\t 3. balance enquiry \n\t 4. exit");
							System.out.println("enter your choice = ");
							ch1 = s1.nextInt();
							switch(ch1)
							{
								case 1:
									System.out.println("enter amount for deposit = ");
									double depositamt = s1.nextDouble();
									a1.deposit(depositamt);
									break;
									
								case 2:
									System.out.println("enter amount for withdraw = ");
									double withdrawamt = s1.nextDouble();
									a1.withdraw(withdrawamt);
									break;
									
								case 3:
									a1.balanceEnquiry();
									break;
							}
						}
					//	a1.balanceEnquiry();
						
						System.out.println();
						break;
						
					case 2:
						System.out.println(" === loan account ===");
						while(ch1<3)
						{
							System.out.println("\t 1. deposit \n\t 2. withdraw \n\t 3. balance enquiry \n\t 4. exit");
							switch(ch1)
							{
								case 1:
									System.out.println("enter amount for deposit = ");
									double depositamt = s1.nextDouble();
									a2.deposit(depositamt);
									break;
									
								case 2:
									System.out.println("enter amount for withdraw = ");
									double withdrawamt = s1.nextDouble();
									a2.withdraw(withdrawamt);
									break;
								
								case 3:
									a1.balanceEnquiry();
									break;
							}
						}
				}
			}
			else if(ch == 2)
			{
				switch(ch)
				{
										case 2:
						System.out.println(" === loan account ===");
						while(ch1<3)
						{
							System.out.println("\t 1. deposit \n\t 2. withdraw \n\t 3. balance enquiry \n\t 4. exit");
							switch(ch1)
							{
								case 1:
									System.out.println("enter amount for deposit = ");
									double depositamt = s1.nextDouble();
									a2.deposit(depositamt);
									break;
									
								case 2:
									System.out.println("enter amount for withdraw = ");
									double withdrawamt = s1.nextDouble();
									a2.withdraw(withdrawamt);
									break;
								
								case 3:
									a1.balanceEnquiry();
									break;
							}
						}
				}
			}
								
		}
	}
}
