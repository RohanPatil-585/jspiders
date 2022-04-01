package FetchingRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FatchingMultipleRecord
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from jdbc.student";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("load and register the drivers....");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			System.out.println("establish a connection with database server...");
			pstmt = con.prepareStatement(query);
			System.out.println("create statement or plateform......");
			rs = pstmt.executeQuery();
			System.out.println("execute sql queries or sql statement.......");
			System.out.println("id \t name \t marks");
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double marks = rs.getDouble(3);
				System.out.println(id +"\t"+name+"\t"+marks);
			}
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
			if(pstmt!=null)
			{
				try 
				{
					pstmt.close();
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
