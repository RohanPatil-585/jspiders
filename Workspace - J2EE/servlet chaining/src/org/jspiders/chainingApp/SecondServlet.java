package org.jspiders.chainingApp;
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

@WebServlet("/ss")
public class SecondServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		String name = (String)req.getAttribute("productname");
		String quantity = (String)req.getAttribute("productquantity");
		int pquantity=Integer.parseInt(quantity);
		double price = 4000.00;
		double totalsum=(price*pquantity);
		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor='yellow'><h1>product details.."+name+" "+pquantity+" "+totalsum+"</h1></body></html>");
		out.flush();
		//out.close();
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		
		String query = "insert into sampledatabase.product values(?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, quantity);
			pstmt.setDouble(3, totalsum);
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
			if(connection!=null)
			{
				try 
				{
					connection.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}

		}
	}
}