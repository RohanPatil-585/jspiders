package batchUsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchupdateUsingStatementInterface 
{
		public static void main(String[] args)
		{
			Connection con = null;
			Statement stmt = null;
			String inquery = "insert into student.login values (2,'ronak','ronak619','vapi')";
			String upquery = "update student.login set name='rohan' where id=1";
			String dequery = "delete from student.login where id=3";
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("load and register the drivers....");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
					System.out.println("establish a connection with database server...");
					stmt = con.createStatement();
					System.out.println("create statement or plateform......");
					stmt.addBatch(inquery);
					stmt.addBatch(upquery);
					stmt.addBatch(dequery);
					int res[] = stmt.executeBatch();
					System.out.println("execute sql queries or sql statement.......");
					for(int i : res)
					{
						System.out.println(i);
					}
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
					System.out.println("closed all the costly resourses.......");
				}
		}
}
