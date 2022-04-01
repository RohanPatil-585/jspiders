package onetoone.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

import onetoone.dto.AccountDTO;

public class OneToOneDAO 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	public void save(AccountDTO dto)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try 
		{
			session.save(dto);
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