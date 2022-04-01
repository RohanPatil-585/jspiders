package com.rohan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohan.dao.StudentDao;
import com.rohan.dto.Student;
import com.rohan.service.registrationService;
@Service
public class RegistrationServiceImpl implements registrationService
{
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void add(Student student) 
	{
		System.out.println("add method inside registrationServiceImpl");
		studentDao.add(student);
	}

	@Override
	public void edit(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
