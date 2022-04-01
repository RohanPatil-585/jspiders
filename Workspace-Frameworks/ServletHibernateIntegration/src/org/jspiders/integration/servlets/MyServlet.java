package org.jspiders.integration.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;
import org.jspiders.integration.dto.StudentDto;
//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet 
{       
	private SessionFactory factory = SessionFactoryUtil.getFactory();
  	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  	{
  		String name = req.getParameter("name");
  		String password = req.getParameter("password");
  		String city = req.getParameter("city");
  		
  		PrintWriter writer = resp.getWriter();
  		writer.println("<html><body>"
				+ "<h1>welcome "+name+" "+password+" "+city+"</h1>"
						+ "</body></html>");
  		writer.flush();
  		writer.close();
 
  		Session session = factory.openSession();
  		Transaction transaction = session.beginTransaction();
  		try 
  		{
  			StudentDto dto = new StudentDto();
  			dto.setName(name);
  			dto.setPassword(password);
  			dto.setCity(city);
  			session.save(dto);
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
}