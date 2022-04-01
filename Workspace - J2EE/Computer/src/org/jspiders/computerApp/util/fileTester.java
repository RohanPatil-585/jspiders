package org.jspiders.computerApp.util;

import java.util.Iterator;
import java.util.Set;

import org.jspiders.computerApp.dao.ComputerDAO;
import org.jspiders.computerApp.dto.ComputerDTO;
import org.jspiders.computerApp.services.InsertDataInFile;

public class fileTester 
{
	public static void main(String[] args) 
	{
		InsertDataInFile idf = new InsertDataInFile("E://computerdetails.txt");
		//System.out.println("file is created...");
		ComputerDAO dao = new ComputerDAO();
		Set<ComputerDTO> set = dao.fatchRecord();
		Iterator<ComputerDTO> i1 = set.iterator();
		while(i1.hasNext())
		{
			ComputerDTO dto = (ComputerDTO)i1.next();
			idf.insertDataToFile(dto);
		}
	}
}