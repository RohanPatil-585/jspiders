package org.jspiders.employeeApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import org.jspiders.employeeApp.dto.EmployeeDTO;

public class employeeDAO 
{
	public void insertDataInData(EmployeeDTO emp)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String qry = "insert into employee.employeedetails values (?,?,?)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getDepartment());
			pstmt.executeUpdate();
			System.out.println("employee data inserted successfully...");
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
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
	
	public Set<EmployeeDTO> insertDataTofile()
	{
		Set<EmployeeDTO> set = new HashSet<EmployeeDTO>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String qry = "select * from employee.employeedetails";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			stmt = con.createStatement();
			rs = stmt.executeQuery(qry);
			while(rs.next())
			{
				EmployeeDTO dto = new EmployeeDTO();
				dto.setId(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setDepartment(rs.getString(3));
				set.add(dto);
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
			if(stmt!=null)
			{
				try 
				{
					stmt.close();
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
		return set;
	}
}