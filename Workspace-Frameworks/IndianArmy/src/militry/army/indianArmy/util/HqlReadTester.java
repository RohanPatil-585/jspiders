package militry.army.indianArmy.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import militry.army.indianArmy.dao.IndianArmyDAO;
import militry.army.indianArmy.dao.IndianArmyDAOHql;
import militry.army.indianArmy.dto.IndianArmyDTO;

public class HqlReadTester 
{
	public static void main(String[] args) 
	{
		IndianArmyDAOHql hqldao = new IndianArmyDAOHql();
		IndianArmyDTO dto = hqldao.fetchByRegimentType("dfs");
		System.out.println(dto);
		System.out.println(dto.getSateliteSupport());
		
		System.out.println();
		
		String type = hqldao.fatchTypeById(116);
		System.out.println(type);
		
		System.out.println();
		Object[] obj = hqldao.fatchregimentIdAndRegimentTypeByPlatun(12);
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		
		System.out.println();
		dto = hqldao.fatchDataByBattalian("htj");
		System.out.println(dto);
		
		System.out.println();
		String str = hqldao.fatchTypeByBattalian("htj");
		System.out.println(str);
	}
}
