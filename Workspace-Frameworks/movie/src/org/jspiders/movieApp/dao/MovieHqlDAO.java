package org.jspiders.movieApp.dao;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;
import org.jspiders.movieApp.dto.MovieDTO;

public class MovieHqlDAO 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	public Integer saveAndReturnId(MovieDTO dto)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
			Integer inte =(Integer)session.save(dto);
			transaction.commit();
			return inte;
		}
		catch(HibernateException h)
		{
			h.printStackTrace();
			transaction.rollback();
		}
		finally
		{
			session.close();
		}
		return null;
	}
	
	public void updateBudgetByName(String name,double budget)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{			
			Query query = session.getNamedQuery("updateBudgetByName");
			//List<MovieDTO> dto = query.list();
			query.setParameter("name", name);
			query.setParameter("budget", budget);
			query.executeUpdate();
			transaction.commit();
		}
		catch(HibernateException h)
		{
			h.printStackTrace();
			transaction.rollback();
		}
		finally
		{
			session.close();
		}
	}
	
	public List<MovieDTO> fetchAll()
	{
		Session session = factory.openSession();
		try
		{			
			Query query = session.getNamedQuery("fetchAll");
			List<MovieDTO> list = query.list();
			return list;
		}
		finally
		{
			session.close();
		}
	}
	
	public String fetchProducerNameByMovieName(String mname)
	{
		Session session = factory.openSession();
		try
		{			
			Query query =session.getNamedQuery("fetchProducerNameByMovieName");
			query.setParameter("name", mname);
			String str = (String)query.uniqueResult();
			return str;	
		}
		finally
		{
			session.close();
		}
	}
	
	public Long fetchCount()
	{
		Session session = factory.openSession();
		try
		{
			Query query = session.getNamedQuery("fetchCount");
			long lon = (long)query.uniqueResult();
			return lon;
		}
		finally
		{
			session.close();
		}
	}
	
	public double fetchMaxBudget()
	{
		Session session = factory.openSession();
		try
		{
			Query query = session.getNamedQuery("fetchMaxBudget");
			double d = (double)query.uniqueResult();
			return d;
		}
		finally
		{
			session.close();
		}
	}
	
	public void saveList(List<MovieDTO> list)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
			//Iterator<MovieDTO> i1 = list.iterator();
			System.out.println("size="+list.size());
			
//			for (int i = 0; i < list.size(); i++) {
//				session.save(list.get(i));
//				transaction.commit();
//				transaction=session.beginTransaction();
//			}
			for (MovieDTO movieDTO : list) {
				session.save(movieDTO);
				
				
			}
			session.getTransaction().commit();
//			while(i1.hasNext())
//			{
//				MovieDTO dto=i1.next();
//				session.save(dto);
//				transaction.commit();
//				transaction=session.beginTransaction();
//			}
		}
		catch(HibernateException h)
		{
			h.printStackTrace();
			transaction.rollback();
		}
		finally
		{
			session.close();
		}
	}
}