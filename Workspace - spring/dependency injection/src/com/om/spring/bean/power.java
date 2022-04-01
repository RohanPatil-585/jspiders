package com.om.spring.bean;

public class power 
{
	private int volts;
	public power() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	public void generate()
	{
		System.out.println("generated....");
	}
	
	public void setVolts(int volts)
	{
		System.out.println("calling set volts method...");
		this.volts = volts;
	}
}
