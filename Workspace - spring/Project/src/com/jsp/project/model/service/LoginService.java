package com.jsp.project.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.project.dto.LoginDTO;
import com.jsp.project.dto.RegDTO;
import com.jsp.project.model.dao.LoginDAO;

@Service
public class LoginService {
	@Autowired
	public LoginDAO dao;
public LoginService() {
	System.out.println(this.getClass().getSimpleName()+"created");
}
public RegDTO loginService(LoginDTO dto)
{
	RegDTO regDTO=dao.loginDao(dto);
	return regDTO;
}
}
