package LoginValidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginValidation 
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from student.login where name=? and password=?";
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the user name = ");
		String name = s1.next();
		System.out.println("enter the password = ");
		String password = s1.next();
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
				pstmt.setString(1, name);
				pstmt.setString(2, password);
				rs = pstmt.executeQuery();
				System.out.println("execute sql queries or sql statement.......");
				if(rs.next())
				{
					int id = rs.getInt(1);
					String name1 = rs.getString(2);
					String pass = rs.getString(3);
					String city = rs.getString(4);
					System.out.println(" id = "+id+"\t"+" name = "+name1+"\t"+" pass = "+pass+"\t"+" city = "+city);
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
