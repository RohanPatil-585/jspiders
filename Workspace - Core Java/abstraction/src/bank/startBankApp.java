package bank;

public class startBankApp 
{
	public static void main(String[] args) 
	{
		account a1 = accountDB.getAccount('s', 50000.00, "rohan");
		a1.balanceEnquiry();
		a1.deposit(10000.00);
		a1.balanceEnquiry();
		a1.withdraw(8000.00);
		a1.balanceEnquiry();
		
		System.out.println();
		System.out.println();
		
		account a2 = accountDB.getAccount('l', 50000.00, "rohan");
		a2.balanceEnquiry();
		a2.deposit(10000.00);
		a2.balanceEnquiry();
		a2.withdraw(8000.00);
		a2.balanceEnquiry();

	}
}
