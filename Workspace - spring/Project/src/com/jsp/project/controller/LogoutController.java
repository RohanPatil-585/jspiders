package com.jsp.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class LogoutController {
public LogoutController() {
	System.out.println(this.getClass().getSimpleName()+"created");
}
@RequestMapping(value="/logout.do",method=RequestMethod.POST)
public ModelAndView logoutController(HttpServletRequest req)
{
	try
	{
		HttpSession httpSession=req.getSession(false);
		System.out.println("session destroied");
		httpSession.invalidate();
	}
	catch (Exception e) {
		System.out.println("exception in logout");
		e.printStackTrace();
	}
	return new ModelAndView("/login.jsp","msg2","logout success");
}
}
