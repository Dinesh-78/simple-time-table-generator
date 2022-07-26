package com.time;

import javax.faces.bean.ManagedBean; 

import javax.validation.constraints.Size;

@ManagedBean(name="user",eager = true)
public class Login {
	@Size(min = 1)
	String Uname;
	@Size(min = 8, max = 10)
	String Pass;
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}

}
