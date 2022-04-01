package com.om.SpringHibernate.dto;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MedicalDao 
{
	@Autowired
	SessionFactory factory;	
	public Serializable save(MedicalDto dto)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int k = 0;
		try 
		{
			k = (Integer)session.save(dto);
			transaction.commit();
			System.out.println("saved successfully....");
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
		return k;
	}
}