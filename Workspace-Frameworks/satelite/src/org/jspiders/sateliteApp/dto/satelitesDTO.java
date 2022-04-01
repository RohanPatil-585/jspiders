package org.jspiders.sateliteApp.dto;

import java.io.Serializable;

public class satelitesDTO implements Serializable
{
	private String satelite_name;
	private String satelite_type;
	private String opertingCountry;
	private double operationalRange;
	
	public satelitesDTO()
	{
		System.out.println("satelites constructor...");
	}

	public String getSatelite_name() {
		return satelite_name;
	}

	public void setSatelite_name(String satelite_name) {
		this.satelite_name = satelite_name;
	}

	public String getSatelite_type() {
		return satelite_type;
	}

	public void setSatelite_type(String satelite_type) {
		this.satelite_type = satelite_type;
	}

	public String getOpertingCountry() {
		return opertingCountry;
	}

	public void setOpertingCountry(String opertingCountry) {
		this.opertingCountry = opertingCountry;
	}

	public double getOperationalRange() {
		return operationalRange;
	}

	public void setOperationalRange(double operationalRange) {
		this.operationalRange = operationalRange;
	}
}