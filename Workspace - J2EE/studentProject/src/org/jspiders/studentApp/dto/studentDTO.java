package org.jspiders.studentApp.dto;

import java.io.Serializable;

public class studentDTO implements Serializable
{
	private String name;
	private int id;
	private String qualification;
	private double percentages;
	
	public studentDTO()
	{
		System.out.println("student constructor....");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getPercentages() {
		return percentages;
	}

	public void setPercentages(double percentages) {
		this.percentages = percentages;
	}
	
	@Override
	public String toString() 
	{
		return "studentdata[id="+ id +",name="+name+","+qualification+","+percentages+"]";
	}
	
	@Override
	public int hashCode() 
	{
		return id;
	}
}