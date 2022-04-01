package org.jspiders.army.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jspiders.army.dto.ArmyDto;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

public class ArmyDaoHql 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	
	public List<ArmyDto> fetchAll()
	{
		Session session = factory.openSession();
		try
		{			
			Query query = session.getNamedQuery("fatchAll");
			List<ArmyDto> list = query.list();
			return list;
		}
		finally
		{
			session.close();
		}
	}
}
