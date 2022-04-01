package manytoone.dto;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="department")
public class department implements Serializable
{
	@Id
	@GenericGenerator(name="rohan",strategy="increment")
	@GeneratedValue(generator="rohan")
	@Column(name="department_id")
	private int department_id;
	@Column(name="department_name")
	private String department_name;
	@Column(name="department_code")
	private int department_code;
	
	public department() 
	{
		System.out.println("department costructor created....");
	}
	
//	@JoinColumn(name="studentId")
//	private Collection<student> students;

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getDepartment_code() {
		return department_code;
	}

	public void setDepartment_code(int department_code) {
		this.department_code = department_code;
	}

//	public Collection<student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(Collection<student> students) {
//		this.students = students;
//	}
}
