package bank1;

public class startBankApp 
{
	public static void main(String[] args) 
	{
		account a1 = accountDB.getAccount('s', 50000.00, "rohan");
		a1.balanceEnqury();
		a1.deposit(10000);
		a1.balanceEnqury();
		a1.withdraw(5000);
		a1.balanceEnqury();
		
		account a2 = accountDB.getAccount('L', 80000.00, "ronak");
		a1.balanceEnqury();
		a1.deposit(10000);
		a1.balanceEnqury();
		a1.withdraw(5000);
		a1.balanceEnqury();
	}
}
