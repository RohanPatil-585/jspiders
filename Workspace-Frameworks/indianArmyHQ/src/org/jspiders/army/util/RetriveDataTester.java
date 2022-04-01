package org.jspiders.army.util;

import org.jspiders.army.dao.ArmyDao;
import org.jspiders.army.dto.ArmyDto;

public class RetriveDataTester 
{
	public static void main(String[] args)
	{
		ArmyDao armyDao = new ArmyDao();
		ArmyDto armyDto = armyDao.retriveData(117);
		if(armyDto!=null)
		{
			System.out.println(armyDto);
		}
	}
}
