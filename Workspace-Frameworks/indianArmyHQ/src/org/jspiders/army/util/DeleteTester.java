package org.jspiders.army.util;

import org.jspiders.army.dao.ArmyDao;
import org.jspiders.army.dto.ArmyDto;

public class DeleteTester 
{
	public static void main(String[] args) 
	{
		ArmyDto armyDto = new ArmyDto();
		ArmyDao armyDao = new ArmyDao();
		armyDao.delete(118);
	}
}
