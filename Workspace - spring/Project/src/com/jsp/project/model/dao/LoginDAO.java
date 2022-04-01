package com.jsp.project.model.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.project.dto.LoginDTO;
import com.jsp.project.dto.RegDTO;
@Repository
public class LoginDAO {
	@Autowired
	public SessionFactory factory;
	public LoginDAO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public RegDTO loginDao(LoginDTO dto)
	{
		String str="select login from RegDTO login where login.email=:em and login.password=:pass";
		Session session=factory.openSession();
		Query query=(Query) session.createQuery(str);
		query.setParameter("em",dto.getEmail());
		query.setParameter("pass", dto.getPassword());
		RegDTO regDTO=(RegDTO) query.uniqueResult();
		return regDTO;
	}
}
