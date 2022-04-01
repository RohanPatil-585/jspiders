package org.jspiders.firstApp.util;

import org.jspiders.firstApp.bean.YoutubeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YoutubeSpringTester 
{
	public static void main(String[] args) 
	{
		String configuration="spring.cfg.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configuration);
		
		YoutubeBean youtubeBean = applicationContext.getBean(YoutubeBean.class);
		
		youtubeBean.play("my heart will go on...");
	}
}
