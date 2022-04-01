package com.jsp.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.project.dto.LoginDTO;
import com.jsp.project.dto.RegDTO;
import com.jsp.project.model.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	public LoginService loginService;

	public LoginController() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView loginController(@ModelAttribute LoginDTO dto, HttpServletRequest req,
			HttpServletResponse resp) {
		RegDTO regDTO = loginService.loginService(dto);
		if (regDTO != null) {
			HttpSession httpSession = req.getSession();
			System.out.println("session created");
			httpSession.setAttribute("dto", regDTO);
			return new ModelAndView("/loginsuccess.jsp", "msg", "login Success");
		} else {
			return new ModelAndView("/login.jsp", "msg1", "invalid user name or password");
		}
	}
}