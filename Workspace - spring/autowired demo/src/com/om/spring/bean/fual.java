package com.om.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fual")
@Scope("prototype")
public class fual 
{
	@Value("petrol")
	private String type;

	private double cost;
	
	private ast ast;

	@Autowired
	public fual(@Value("65") double cost) 
	{
		System.out.println(this.getClass().getSimpleName()+" created.....");
		System.out.println("cost = "+cost);
		this.cost=cost;
	}
	
	public void burn()
	{
		System.out.println("fuel burning....");
		
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
}
