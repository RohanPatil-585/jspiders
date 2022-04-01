package org.jspiders.employeeApp.util;

import java.util.Iterator;
import java.util.Set;

import org.jspiders.employeeApp.dao.employeeDAO;
import org.jspiders.employeeApp.dto.EmployeeDTO;
import org.jspiders.employeeApp.services.InsertDataInDatabase;

public class testerDatabase 
{
	public static void main(String[] args) throws Exception 
	{
//		EmployeeDTO dto = new EmployeeDTO();
//		employeeDAO dao = new employeeDAO();
//		dto.setDepartment("research");
//		dto.setId(1);
//		dto.setName("rohan");
//		dao.insertDataInData(dto);
		
		InsertDataInDatabase ididb = new InsertDataInDatabase();
		Set<EmployeeDTO> set = ididb.fatchDataFromFile("employee.txt");
		Iterator<EmployeeDTO> i1 = set.iterator();
		employeeDAO dao = new employeeDAO();
		while(i1.hasNext())
		{
			dao.insertDataInData(i1.next());
		}
	}
}