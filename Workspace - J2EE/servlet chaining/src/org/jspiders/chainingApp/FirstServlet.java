package org.jspiders.chainingApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/js")
public class FirstServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String pname = req.getParameter("pn");
		String pquantity = req.getParameter("pq");
		req.setAttribute("productname",pname);
		req.setAttribute("productquantity",pquantity);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("ss");
		
		dispatcher.forward(req, resp);
	}
}
