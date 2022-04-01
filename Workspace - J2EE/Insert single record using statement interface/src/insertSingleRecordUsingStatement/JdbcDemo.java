package insertSingleRecordUsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo 
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		String query = "insert into jdbc.student values(1,'rohan',99.99)";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver class loaded and registered....");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			System.out.println("connection established with database server....");
			stmt = con.createStatement();
			System.out.println("plateform created...........");
			stmt.executeUpdate(query);
			System.out.println("data inserted........");
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(stmt!=null)
			{
				try 
				{
					stmt.close();
				}
				catch (SQLException e) 
				{
					// TODO Auto-generated catch block
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("closed all the costly resourses...........");
		}
	}
}
