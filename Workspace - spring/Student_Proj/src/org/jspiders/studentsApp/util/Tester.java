package org.jspiders.studentsApp.util;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.jspiders.studentsApp.dao.StudentDAO;
import org.jspiders.studentsApp.dto.StudentData;
import org.jspiders.studentsApp.service.StudentFileReader;

public class Tester {
public static void main(String[] args) throws Exception {
//	StudentData stu=new StudentData();
//	Scanner s1=new Scanner(System.in);
//	System.out.println("Enter Id?");
//	int id=s1.nextInt();
//	System.out.println("Enter Name?");
//	String name=s1.next();
//	System.out.println("Enter Qualfication?");
//	String qua=s1.next();
//	System.out.println("Enter Percentage?");
//	double perc=s1.nextDouble();
//	s1.close();
//	stu.setId(id);
//	stu.setName(name);
//	stu.setQualification(qua);
//	stu.setPercentage(perc);
//	StudentDAO dao=new StudentDAO();
//	dao.insertData(stu);
	
	StudentFileReader reader=new StudentFileReader();
	Set<StudentData> set=reader.fetchDataFromFile("Student.txt");
	Iterator<StudentData> it=set.iterator();
	StudentDAO dao=new StudentDAO();
	while (it.hasNext()) {
		dao.insertData(it.next());
		
	}
	
}
}
