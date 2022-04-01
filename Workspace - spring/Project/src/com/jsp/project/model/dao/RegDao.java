package com.jsp.project.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.project.dto.RegDTO;

@Repository
public class RegDao {
	@Autowired
	public SessionFactory factory;

	public RegDao() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public void regDao(RegDTO dto) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(dto);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
		} finally {
			session.close();
		}
	}
}
