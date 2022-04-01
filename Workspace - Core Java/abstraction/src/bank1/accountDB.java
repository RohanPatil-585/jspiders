package bank1;

public class accountDB 
{
	static account getAccount(char type, double initamt, String name)
	{
		account a1 = null;
		if(type == 's')
		{
			a1 = new savingaccount(name, initamt);
		}
		else if(type == 'L')
		{
			a1 = new loanaccount(name, initamt);
		}
		return a1;
	}
}
