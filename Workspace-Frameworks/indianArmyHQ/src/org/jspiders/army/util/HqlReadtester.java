package org.jspiders.army.util;

import java.util.List;


import org.jspiders.army.dao.ArmyDao;
import org.jspiders.army.dao.ArmyDaoHql;
import org.jspiders.army.dto.ArmyDto;

public class HqlReadtester 
{
	public static void main(String[] args)
	{
		ArmyDaoHql armyDaoHql = new ArmyDaoHql();
		List<ArmyDto> list = armyDaoHql.fetchAll();
		list.forEach(dto->{System.out.println(dto);});
	}
}
