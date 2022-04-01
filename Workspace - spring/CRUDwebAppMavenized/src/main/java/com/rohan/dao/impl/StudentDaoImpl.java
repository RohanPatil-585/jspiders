package com.rohan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rohan.dao.StudentDao;
import com.rohan.dto.Student;
@Repository
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private SessionFactory sessionFactory;
	public void add(Student student)
	{
		System.out.println("add method inside studentDaoImpl");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try 
		{
			session.save(student);
			transaction.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
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
