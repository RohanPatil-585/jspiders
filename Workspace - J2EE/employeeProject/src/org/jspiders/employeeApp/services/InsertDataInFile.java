package org.jspiders.employeeApp.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jspiders.employeeApp.dto.EmployeeDTO;

public class InsertDataInFile 
{
	public String fileLocation;

	public InsertDataInFile(String fileLocation) 
	{
		this.fileLocation = fileLocation;
	}
	
	public void insertDataToFile(EmployeeDTO emp)
	{
		File f = new File(fileLocation);
		try
		{
			FileWriter fw = new FileWriter(f);
			fw.write(emp.getId()+","+emp.getName()+","+emp.getDepartment()+","+System.lineSeparator());
			fw.flush();
			fw.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
