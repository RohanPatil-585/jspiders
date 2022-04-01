\package main.java.com.loginapp.LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from student.login where name=? and password=?";
		// TODO Auto-generated method stub
		//doGet(req, resp);
		
		resp.setContentType("text/html");
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		PrintWriter out = resp.getWriter();
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, uname);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				
			//	RequestDispatcher dispatcher = req.getRequestDispatcher("success.html");
			//	dispatcher.forward(req, resp);
			
				//	out.println("<html><body>"
			//			+ "<h1>welcome "+uname+" "+pass+"</h1>"
			//					+ "</bosy></html>");
				
				resp.sendRedirect("success.html");
				
				out.flush();
				out.close();
			}
			else
			{
			//	out.println("<html><body>"
				//		+ "<h1> incorrect username or password </h1>"
					//			+ "</bosy></html>");
		
					RequestDispatcher dispatcher = req.getRequestDispatcher("fail.html");
				dispatcher.include(req, resp);
				
			//	resp.sendRedirect("fail.html");
				
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
