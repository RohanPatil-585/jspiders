package metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetadataDemo 
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
		
			DatabaseMetaData dbmd = con.getMetaData();
			String drivername = dbmd.getDriverName();
			String url = dbmd.getURL();
			System.err.println("drivername = "+drivername);
			System.err.println("url = "+url);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from student.login");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.err.println(rsmd.getColumnCount());
			System.err.println(rsmd.getColumnLabel(2));
		}
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
			System.out.println("closed all the costly resourses.......");
		}
	}
}