package militry.army.indianArmy.util;

import java.util.List;

import militry.army.indianArmy.dao.IndianArmyDAOHql;
import militry.army.indianArmy.dto.IndianArmyDTO;

public class HqlReadAllData 
{
	public static void main(String[] args) 
	{
		IndianArmyDAOHql hql = new IndianArmyDAOHql();
		List dto=hql.fatchAllData();
		for (int i = 0; i < dto.size(); i++)
		{
			System.out.println(dto.get(i));
		}
	}
}