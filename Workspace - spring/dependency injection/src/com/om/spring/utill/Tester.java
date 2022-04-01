package com.om.spring.utill;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.om.spring.bean.hotspot;

public class Tester 
{
	public static void main(String[] args) 
	{
		String configLocation = "spring.cfg.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		hotspot hotspot = applicationContext.getBean(hotspot.class);
		hotspot.connect();
	}
}
