package org.jspiders.computerApp.dto;

import java.io.Serializable;

public class ComputerDTO implements Serializable
{
	private int id;
	private String brand;
	private String processor;
	private String model;
	private String ramsize;
	
	public ComputerDTO()
	{
		System.out.println("computer dto...");
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
		return "ComputerDTO [id=" + id + ", brand=" + brand + ", processor="
				+ processor + ", model=" + model + ", ramsize=" + ramsize + "]";
	}
}
