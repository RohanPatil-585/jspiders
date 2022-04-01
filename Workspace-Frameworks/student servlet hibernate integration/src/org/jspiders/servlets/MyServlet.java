package org.jspiders.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jspiders.dto.studentDto;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

//@WebServlet("/rohan")
public class MyServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    private SessionFactory factory = SessionFactoryUtil.getFactory();
    
 	@Override
 	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
 			throws ServletException, IOException {
 		// TODO Auto-generated method stub
 		super.doPost(req, resp);
 		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String city = req.getParameter("city");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>"
				+ "<h1>welcome "+name+" "+password+" "+city+"</h1>"
						+ "</bosy></html>");
	
		out.flush();
		out.close();

		/*Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		try 
		{
			studentDto dto = new studentDto();
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
		}*/
 	}
}