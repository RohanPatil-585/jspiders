package org.jspiders.studentApp.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

import org.jspiders.studentApp.dto.studentDTO;

public class StudentInsertData 
{
	public Set<studentDTO> fatchDataFromFile(String location) throws Exception
	{
		FileReader freader = new FileReader(location);
		BufferedReader breader = new BufferedReader(freader);
		String data = breader.readLine();
		String[] stringarray;
		Set<studentDTO> set = new HashSet<studentDTO>();
		
		while(data!=null)
		{
			stringarray = data.split(",");
			studentDTO std = new studentDTO();
			std.setId(Integer.parseInt(stringarray[0]));
			std.setName(stringarray[1]);
			std.setQualification(stringarray[2]);
			std.setPercentages(Double.parseDouble(stringarray[3]));
			set.add(std);
			data = breader.readLine();
		}
		return set;
	}
}