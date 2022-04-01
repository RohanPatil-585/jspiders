package com.intregration.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "medical_table")
public class medicalDTO implements Serializable {

	@Id
	@GenericGenerator(name = "dip", strategy = "increment")
	@GeneratedValue(generator="dip")
	@Column
	private int id;
	private String name;
	private String licno;
	private String owname;

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

	public medicalDTO() {
		System.out.println("medical dto is created");
	}

	@Override
	public String toString() {
		return "medicalDTO [id=" + id + ", name=" + name + ", licno=" + licno + ", owname=" + owname + "]";
	}

}
