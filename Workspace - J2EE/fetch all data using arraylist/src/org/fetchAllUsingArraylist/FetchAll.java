package org.fetchAllUsingArraylist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FetchAll 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<employee> list = new ArrayList<employee>();
		String query = "select * from employee.employeedetails";
		int i = 1;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				employee emp = new employee();
				emp.id=rs.getInt(1);
				emp.name=rs.getString(2);
				emp.department=rs.getString(3);
				list.add(emp);
			}
			for (employee employee : list)
			{
				System.out.println("employee "+ i +" = " +employee.name);
				i++;
			}
		}
		catch (ClassNotFoundException | SQLException e) 
		{
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
					e.printStackTrace();
				}
			}
		}
	}
}
