package com.jsp.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.project.dto.RegDTO;
import com.jsp.project.model.service.RegService;

@Controller
@RequestMapping("/")
public class RegController {
	@Autowired
	public RegService service;
	public RegController() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}
	@RequestMapping(value="/reg.do", method=RequestMethod.POST)
	public ModelAndView regController(@ModelAttribute RegDTO dto)
	{
		service.registerSevice(dto);
		return new ModelAndView("/success.jsp","msg",dto.getName());
	}
}
