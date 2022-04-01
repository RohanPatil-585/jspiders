package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="student")
@NamedQuery(name="rohan",query="select student from studentDTO student")
public class studentDTO implements Serializable
{
	@Id
	@GenericGenerator(name="rohan",strategy="increment")
	@GeneratedValue(generator="rohan")
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="branch")
	private String branch;
	
	public studentDTO() 
	{
		System.out.println("creating "+this.getClass().getSimpleName());
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "studentDTO [id=" + id + ", name=" + name + ", branch=" + branch
				+ "]";
	}	
}
