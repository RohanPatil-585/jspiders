package org.jspiders.initializationApp.setters.util;

import org.jspiders.initializationApp.setters.bean.TvBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTester 
{
	public static void main(String[] args) 
	{
		String str = "spring.cfg.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(str);
		TvBean bean = applicationContext.getBean(TvBean.class);
		bean.display("shaktiman");
	}
}
