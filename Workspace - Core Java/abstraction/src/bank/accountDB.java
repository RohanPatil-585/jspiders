package bank;
//factory design pattern
public class accountDB 
{
	/**
	 * this function is used to get an account from DB.
	 * caller function should passes 3 parameters.
	 * @param type --> this is to decide type of account
	 * 					's' --> saving account
	 * 					'l' --> loan account
	 * @param initamt --> initial amount to deposit in account.
	 * @param name --> name of the customer.
	 * 
	 * @return --> the function returns account type object.
	 */
	static account getAccount(char type, double initamt, String name)
	{
		account a1=null;
		if(type == 's')
		{
			a1=new savingaccount(name, initamt);
		}
		else if(type == 'l')
		{
			a1=new loneaccount(name, initamt);
		}
		return a1;
	}
}
