package org.jspidders.computerApp.util;

import org.jspidders.computerApp.dao.computerDAO;
import org.jspidders.computerApp.dto.ComputerDTO;

public class ReadTester 
{
	public static void main(String[] args) 
	{
		computerDAO dao = new computerDAO();
		ComputerDTO dto = dao.fatchById(1);
		if(dto!=null)
		{
			System.out.println(dto);
			System.out.println(dto.getProcessor());
		}
		else
		{
			System.out.println("object not found...");
		}
	}
}
