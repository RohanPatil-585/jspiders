package org.jspiders.weaponApp.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="weapondetails")
public class WeaponDTO implements Serializable 
{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="type")
	private String type;
	@Column(name="price")
	private double price;
	@Column(name="model")
	private String model;
	@Column(name="range")
	private double range;
	
	public WeaponDTO()
	{
		System.out.println("weapondto constructor...");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
}