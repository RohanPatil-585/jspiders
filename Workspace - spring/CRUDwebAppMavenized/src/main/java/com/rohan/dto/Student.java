package com.rohan.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int studentid;
	@Column(name="name")
	private String studentname;
	@Column(name="email")
	private String emailid;
	@Column(name="phno")
	private String phoneno;
	@Column(name="password")
	private String password;
	@Column(name="country")
	private String country;
	
	public Student() 
	{
	
	}

	public Student(int studentid, String studentname, String emailid, String phoneno, String password, String country) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.emailid = emailid;
		this.phoneno = phoneno;
		this.password = password;
		this.country = country;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", emailid=" + emailid
				+ ", phoneno=" + phoneno + ", password=" + password + ", country=" + country + "]";
	}
	
}
