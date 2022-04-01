package org.jspiders.initializationApp.setters.bean;

public class BarBean 
{
	String name;
	String type;
	
	BarBean(String name)
	{
		this.name=name;
	}
	
	public void serve(String brand)
	{
		System.out.println("serving..."+brand);
	}
	
	public void setType(String type)
	{
		System.out.println("called setType()...");
		this.type=type;
	}
}
