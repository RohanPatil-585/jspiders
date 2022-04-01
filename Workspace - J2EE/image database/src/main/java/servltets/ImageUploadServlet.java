package main.java.servltets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/ImageUploadServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2,
						maxFileSize=1024*1024*10,
						maxRequestSize=1024*1024*50)
public class ImageUploadServlet extends HttpServlet 
{
	private static final String folder_name = "images";
    public ImageUploadServlet() 
    {

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "insert into student.employee_image (fname,lname,path) values(?,?,?)";
		response.setContentType("text/html;char-set=UTF-8");
		PrintWriter writer = response.getWriter();
		String savepath = "E:\\Workspace - J2EE\\image database\\WebContent" + File.separator + folder_name;
		File file = new File(savepath);
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		Part part = request.getPart("image");
		
		String fileName = getImageName(part);
		part.write(savepath + file.separator + fileName);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rohan619");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			String filepath = savepath + file.separator + fileName;
			pstmt.setString(3, filepath);
			pstmt.executeUpdate();
			writer.println("<html><body> image inserted successfully... </body></html>");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public String getImageName(Part part)
	{
		String guidWithExtension = Paths.get(part.getSubmittedFileName()).getFileName().toString();
		return guidWithExtension;
	}

}
