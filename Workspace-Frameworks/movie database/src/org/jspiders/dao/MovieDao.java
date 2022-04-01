package org.jspiders.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.dto.MovieDto;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

public class MovieDao 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	
	public List<MovieDto> fatchAll()
	{
		Session session = factory.openSession();
		try
		{
			Query query = session.getNamedQuery("fatchAll");
			List<MovieDto> list = query.list();
			return list;			
		}
		finally
		{
			session.close();
		}
	}
	
	public MovieDto fatchByMovieName(String name)
	{
		Session session = factory.openSession();
		try 
		{
			Query query = session.getNamedQuery("fatchByMovieName");
			query.setParameter("nm",name);
			MovieDto dto = (MovieDto)query.uniqueResult();
			return dto;
		}
		finally
		{
			session.close();
		}
	}
	
	public List<MovieDto> fatchMultipleByMovieName(String name)
	{
		Session session = factory.openSession();
		try 
		{
			Query query = session.getNamedQuery("fatchByMovieName");
			query.setParameter("nm",name);
			List<MovieDto> list = query.list();
			return list;
		}
		finally
		{
			session.close();
		}
	}
	
	public String fatchProducerNameByMovieName(String name)
	{
		Session session = factory.openSession();
		try
		{
			Query query = session.getNamedQuery("fatchProducerNameByMovieName");
			query.setParameter("nm",name);
			String producer = (String)query.uniqueResult();
			return producer;
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

	public double fatchMaxBudget()
	{
		Session session = factory.openSession();
		try
		{
			Query query = session.getNamedQuery("fatchMaxBudget");
			double maxbud = (double)query.uniqueResult();
			return maxbud;
		}
		finally
		{
			session.close();
		}
	}
	
	public void updateBudgetByMovieName(String name, double budget)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try 
		{
			Query query = session.getNamedQuery("updateBudgetByMovieName");
			query.setParameter("bud", budget);
			query.setParameter("nm", name);
			query.executeUpdate();
			transaction.commit();
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
	
	public Integer saveAndReturnId(MovieDto dto)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
			Integer id = (Integer)session.save(dto);
			transaction.commit();
			return id;
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
		return null;
	}
	
	public void saveList(List<MovieDto> list)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
			System.out.println("size="+list.size());
			
			for (MovieDto movieDto : list)
			{
				session.save(movieDto);
			}
		//	session.getTransaction().commit();
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
}