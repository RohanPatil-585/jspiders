package org.jspiders.army.util;

import org.jspiders.army.dao.ArmyDao;
import org.jspiders.army.dto.ArmyDto;

public class SaveTester 
{
	public static void main(String[] args) 
	{
		ArmyDto armyDto = new ArmyDto();
		armyDto.setRegiment_type("airsupport");
		armyDto.setBattalian("4th");
		armyDto.setPlatuns("55");
		armyDto.setSatelitesupport("jesper");
		armyDto.setArtylarysupport("howitzer");
		armyDto.setStrength(30000);
		ArmyDao armyDao = new ArmyDao();
		armyDao.save(armyDto);
	}
}
