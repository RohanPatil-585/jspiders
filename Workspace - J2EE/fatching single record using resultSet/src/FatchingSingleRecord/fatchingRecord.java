package FatchingSingleRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fatchingRecord
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from jdbc.student";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("loading and registering the drivers...");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			System.out.println("establishing the connection with database server.......");
			stmt = con.createStatement();
			System.out.println("statement or plateform created.....");
			rs=stmt.executeQuery(query);
			System.out.println("selecting all");
			boolean val = rs.absolute(2);
			if(val)
			{
				int id = rs.getInt("id");
				String name = rs.getString(2);
				double marks = rs.getDouble(3);
				System.out.println(id+"\t"+name+"\t"+marks);
			}
		}
		catch (ClassNotFoundException | SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
