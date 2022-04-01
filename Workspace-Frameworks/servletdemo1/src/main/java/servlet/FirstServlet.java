package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
  //  private SessionFactory factory = SessionFactoryUtil.getFactory();
    
 	@Override
 	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
 			throws ServletException, IOException {
 		// TODO Auto-generated method stub
 		System.out.println("mapping done");
 		super.doPost(req, resp);
 		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String city = req.getParameter("city");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>"
				+ "<h1>welcome "+name+" "+password+" "+city+"</h1>"
						+ "</bosy></html>");
	
		out.flush();
		out.close();
		
		

		/*Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		try 
		{
			studentDto dto = new studentDto();
			dto.setName(name);
			dto.setPassword(password);
			dto.setCity(city);
			session.save(dto);
			transaction.commit();
		}
		catch (HibernateException e)
		{
			transaction.rollback();
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}*/
 	}
}
