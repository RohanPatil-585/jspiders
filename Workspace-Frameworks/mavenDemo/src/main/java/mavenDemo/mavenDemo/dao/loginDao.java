package mavenDemo.mavenDemo.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.springframework.session.data.gemfire.config.annotation.web.http.support.SessionAttributesIndexFactoryBean;

import mavenDemo.mavenDemo.dto.LoginDto;

public class loginDao 
{
	private SessionFactory factory;
	public Serializable save(LoginDto dto)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int i = 0;
		try 
		{
			i = (Integer)session.save(dto);
			transaction.commit();
			System.out.println("data saved to the database");
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return i;
	}
}
