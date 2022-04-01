package date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cd")
public class MyServlets extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		Date d = new Date();
		String cd = d.toString();
		PrintWriter out = resp.getWriter();
		String html = "<html>"
				+ "<body>"
				+ "<h1>"
				+ cd
				+ "</h1>"
				+ "</body>"
				+ "</html>";
		out.println(html);
		out.flush();
		out.close();
		//System.out.println(html);
	}
}