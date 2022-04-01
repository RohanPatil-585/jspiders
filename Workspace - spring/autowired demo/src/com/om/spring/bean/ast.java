package com.om.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ast")
@Scope("prototype")
public class ast 
{
	@Value("rohan")
	private String name;
	
	public ast() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	public void drive()
	{
		System.out.println(name +" driving");
	}
}
