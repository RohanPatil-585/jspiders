package ontomany.dao;

import ontomany.dto.ComputerDTO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

public class OneToManyDAO 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	
	public void save(ComputerDTO dto)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
			session.save(dto);
			transaction.commit();
		}
		catch(HibernateException e)
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