package org.servletProprogram.uiServlet;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.servletprogram.hibernateProIntegrate.dto.ArmyDTO;
import org.servletprogram.hibernateProIntegrate.service.ArmyDataInXlsxService;
import org.servletprogram.hibernateProIntegrate.service.ArmyService;
import org.servletprogram.hibernateProIntegrated.dao.ArmyDAO;
@MultipartConfig
public class DocServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String path = req.getParameter("file");
		String val = req.getParameter("Submit");
		System.out.println(path);
		HttpServletRequest httpServletRequest=(HttpServletRequest)req;
		String url=httpServletRequest.getRealPath(path);
		System.out.println("URL: "+url);
		System.out.println("Content Type: "+httpServletRequest.getContentType());
		System.out.println(" Context Path: "+httpServletRequest.getContextPath());
		System.out.println("Path Info: "+httpServletRequest.getPathInfo());
		System.out.println("Header: "+httpServletRequest.getHeaders(path));
		System.out.println("Request URL: "+httpServletRequest.getRequestURL());
//		System.out.println("Get Part: "+httpServletRequest.);
//		final Part filePart = httpServletRequest.getPart("file");
//		final String fileName = getFileName(filePart);

		/*if (val.equalsIgnoreCase("save")) {

			InputStream is = req.getInputStream();
			System.out.println(is.available());
		} else if (val.equalsIgnoreCase("Download")) {
			resp.setContentType("application/octet-stream");
		}*/
	}
}
