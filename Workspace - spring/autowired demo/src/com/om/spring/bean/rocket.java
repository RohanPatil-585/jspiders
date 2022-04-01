package com.om.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("rock")
@Scope("prototype")
public class rocket 
{
	private int thrust;
	@Autowired
	private fual fual;
	@Autowired
	private ast ast;
	
	public rocket() 
	{
		System.out.println(this.getClass().getSimpleName()+" created....");
	}
	
	public void launch()
	{
		if(fual!=null && ast!=null)
		{
			System.out.println("ready for lanch");
			fual.burn();
			ast.drive();
		}
		else
		{
			System.out.println("no fual");
		}
	}
	@Autowired
	@Value("100")
	public void setThrust(int thrust) 
	{
		this.thrust = thrust;
	}
}
