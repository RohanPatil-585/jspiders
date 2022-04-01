package org.jspiders.studentApp.util;

import java.util.Iterator;
import java.util.Set;

import org.jspiders.studentApp.dao.studentDAO;
import org.jspiders.studentApp.dto.studentDTO;
import org.jspiders.studentApp.services.StudentInsertData;

public class tester 
{
	public static void main(String[] args) throws Exception 
	{
//		studentDTO std = new studentDTO();
//		studentDAO dao = new studentDAO();
//		std.setId(1);
//		std.setName("jay");
//		std.setQualification("be");
//		std.setPercentages(90.99);
//		dao.insertData(std);
		
		StudentInsertData si = new StudentInsertData();
	//	Set<StudentData> set=reader.fetchDataFromFile("Student.txt");
		Set<studentDTO> set = si.fatchDataFromFile("student.txt");
		Iterator<studentDTO> i1 = set.iterator();
		studentDAO dao = new studentDAO();
		while(i1.hasNext())
		{
			dao.insertData(i1.next());
		}
	}
}