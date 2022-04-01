package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="excel")
@NamedQuery(name="fatchAll",query="select excel from ExcelDTO excel")
public class ExcelDTO implements Serializable
{
	@Id
	@GenericGenerator(name="rohan",strategy="increment")
	@GeneratedValue(generator="rohan")
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="yop")
	private Integer yearofpassout;
	@Column(name="techskills")
	private String technicalskill;
	
	public ExcelDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created...");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getYearofpassout() {
		return yearofpassout;
	}

	public void setYearofpassout(Integer yearofpassout) {
		this.yearofpassout = yearofpassout;
	}

	public String getTechnicalskill() {
		return technicalskill;
	}

	public void setTechnicalskill(String technicalskill) {
		this.technicalskill = technicalskill;
	}

	@Override
	public String toString() {
		return "ExcelDTO [id=" + id + ", name=" + name + ", email=" + email
				+ ", yearofpassout=" + yearofpassout + ", technicalskill="
				+ technicalskill + "]";
	}
}