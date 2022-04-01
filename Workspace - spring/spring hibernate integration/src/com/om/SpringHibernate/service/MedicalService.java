package com.om.SpringHibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.om.SpringHibernate.dto.MedicalDao;
import com.om.SpringHibernate.dto.MedicalDto;
@Component
public class MedicalService 
{
	@Autowired
	private MedicalDao dao;
	
	public MedicalService() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	public void saveMedical(MedicalDto dto)
	{
		dao.save(dto);
	}
}
