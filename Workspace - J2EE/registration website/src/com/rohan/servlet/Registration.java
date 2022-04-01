package com.rohan.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
@MultipartConfig(fileSizeThreshold=1024*1024*2,
maxFileSize=1024*1024*10,
maxRequestSize=1024*1024*50)
public class Registration extends HttpServlet 
{
	
	private static final String folder_name = "images";
    public Registration() 
    {
    
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String query = "insert into student.registration (first_name,Middle_name,last_name,dob,mobile,email,country,city,gender,aoe,file,address)"
				+ " values (?,?,?,?,?,?,?,?,?,?,?,?)";
		System.out.println("dopost method..........");
		response.setContentType("text/html;charset:UTF-8");
		PrintWriter writer = response.getWriter();
		int i = 0;
		
		String check ="";
		String filePath = "";
		Enumeration<String> parameters = request.getParameterNames();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			preparedStatement = connection.prepareStatement(query);
			while (parameters.hasMoreElements())
			{
				i++;
				String string = parameters.nextElement();
				String values = request.getParameter(string);
				System.out.println(values);
				
//				if(values.equals(request.getParameter("file")))
//				{
//					System.out.println("inside file block...");
//					String file_location = "E:\\Workspace - J2EE\\registration website\\WebContent\\images";
//					System.out.println("file location = "+file_location);
//					Part part = request.getPart("file");
//					File file = new File(file_location);
//					System.out.println("file object = "+file_location);
//					String file_name = getFileName(part);
//					part.write(file_location + file.separator + file_name);
//					filePath = file_location + file.separator + file_name;
//					System.out.println("filePath = "+filePath);					
//					values = filePath;
//					System.out.println("values for file operation.. "+values);
//				}
				
				if(values.equals(request.getParameter("java")))
				{
					check = check + request.getParameter("java");
					System.out.println("check = "+check);
//					preparedStatement.setString(i, check);
				}
				else if (values.equals(request.getParameter("python"))) 
				{
					check = check+" " + request.getParameter("python");
					System.out.println("check = "+check);
//					preparedStatement.setString(i, check);
					i--;
				}
				preparedStatement.setString(10, check);
				preparedStatement.setString(i, values);
			}
			System.out.println(check);
			preparedStatement.executeUpdate();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getFileName(Part part)
	{
		String fileNameWithExt = Paths.get(part.getSubmittedFileName()).getFileName().toString();
		return fileNameWithExt;
	}
}