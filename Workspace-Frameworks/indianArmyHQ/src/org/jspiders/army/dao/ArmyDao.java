package org.jspiders.army.dao;

import java.awt.print.Printable;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.army.dto.ArmyDto;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

public class ArmyDao 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	
	public void save(ArmyDto armyDto)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
			session.save(armyDto);
			transaction.commit();
		}
		catch(HibernateException e)
		{
			transaction.rollback();
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
	
	public ArmyDto retriveData(int id)
	{
		Session session = factory.openSession();
		ArmyDto armyDto = session.get(ArmyDto.class, id);
		session.close();
		return armyDto;
	}
	
	public void updateBattalian(int id , String NewBattalian)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		try 
		{
			ArmyDto armyDto = session.get(ArmyDto.class, id);
			if(armyDto!=null)
			{
				System.out.println("record present in the database....");
				armyDto.setBattalian(NewBattalian);
				session.update(armyDto);
				transaction.commit();
			}
			else
			{
				System.out.println("record not found.....");
			}
		}
		catch (HibernateException e)
		{
			transaction.rollback();
			e.printStackTrace();
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
		ArmyDto armyDto = session.get(ArmyDto.class, id);
		try 
		{
			if(armyDto!=null)
			{
				session.delete(armyDto);
				transaction.commit();
			}
			else
			{
				System.out.println("record not found....");
			}
		}
		catch (HibernateException e) 
		{
			transaction.rollback();
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
	
	public ArmyDto fatchByRegimentType(String type)
	{
		Session session = factory.openSession();
		try 
		{
			Query query = session.getNamedQuery("fatchByRegimentType");
			query.setParameter("regimenttype", type);
			ArmyDto armyDto = (ArmyDto) query.uniqueResult();
			return armyDto;
		} 
		finally
		{
			session.close();
		}
	}
	
	
}