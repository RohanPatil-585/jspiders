package deleteSingleRecordUsingstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteRecord 
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		
		String query = "delete from jdbc.student where id=1";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("load and register the drivers.........");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			System.out.println("eshtablishing the connection with database server....");
			stmt=con.createStatement();
			System.out.println("statement or plateform created.....");
			stmt.executeUpdate(query);
			System.out.println("data deleted........");
		}
		catch (ClassNotFoundException | SQLException e) 
		{
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
