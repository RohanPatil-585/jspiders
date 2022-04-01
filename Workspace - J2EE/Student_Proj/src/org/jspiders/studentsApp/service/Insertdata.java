package org.jspiders.studentsApp.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jspiders.studentsApp.dto.StudentData;

public class Insertdata 
{
	private String fileLocation;

	public Insertdata(String fileLocation) {
		this.fileLocation=fileLocation;
	}
	public void insertDataToFile(StudentData dto)
	{
		File f=new File(fileLocation);
		try 
		{
			FileWriter fw=new FileWriter(f,true);
			fw.write(dto.getId()+","+dto.getName()+","+dto.getPercentage()+","+dto.getQualification()+System.lineSeparator());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
