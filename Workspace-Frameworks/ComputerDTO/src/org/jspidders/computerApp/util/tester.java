package org.jspidders.computerApp.util;

import org.jspidders.computerApp.dao.computerDAO;
import org.jspidders.computerApp.dto.ComputerDTO;

public class tester 
{
	public static void main(String[] args) 
	{
		ComputerDTO dto = new ComputerDTO();
		dto.setCid(3);
		dto.setBrand("sony");
		dto.setModel("viyo");
		dto.setProcessor("i9");
		dto.setRamsize("16 gb");
		computerDAO dao = new computerDAO();
		dao.save(dto);
	}
}
