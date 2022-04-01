package org.servletprogram.hibernateProIntegrate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

@XmlRootElement(name="ArmyList")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="army_table")
public class ArmyDTO1 implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="servlet", strategy = "increment")
	@GeneratedValue(generator="servlet")
	@Column(name="a_id")
	private int id;
	@Column(name="country_name")
	private String country_name;
	@Column(name="type")
	private String type;
	@Column(name="army_type")
	private String army_type;
	@Column(name="no_of_rec")
	private long no_of_recruitment;

	public ArmyDTO1() {
	}

	@XmlElement(name="id")
	public int getId() {
		return id;
	}
	
	@XmlElement(name="country")
	public String getCountry_name() {
		return country_name;
	}

	@XmlElement(name="type")
	public String getType() {
		return type;
	}

	@XmlElement(name="Army Type")
	public String getArmy_type() {
		return army_type;
	}

	@XmlElement(name="Recruitment")
	public long getNo_of_recruitment() {
		return no_of_recruitment;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setArmy_type(String army_type) {
		this.army_type = army_type;
	}

	public void setNo_of_recruitment(long no_of_recruitment) {
		this.no_of_recruitment = no_of_recruitment;
	}
	
}
