package org.jspiders.computerApp.dao;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import org.jspiders.computerApp.dto.ComputerDTO;

public class ComputerDAO 
{
	public void insertData(ComputerDTO dto)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into sampledatabase.computerdetails values(?,?,?,?,?)";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1,dto.getId());
			pstmt.setString(2,dto.getBrand());
			pstmt.setString(3,dto.getProcessor());
			pstmt.setString(4,dto.getModel());
			pstmt.setString(5,dto.getRamsize());
			pstmt.executeUpdate();
			System.out.println("computer data inserted successfully....");
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
	
	public Set<ComputerDTO> fatchRecord()
	{
		Set<ComputerDTO> set = new HashSet<ComputerDTO>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String qry = "select * from sampledatabase.computerdetails";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			stmt = con.createStatement();
			rs = stmt.executeQuery(qry);
			while(rs.next())
			{
				ComputerDTO dto = new ComputerDTO();
				dto.setId(rs.getInt(1));
				dto.setBrand(rs.getString(2));
				dto.setProcessor(rs.getString(3));
				dto.setModel(rs.getString(4));
				dto.setRamsize(rs.getString(5));
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