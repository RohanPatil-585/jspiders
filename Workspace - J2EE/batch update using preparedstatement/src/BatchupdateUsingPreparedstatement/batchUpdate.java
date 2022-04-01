package BatchupdateUsingPreparedstatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class batchUpdate 
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String inquery = "insert into student.login values (3,'dipak','dipak619','navsari')";
		String upquery = "update student.login set name='panchal' where id=2";
		try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("load and register the drivers....");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
				System.out.println("establish a connection with database server...");
				pstmt = con.prepareStatement(inquery);
				System.out.println("create statement or plateform for insert ......");
				pstmt.addBatch();
				int arr[] = pstmt.executeBatch();
				for(int i : arr)
				{
					System.out.println(i);
				}
				
				pstmt = con.prepareStatement(upquery);
				System.out.println("create statement or plateform for update ......");
				pstmt.addBatch();
				int arr1[] = pstmt.executeBatch();
				for(int i : arr1)
				{
					System.out.println(i);
				}				
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
