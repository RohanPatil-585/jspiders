package org.jspiders.employeeApp.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable
{
	int id;
	String name;
	String department;
	
	public EmployeeDTO()
	{
		System.out.println("employeeDTO constructor...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() 
	{
		return "employeedata["+id+","+name+","+department+"]";
	}
}
