package org.jspiders.studentsApp.dto;

import java.io.Serializable;

public class StudentData implements Serializable {
private int id;
private String name;
private String qualification;
private double percentage;
public StudentData() {	
	System.out.println("Student dto is created");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "StudentData [id=" + id + ", name=" + name + ", qualification=" + qualification + ", percentage="
			+ percentage + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
}
