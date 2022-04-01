package com.jsp.project.dto;

import java.io.Serializable;

public class ChangePasswordDTO implements Serializable{
	private String email;
	private String oldpass;
	private String newpass;
	public ChangePasswordDTO() {
		System.out.println(this.getClass().getSimpleName()+"creaeted");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOldpass() {
		return oldpass;
	}
	public void setOldpass(String oldpass) {
		this.oldpass = oldpass;
	}
	public String getNewpass() {
		return newpass;
	}
	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}

}
