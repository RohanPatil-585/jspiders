package com.intregration.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intregration.dto.medicalDTO;

@Component
public class medicalDAO 
{
	@Autowired
	private SessionFactory factory;

	public Serializable save(medicalDTO dto) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Integer k = 0;
		try {
			k = (Integer) session.save(dto);
			transaction.commit();
			System.out.println("save succesfuly");
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
		return k;
	}

}
