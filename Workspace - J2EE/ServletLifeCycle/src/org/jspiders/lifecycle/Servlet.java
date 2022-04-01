package org.jspiders.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet extends GenericServlet 
{
	public Servlet() 
	{
		System.out.println("servlet object is creadted...");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("servlet onject is initialized...");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
		String fname = req.getParameter("fn");
		String lname = req.getParameter("ln");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>"
				+ "<h1>welcome "+fname+lname+"</h1>"
						+ "</body></html>");
		out.flush();
		out.close();
		System.out.println("service methd is executed...");
	}

	@Override
	public void destroy() 
	{
		System.out.println("closing all the costly resources...");
	}
}