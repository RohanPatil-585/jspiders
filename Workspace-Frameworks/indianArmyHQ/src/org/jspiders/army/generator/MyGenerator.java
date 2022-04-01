package org.jspiders.army.generator;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.sql.ordering.antlr.Factory;
import org.jspiders.army.dao.ArmyDao;
import org.jspiders.army.dto.ArmyDto;
import org.omg.CORBA.portable.IndirectionException;

public class MyGenerator implements IdentifierGenerator
{
	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1)
			throws HibernateException 
	{
		int id = 111;
		ArmyDao armyDao = new ArmyDao();
		ArmyDto armyDto = armyDao.retriveData(id);
		while(armyDto!=null)
		{
			armyDto = armyDao.retriveData(++id);
		}
		return id;
	}
	
}
