package org.jspiders.loginApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qry = "select * from student.login where name=? and password=?";
		String name = req.getParameter("nm");
		String password = req.getParameter("ps");
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
				pstmt = con.prepareStatement(qry);
				pstmt.setString(1,name);
				pstmt.setString(2,password);
				rs = pstmt.executeQuery();
				if(rs.next())
				{
					int id = rs.getInt(1);
					String uname = rs.getString(2);
					String upassword = rs.getString(3);
					String city = rs.getString(4);
					
					PrintWriter out = resp.getWriter();
					out.println("<html><body>"
							+ "<h1>welcome "+uname+" "+upassword+" "+id+" "+city+"</h1>"
									+ "</bosy></html>");
					
					out.flush();
					out.close();
				}				
			}
			catch (ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(rs!=null)
				{
					try 
					{
						rs.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
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