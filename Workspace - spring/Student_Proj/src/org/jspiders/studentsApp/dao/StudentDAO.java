package org.jspiders.studentsApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.jspiders.studentsApp.dto.StudentData;

public class StudentDAO {
	
	public void insertData(StudentData data)
	{
		Connection con=null;
		PreparedStatement pst=null;
		
		String qry="insert into jsk.Student values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=jsk1234");
			pst=con.prepareStatement(qry);
			pst.setInt(1, data.getId());
			pst.setString(2, data.getName());
			pst.setString(3, data.getQualification());
			pst.setDouble(4, data.getPercentage());
			pst.executeUpdate();
			System.out.println("Student Data insert Succesfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(pst!=null)
			{
				try {
					pst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public Set<StudentData> fetchAllData()
	{
		Set<StudentData> s=new HashSet<StudentData>();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String qry="select * from jsk.Student";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=jsk1234");
			st=con.createStatement();
			rs=st.executeQuery(qry);
			while (rs.next()) {
				StudentData data=new StudentData();
				data.setId(rs.getInt(1));
				data.setName(rs.getString(2));
				data.setQualification(rs.getString(3));
				data.setPercentage(rs.getDouble(4));
				
				s.add(data);
			}
			return s;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(st!=null)
			{
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return Collections.EMPTY_SET;
	}
}
