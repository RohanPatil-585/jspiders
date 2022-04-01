package main.java.servlets;
import java.io.Externalizable;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.ObjectInputStream.GetField;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileUploadServlet
 */
@WebServlet("/FileUploadServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2,
						maxFileSize=1024*1024*10,
						maxRequestSize=1024*1024*50)
public class FileUploadServlet extends HttpServlet 
{
	private static final String save_dir="images";
    public FileUploadServlet() 
    {
    
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "insert into student.employee_image (fname,lname,path,filename,id) values(?,?,?,?,?)";
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		String savepath = "E:\\Workspace - J2EE\\employee_image\\WebContent" + File.separator + save_dir;
		System.out.println("savepath = "+savepath);
		
		File file = new File(savepath);
		System.out.println("file = "+file.toString());
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		String fname = request.getParameter("firstname");
		System.out.println("fname = "+fname);
		
		String lname = request.getParameter("lastname");
		System.out.println("lname = "+lname);
		
		Part part = request.getPart("image");
		System.out.println("part = "+part.toString());
		
	//	String filename = extractFileName(part);
		String filename = getFileName(part);
		System.out.println("filename = "+filename);
	//	part.write(savepath + file.separator + filename);
		System.out.println("overall path"+savepath + file.separator + filename);
		
		part.write(savepath + file.separator + filename);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			String filepath = savepath + file.separator + filename;
			pstmt.setString(3, filepath);
			pstmt.setString(4, filename);
			pstmt.setInt(5, id);
			pstmt.executeUpdate();
		//	writer.println("<html><body>image inserted successfully...</body></html>");
			writer.println("<center><h1>image inserted successfully...</h1></center>");
			writer.println("<center><a href='display.jsp?id=" +id+ "'> display page </a></center>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	protected String getFileName(Part p){

		String GUIDwithext = Paths.get(p.getSubmittedFileName()).getFileName().toString();
		System.out.println("guidwithext = "+GUIDwithext);
	//	String GUID = GUIDwithext.substring(0, GUIDwithext.lastIndexOf('.'));
	//	System.out.println("guid = "+GUID);
		return GUIDwithext;
		    }
	
//	public String extractFileNameFromPart(Part part)
//	{
//		return "";
//	}
}
