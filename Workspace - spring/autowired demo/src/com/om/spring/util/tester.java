package com.om.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.spring.bean.rocket;

public class tester 
{
	public static void main(String[] args)
	{
		String configLocation = "spring.cfg.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		rocket rocket = applicationContext.getBean(rocket.class);
		rocket.launch();
	}
}
