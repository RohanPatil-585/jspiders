package org.jspiders.studentdatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		String sid = req.getParameter("i");
		int id = Integer.parseInt(sid);
		String name = req.getParameter("nm");
		String dept = req.getParameter("de");
		String sperc = req.getParameter("pe");
		double perc = Double.parseDouble(sperc);
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>"
				+ "<h1>welcome "+name+" "+dept+"</h1>"
						+ "</bosy></html>");
		
		out.flush();
		out.close();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into student.studentdata values(?,?,?,?)";
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
				pstmt = con.prepareStatement(qry);
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, dept);
				pstmt.setDouble(4, perc);
				pstmt.executeUpdate();
			}
			catch (ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(pstmt!=null)
				{
					try 
					{
						pstmt.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
				if(con!=null)
				{
					try 
					{
						con.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
			}
	}
}