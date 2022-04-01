package org.jspiders.studentApp.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jspiders.studentApp.dto.studentDTO;

public class studentInsertDataInFile 
{
	public String fileLocation;
	
	public studentInsertDataInFile(String fileLocation) 
	{
		this.fileLocation = fileLocation;
	}
	
	public void insertDataToFile(studentDTO std)
	{
		File f = new File(fileLocation);
		try
		{
			FileWriter fw = new FileWriter(f,true);
			fw.write(std.getId() +","+ std.getName() +","+ std.getQualification() +","+ std.getPercentages()+System.lineSeparator());
			fw.flush();
			fw.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}