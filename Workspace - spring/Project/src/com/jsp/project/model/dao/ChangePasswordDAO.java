package com.jsp.project.model.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.project.dto.ChangePasswordDTO;

@Repository
public class ChangePasswordDAO {
	public ChangePasswordDAO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	@Autowired
	public SessionFactory factory;
	public int changePAssword(ChangePasswordDTO changePasswordDTO)
	{
		String str="update RegDTO r set r.password=:pass where r.email=:em";
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try
		{
		Query query=(Query) session.createQuery(str);
		query.setParameter("pass",changePasswordDTO.getNewpass());
		query.setParameter("em", changePasswordDTO.getEmail());
		int n=query.executeUpdate();
		transaction.commit();
		return n;
		}
		catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
		finally
		{
			session.close();
		}
		return 0;
	}
}
