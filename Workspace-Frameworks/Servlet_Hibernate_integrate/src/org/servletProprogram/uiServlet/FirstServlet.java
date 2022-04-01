package org.servletProprogram.uiServlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.servletprogram.hibernateProIntegrate.dto.ArmyDTO;
import org.servletprogram.hibernateProIntegrated.dao.ArmyDAO;

public class FirstServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		String cName=req.getParameter("cname");
		String aType=req.getParameter("a_type");
		String type=req.getParameter("type");
		String noOfRec=req.getParameter("no_of_rec");
		
		
		ArmyDTO dto=new ArmyDTO();
//		dto.setId(3);
		dto.setArmy_type(aType);
		dto.setCountry_name(cName);
		dto.setNo_of_recruitment(Integer.parseInt(noOfRec));
		dto.setType(type);
		ArmyDAO dao=new ArmyDAO();
		dao.save(dto);
		
	}
}
