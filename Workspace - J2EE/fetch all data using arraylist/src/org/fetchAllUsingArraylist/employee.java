package org.fetchAllUsingArraylist;

public class employee 
{
	public int id;
	public String name;
	public String department;
	
	@Override
	public int hashCode() 
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof employee)
		{
			employee e = (employee)obj;
			if(this.id==e.id)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}
