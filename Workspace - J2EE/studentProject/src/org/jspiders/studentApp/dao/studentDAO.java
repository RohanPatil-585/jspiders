package org.jspiders.studentApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import org.jspiders.studentApp.dto.studentDTO;

public class studentDAO 
{
	public void insertData(studentDTO std)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into student.studentdata values(?,?,?,?)";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, std.getId());
			pstmt.setString(2, std.getName());
			pstmt.setString(3, std.getQualification());
			pstmt.setDouble(4, std.getPercentages());
			pstmt.executeUpdate();
			System.out.println("student data inserted successfully...");
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
	
	public Set<studentDTO> fatchAllData()
	{
		Set<studentDTO> set = new HashSet<studentDTO>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String qry = "select * from student.studentdata";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			stmt = con.createStatement();
			rs = stmt.executeQuery(qry);
			while(rs.next())
			{
				studentDTO dto = new studentDTO();
				dto.setId(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setQualification(rs.getString(3));
				dto.setPercentages(rs.getDouble(4));
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