package com.om.SpringHibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="medical_store")
public class MedicalDto implements Serializable 
{
	@Id
	@GenericGenerator(name = "dip", strategy = "increment")
	@GeneratedValue(generator="dip")
	@Column
	private int id;
	private String name;
	private String licno;
	private String owname;
	
	public MedicalDto() 
	{
		System.out.println(this.getClass().getSimpleName()+" created.....");
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
	public String getLicno() {
		return licno;
	}
	public void setLicno(String licno) {
		this.licno = licno;
	}
	public String getOwname() {
		return owname;
	}
	public void setOwname(String owname) {
		this.owname = owname;
	}

	@Override
	public String toString() {
		return "MedicalDto [id=" + id + ", name=" + name + ", licno=" + licno
				+ ", owname=" + owname + "]";
	}
}
