package com.om.SpringHibernate.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.SpringHibernate.dto.MedicalDto;
import com.om.SpringHibernate.service.MedicalService;

public class MedicalTester 
{
	public static void main(String[] args) 
	{
		MedicalDto dto = new MedicalDto();
		dto.setName("medex");
		dto.setOwname("ronak");
		dto.setLicno("456");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.cfg.xml");
		
		MedicalService medicalService = applicationContext.getBean(MedicalService.class);
		medicalService.saveMedical(dto);
		
	}
}
