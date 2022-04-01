package manytoone.util;

import java.util.ArrayList;
import java.util.Collection;

import manytoone.dao.manytooneDao;
import manytoone.dto.department;
import manytoone.dto.student;

public class manytooneTester 
{
	public static void main(String[] args) 
	{
		department department = new department();
		department.setDepartment_code(001);
		department.setDepartment_name("cse");
		
		student student = new student();
		student.setStudent_name("rohan");
		student.setDepartment(department);
		
		student student1 = new student();
		student1.setStudent_name("ronak");
		student.setDepartment(department);
		
		student student2 = new student();
		student2.setStudent_name("dipak");
		student.setDepartment(department);
		
		Collection<student> students = new ArrayList<student>();
		students.add(student);
		students.add(student1);
		students.add(student2);
		
		manytooneDao dao = new manytooneDao();
		dao.save(students);
	}
}