package org.jspiders.weaponApp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class WeaponHQLDAO 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	
	public List<WeaponDTO> fatchAll()
	{
		String hqlSyntax="select weapon from WeaponDTO weapon";
		Session session = factory.openSession();
		try
		{
			Query query = session.createQuery(hqlSyntax);
			List<WeaponDTO> list = query.list();
			return list;			
		}
		finally
		{
			session.close();
		}
	}
	
	public List<String> allTypeByModel(String model)
	{
		String hqlsyntax="select weapon.type from WeaponDTO weapon where weapon.model=:mod";
		Session session = factory.openSession();
		try
		{
			Query query = session.createQuery(hqlsyntax);
			query.setParameter("mod",model);
			List<String> list = query.list();
			return list;
		}
		finally
		{
			session.close();
		}
	}
	
	public Long fatchAllCount()
	{
		String hqlSyntax="select count(weapon) from WeaponDTO weapon";
		Session session = factory.openSession();
		try
		{
			Query query = session.createQuery(hqlSyntax);
			long count =(long) query.uniqueResult();
			return count;			
		}
		finally
		{
			session.close();
		}
	}
}