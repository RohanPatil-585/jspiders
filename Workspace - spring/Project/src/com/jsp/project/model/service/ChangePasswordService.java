package com.jsp.project.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.project.dto.ChangePasswordDTO;
import com.jsp.project.model.dao.ChangePasswordDAO;

@Service
public class ChangePasswordService {
	@Autowired
	public ChangePasswordDAO changePasswordDAO;
public ChangePasswordService() {
	System.out.println(this.getClass().getSimpleName()+"created");
}
public int changePasswordService(ChangePasswordDTO changePasswordDTO)
{
	int n=changePasswordDAO.changePAssword(changePasswordDTO);
	return n;
}
}
