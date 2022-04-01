package org.jspiders.studentAnnotationApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/rohan")
public class MyServletAnnotation extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
		Enumeration<String> keynum = req.getParameterNames();
		while(keynum.hasMoreElements())
		{
			String key = keynum.nextElement();
			String val = req.getParameter(key);
		
//		String name = req.getParameter("nm");
//		String place = req.getParameter("pl");
//		String age = req.getParameter("ag");
//		String gender = req.getParameter("ge");
//		String adress = req.getParameter("ad");
//		String contact = req.getParameter("cn");
//		String relationshipstatus = req.getParameter("rs");
//		String nationality = req.getParameter("na");
		 PrintWriter out = resp.getWriter();
		 out.println("<html> <body bgcolor='yellow'>"
					+ "<h1>welcome "+val+"");
		 out.flush();
		 out.close();
		}
	}
}