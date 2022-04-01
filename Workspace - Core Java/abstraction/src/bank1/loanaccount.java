package bank1;

public class loanaccount implements account
{
		String custname;
		double accbal;
		
		public loanaccount(String custname, double accbal) 
		{
			this.custname = custname;
			this.accbal = accbal;
		}
		
		public void deposit(double amt)
		{
			System.out.println("depositing rs "+amt);
			accbal = accbal-amt;
		}	
		public void withdraw(double amt)
		{
			System.out.println("withdrawing rs "+amt);
			accbal = accbal+amt;
		}

		public void balanceEnqury() 
		{
			System.out.println("account balance = "+accbal);	
		}
}
