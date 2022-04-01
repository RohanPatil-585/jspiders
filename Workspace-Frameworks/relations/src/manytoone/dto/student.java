package manytoone.dto;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="student")
public class student implements Serializable
{
	@Id
	@GenericGenerator(name="rohan",strategy="increment")
	@GeneratedValue(generator="rohan")
	@Column(name="student_id")
	private int student_id;
	@Column(name="Student_name")
	private String student_name;
//	@Column(name="studentAddress")
//	private String student_address;
	
	public student()
	{
		System.out.println("student constructor created..........");
	}
	@ManyToOne(cascade=CascadeType.ALL)
//	@PrimaryKeyJoinColumn
	private department department;

	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
//	public String getStudent_address() {
//		return student_address;
//	}
//	public void setStudent_address(String student_address) {
//		this.student_address = student_address;
//	}
	public department getDepartment() {
		return department;
	}
	public void setDepartment(department department) {
		this.department = department;
	}
}