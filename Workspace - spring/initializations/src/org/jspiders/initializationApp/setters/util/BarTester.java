package org.jspiders.initializationApp.setters.util;

import org.jspiders.initializationApp.setters.bean.BarBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BarTester 
{
	public static void main(String[] args) 
	{
		String LocationConfiguration="spring.cfg.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(LocationConfiguration);
		BarBean barBean = applicationContext.getBean(BarBean.class);
		barBean.serve("oldmonk");
		
		BarBean barBean2 = applicationContext.getBean(BarBean.class);
		barBean.serve("takila");

	}
}