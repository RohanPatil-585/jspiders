package org.jspiders.weaponApp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class WeaponDAO 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	public void save(WeaponDTO dto)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{			
			session.save(dto);
			transaction.commit();
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			transaction.rollback();
			System.out.println("saving transection...");
		}
		finally
		{
			session.close();
			//factory.close();
			System.out.println("closing all the costly resources...");
		}
	}
	public WeaponDTO fatchById(int id)
	{
		Session session = factory.openSession();
		Transaction transection = session.beginTransaction();
		WeaponDTO dto = session.get(WeaponDTO.class, id);
		session.close();
		//factory.close();
		return dto;
	}
	
	public void update(int id, String newtype)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		WeaponDTO dto = session.get(WeaponDTO.class, id);
		try
		{			
			if(dto!=null)
			{
					dto.setType(newtype);
					session.update(dto);
					transaction.commit();
			}
			else
			{
				System.out.println("entity not found...");
			}
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			transaction.commit();
		}
		finally
		{
			session.close();
		}
	}
	
	public void delete(int id)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		WeaponDTO dto = session.get(WeaponDTO.class, id);
		try
		{
			if(dto!=null)
			{
					session.delete(dto);
					transaction.commit();
			}
			else
			{
				System.out.println("entity not found...");
			}
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			transaction.rollback();
		}
		finally
		{
			session.close();
		}
	}
}