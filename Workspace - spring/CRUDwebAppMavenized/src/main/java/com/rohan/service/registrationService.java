package com.rohan.service;

import java.util.List;

import com.rohan.dto.Student;
public interface registrationService 
{
	public void add(Student student);
	public void edit(Student student);
	public void delete(int id);
	public Student getStudent(int id);
	public List getAllStudent();
}
