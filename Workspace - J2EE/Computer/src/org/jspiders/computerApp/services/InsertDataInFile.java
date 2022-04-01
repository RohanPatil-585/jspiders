package org.jspiders.computerApp.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import org.jspiders.computerApp.dto.ComputerDTO;

public class InsertDataInFile 
{
	private String fileLocation;

	public InsertDataInFile(String fileLocation) 
	{
		this.fileLocation = fileLocation;
	}
	
	public void insertDataToFile(ComputerDTO dto)
	{
		File f = new File(fileLocation);
		try
		{
			FileWriter fw = new FileWriter(f,true);
			fw.write(dto.getId()+" "+dto.getBrand()+" "+dto.getProcessor()+" "+dto.getModel()+" "+dto.getRamsize()+System.lineSeparator());
			fw.flush();
			fw.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
