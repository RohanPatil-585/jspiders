package org.jspiders.weaponApp.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="weapondetails")

@NamedQueries({@NamedQuery(name="fatchAllByNamedQuery",query="select weapon from WeaponDTO weapon")
	,@NamedQuery(name="fatchRangeByModel", query="select weapon.range from WeaponDTO weapon where weapon.model=:mod"),
	@NamedQuery(name="countAll",query="select count(weapon) from WeaponDTO weapon"),
	@NamedQuery(name="sortingRecord",query="select weapon from WeaponDTO weapon order By weapon.range desc")})
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
	@Override
	public String toString() {
		return "WeaponDTO [id=" + id + ", type=" + type + ", price=" + price
				+ ", model=" + model + ", range=" + range + "]";
	}
}