import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cd")
public class QueryString extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
		String firstname = req.getParameter("fn");
		String lastname = req.getParameter("ln");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>"
				+ "<h1>welcome "+firstname+lastname+"</h1>"
				+ "</body>"
				+ "</html>");
		out.flush();
		out.close();
	}
}