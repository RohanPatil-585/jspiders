package org.jspiders.initializationApp.setters.bean;

public class TvBean 
{
	private int inches;
	
	public TvBean() 
	{
		System.out.println(this.getClass().getCanonicalName()+"created...");
	}
	
	public void display(String program)
	{
		System.out.println("displaying \t "+program+"\t with display size \t "+inches+"");
	}
	
	public void setInches(int inches)
	{
		System.out.println("calling setInches(..)");
		this.inches=inches;
	}
}
