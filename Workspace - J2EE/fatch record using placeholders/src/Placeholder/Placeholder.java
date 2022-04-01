package Placeholder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Placeholder 
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from jdbc.student where id=?";
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the id to be fetched = ");
		int id1 = s1.nextInt();
		s1.close();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("load and register the drivers....");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
				System.out.println("establish a connection with database server...");
				pstmt = con.prepareStatement(query);
				System.out.println("create statement or plateform......");
				//setting value for placeholder before execution....
				pstmt.setInt(1, id1);
				rs = pstmt.executeQuery();
				System.out.println("execute sql queries or sql statement.......");
				if(rs.next())
				{
					String name = rs.getString(2);
					double marks = rs.getDouble(3);
					System.out.println("name = "+name+"\t"+" marks = "+marks);
				}
				else
				{
					System.out.println("no data found....");
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
