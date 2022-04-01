package org.jspiders.studentApp.util;

import java.util.HashSet;
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
		studentDTO dto = new studentDTO();
		Set<studentDTO> set = dao.retriveData(1);
		System.out.println(set);
		Iterator<studentDTO> i1 = set.iterator();
		while(i1.hasNext())
		{
			sidf.insertDataToFile(i1.next());
		}
	}
}