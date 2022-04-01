package com.jsp.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.project.dto.ChangePasswordDTO;
import com.jsp.project.model.service.ChangePasswordService;

@Controller
@RequestMapping("/")
public class ChangePasswordController {
	@Autowired
	public ChangePasswordService changePasswordService;
	public ChangePasswordController() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	@RequestMapping(value="/changepassword.do", method=RequestMethod.POST)
	public ModelAndView regController(@ModelAttribute ChangePasswordDTO changePasswordDTO)
	{
		int n=changePasswordService.changePasswordService(changePasswordDTO);
		
		if(n==1)
		{
		return new ModelAndView("/login.jsp","msg3","updated");
		}
		else
		{
			return new ModelAndView("/changepassword.jsp","msg","not updated");
		}
		
	}
}
