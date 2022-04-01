import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rohan")
public class formServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if(name!="" && place!="")
		{
			out.println("<html><body bgcolor='red'>"
					+ "<h1> welcome "+name+" and your place is "+place+"</h1>"
					+ "</body></html>");
			out.flush();
			out.close();
		}
		else
		{
			resp.sendError(800,"ERORR!!!");
		}
	}
}