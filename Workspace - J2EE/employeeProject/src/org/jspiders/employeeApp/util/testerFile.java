package org.jspiders.employeeApp.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.jspiders.employeeApp.dao.employeeDAO;
import org.jspiders.employeeApp.dto.EmployeeDTO;
import org.jspiders.employeeApp.services.InsertDataInFile;

public class testerFile 
{
	public static void main(String[] args) 
	{
		InsertDataInFile idif = new InsertDataInFile("E://employeedetails.txt");
		employeeDAO dao = new employeeDAO();
		Set<EmployeeDTO> set = dao.insertDataTofile();
		Iterator<EmployeeDTO> i1 = set.iterator();
		while(i1.hasNext())
		{
			EmployeeDTO dto = (EmployeeDTO)i1.next();
			idif.insertDataToFile(dto);
		}
	}
}
