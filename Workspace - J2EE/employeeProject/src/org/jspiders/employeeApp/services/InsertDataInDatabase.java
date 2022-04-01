package org.jspiders.employeeApp.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jspiders.employeeApp.dto.EmployeeDTO;

public class InsertDataInDatabase 
{
	public Set<EmployeeDTO> fatchDataFromFile(String location) throws Exception
	{
		FileReader freader = new FileReader(location);
		BufferedReader breader = new BufferedReader(freader);
		String data = breader.readLine();
		String[] Stringarray;
		Set<EmployeeDTO> set = new HashSet<EmployeeDTO>();
		
		while(data!=null)
		{
			Stringarray = data.split(",");
			EmployeeDTO dto = new EmployeeDTO();
			dto.setId(Integer.parseInt(Stringarray[0]));
			dto.setName(Stringarray[1]);
			dto.setDepartment(Stringarray[2]);
			set.add(dto);
			data = breader.readLine();
		}
		return set;
	}
}