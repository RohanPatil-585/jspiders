package militry.army.indianArmy.util;

import militry.army.indianArmy.dao.IndianArmyDAO;
import militry.army.indianArmy.dao.IndianArmyDAOHql;

public class HqlUpdateTester 
{
	public static void main(String[] args) 
	{
		IndianArmyDAOHql hql = new IndianArmyDAOHql();
		hql.update("sf", 123);
	}
}