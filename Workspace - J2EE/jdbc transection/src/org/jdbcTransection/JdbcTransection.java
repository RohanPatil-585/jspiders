package org.jdbcTransection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcTransection
{
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		
		String stded = "insert into sampledatabase.studentedu values(?,?,?,?)";
		String stdper = "insert into sampledatabase.studentper values(?,?,?)";
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the id...");
		int id = s1.nextInt();
		System.out.println("enter the name...");
		String name = s1.next();
		System.out.println("enter the department...");
		String dept = s1.next();
		System.out.println("enter the percentages...");
		double perc = s1.nextDouble();
		System.out.println("enter the place...");
		String place = s1.next();
		s1.close();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			// disable autocommit mode
			con.setAutoCommit(false);
			
			//1st database operation
			pstmt = con.prepareStatement(stded);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, dept);
			pstmt.setDouble(4, perc);
			pstmt.executeUpdate();
			System.out.println("student educational record executed...");
			
			//2nd database operation
			pstmt1 = con.prepareStatement(stdper);
			pstmt1.setInt(1, id);
			pstmt1.setString(2, name);
			pstmt1.setString(3, place);
			pstmt1.executeUpdate();
			System.out.println("student educational record executed...");
			con.commit();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			try 
			{
				con.rollback();
				System.out.println("operations rolled back...");
			}
			catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally
		{			
			if(pstmt1!= null)
			{
				try 
				{
					pstmt1.close();
				}
				catch (SQLException e) 
				{		
					e.printStackTrace();
				}
			}
			if(pstmt!= null)
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
			if(con!= null)
			{
				try 
				{
					con.close();
				}
				catch (SQLException e) 
				{		
					e.printStackTrace();
				}
			}
		}
	}
}