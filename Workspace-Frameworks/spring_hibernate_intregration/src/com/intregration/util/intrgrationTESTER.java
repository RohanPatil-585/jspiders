package com.intregration.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intregration.dao.medicalDAO;
import com.intregration.dto.medicalDTO;

public class intrgrationTESTER
{
	public static void main(String[] args) {
		medicalDTO dto=new medicalDTO();
		dto.setLicno("hbc213");
		dto.setName("ratnai");
		dto.setOwname("dipak patil");
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
	medicalDAO dao=	applicationContext.getBean(medicalDAO.class);
		dao.save(dto);
	}

}
