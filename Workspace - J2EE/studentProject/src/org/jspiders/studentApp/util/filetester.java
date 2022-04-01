package org.jspiders.studentApp.util;

import java.util.Iterator;
import java.util.Set;

import org.jspiders.studentApp.dao.studentDAO;
import org.jspiders.studentApp.dto.studentDTO;
import org.jspiders.studentApp.services.studentInsertDataInFile;

public class filetester 
{
	public static void main(String[] args) 
	{
		studentInsertDataInFile sidf = new studentInsertDataInFile("E://filetester.txt");
		studentDAO dao = new studentDAO();
		Set<studentDTO> set = dao.fatchAllData();
		Iterator<studentDTO> i1 = set.iterator();
		while(i1.hasNext())
		{
			studentDTO dto = (studentDTO)i1.next();
			sidf.insertDataToFile(dto);
		}
	}
}