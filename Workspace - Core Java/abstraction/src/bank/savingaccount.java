package bank;

public class savingaccount implements account
{
	String custname;
	double accbal;
	public savingaccount(String custname, double accbal) 
	{
		this.custname = custname;
		this.accbal = accbal;
	}
	
	public void deposit(double amt)
	{
		System.out.println("depositing rs "+amt);
		accbal = accbal+amt;
	}
	
	public void withdraw(double amt)
	{
		System.out.println("withdrawing rs "+amt);
		accbal = accbal-amt;
	}
	
	public void balanceEnquiry()
	{
		System.out.println("account balance = "+accbal);
	}
}
