package org.jspiders.weaponApp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class WeaponDAONamedQueries 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory(); 
	public List<WeaponDTO> fatchAllByNamedQuery()
	{
		//String hqlsyntax="select weapon from WeaponDTO weapon";
		Session session = factory.openSession();
		try
		{
			Query query = session.getNamedQuery("fatchAllByNamedQuery");
			List<WeaponDTO> list = query.list();
			return list;
		}
		finally
		{
			session.close();
		}
	}
	
	public List<Double> fatchRangeByModel(String model)
	{
		Session session = factory.openSession();
		try
		{			
			Query query = session.getNamedQuery("fatchRangeByModel");
			query.setParameter("mod",model);
			List<Double> doub = query.list();
			return doub;
		}
		finally
		{
			session.close();
		}
	}
	
	public long countAll()
	{
		Session session = factory.openSession();
		try
		{
			Query query = session.getNamedQuery("countAll");
			long count =(long) query.uniqueResult();
			return count;
		}
		finally
		{
			session.close();
		}
	}
	
	public List<WeaponDTO> sortingRecord()
	{
		Session session = factory.openSession();
		try
		{
			Query query = session.getNamedQuery("sortingRecord");
			List<WeaponDTO> list = query.list();
			return list;
		}
		finally
		{
			session.close();
		}
	}
}