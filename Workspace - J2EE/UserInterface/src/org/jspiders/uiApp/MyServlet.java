package org.jspiders.uiApp;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		
		PrintWriter out = resp.getWriter();
		out.println("<html> <body bgcolor='yellow'>"
				+ "<h1>welcome "+name+" "+place+"</h1>"
						+ "</body></html>");
		out.flush();
		out.close();
	}
}