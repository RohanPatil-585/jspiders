package manytoone.dao;

import java.util.Collection;

import manytoone.dto.department;
import manytoone.dto.student;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

public class manytooneDao
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	
	public void save(Collection<student> students)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try 
		{
			for (student student : students) 
			{				
				session.save(student);
			}
			transaction.commit();
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			transaction.rollback();
		}
		finally
		{
			session.close();
		}
	}
}
