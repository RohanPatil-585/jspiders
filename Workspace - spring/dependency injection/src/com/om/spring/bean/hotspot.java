package com.om.spring.bean;

public class hotspot 
{
	private String operator;
	private power power;
	public hotspot() 
	{
		System.out.println(this.getClass().getSimpleName()+" created....");
	}
	
	public void connect()
	{
		if(power!=null)
		{
			System.out.println("connecting...");
			power.generate();
		}
		else
		{
			System.out.println("no power");
		}
	}
	
	public void setOperator(String operator) 
	{
		System.out.println("calling operator..");
		this.operator = operator;
	}
	public void setPower(power power) 
	{
		System.out.println("calling power...");
		this.power = power;
	}
}