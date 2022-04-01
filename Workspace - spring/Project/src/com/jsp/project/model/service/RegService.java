package com.jsp.project.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.project.dto.RegDTO;
import com.jsp.project.model.dao.RegDao;

@Service
public class RegService {
	@Autowired
	public RegDao dao;

	public RegService() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public void registerSevice(RegDTO dto) {
		dao.regDao(dto);
	}
}
