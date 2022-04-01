package org.jspiders.army.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="confidential")
@NamedQueries({@NamedQuery(name="fatchByRegimentType",query="select ArmyDto from ArmyDto where regiment_type=:regimenttype"),
	@NamedQuery(name="fatchAll",query="select Army from ArmyDto Army")})
public class ArmyDto implements Serializable
{
	@Id
	@GenericGenerator(name="rohan",strategy="org.jspiders.army.generator.MyGenerator")
	@GeneratedValue(generator="rohan")
	@Column(name="regimentid")
	private int regiment_id;
	@Column(name="battalian")
	private String battalian;
	@Column(name="platuns")
	private String platuns;
	@Column(name="satelitesupport")
	private String satelitesupport;
	@Column(name="regiment_type")
	private String regiment_type;
	@Column(name="artylarysupport")
	private String artylarysupport;
	@Column(name="strength")
	private long strength;
	
	public ArmyDto()
	{
		System.out.println("default constructor of ArmyDto......");
	}

	public int getRegiment_id() {
		return regiment_id;
	}

	public void setRegiment_id(int regiment_id) {
		this.regiment_id = regiment_id;
	}

	public String getBattalian() {
		return battalian;
	}

	public void setBattalian(String battalian) {
		this.battalian = battalian;
	}

	public String getPlatuns() {
		return platuns;
	}

	public void setPlatuns(String platuns) {
		this.platuns = platuns;
	}

	public String getSatelitesupport() {
		return satelitesupport;
	}

	public void setSatelitesupport(String satelitesupport) {
		this.satelitesupport = satelitesupport;
	}

	public String getRegiment_type() {
		return regiment_type;
	}

	public void setRegiment_type(String regiment_type) {
		this.regiment_type = regiment_type;
	}

	public String getArtylarysupport() {
		return artylarysupport;
	}

	public void setArtylarysupport(String artylarysupport) {
		this.artylarysupport = artylarysupport;
	}

	public long getStrength() {
		return strength;
	}

	public void setStrength(long strength) {
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "ArmyDto [regiment_id=" + regiment_id + ", battalian="
				+ battalian + ", platuns=" + platuns + ", satelitesupport="
				+ satelitesupport + ", regiment_type=" + regiment_type
				+ ", artylarysupport=" + artylarysupport + ", strength="
				+ strength + "]";
	}
	
	
}
