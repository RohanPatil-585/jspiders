package org.jspiders.studentsApp.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

import org.jspiders.studentsApp.dto.StudentData;

public class StudentFileReader {

	public Set<StudentData> fetchDataFromFile(String locfile) throws Exception
	{
		FileReader reader=new FileReader(locfile);
		BufferedReader breader=new BufferedReader(reader);
		String data=breader.readLine();
		String[] dataArr;
		Set<StudentData> set=new HashSet<StudentData>();
		
		while(data!=null)
		{
			dataArr=data.split(",");
			StudentData sdata=new StudentData();
			sdata.setId(Integer.parseInt(dataArr[0]));
			sdata.setName(dataArr[1]);
			sdata.setQualification(dataArr[2]);
			sdata.setPercentage(Double.parseDouble(dataArr[3]));
			set.add(sdata);
			data=breader.readLine();
		}
		return set;
	}
}