package org.jspiders.studentsApp.util;

import java.util.Iterator;
import java.util.Set;

import org.jspiders.studentsApp.dao.StudentDAO;
import org.jspiders.studentsApp.dto.StudentData;
import org.jspiders.studentsApp.service.Insertdata;

public class Tester2 {
public static void main(String[] args) {
	Insertdata in=new Insertdata("E://dt.txt");
	StudentDAO dao=new StudentDAO();
	Set<StudentData> s=dao.fetchAllData();
	Iterator<StudentData> i=s.iterator();
	while (i.hasNext()) {
		StudentData std=(StudentData)i.next();
		in.insertDataToFile(std);
	}
}
}
