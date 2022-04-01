package org.jspidders.computerApp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="computerDetails")
public class ComputerDTO implements Serializable
{
	@Id
	@Column(name="id")
	private int cid;
	@Column(name="brand")
	private String brand;
	@Column(name="processor")
	private String processor;
	@Column(name="model")
	private String model;
	@Column(name="ramsize")
	private String ramsize;
	
	public ComputerDTO()
	{
		System.out.println("computer dto...");
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRamsize() {
		return ramsize;
	}

	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}
	
	@Override
	public String toString() 
	{
		return "ComputerDTO [cid=" + cid + ", brand=" + brand + ", processor="
				+ processor + ", model=" + model + ", ramsize=" + ramsize + "]";
	}
}