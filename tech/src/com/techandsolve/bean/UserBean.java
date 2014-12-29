package com.techandsolve.bean;

import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Size;



@ManagedBean
public class UserBean {
	@Size(min=4,max=20,message="Mensaje de validacion")
	public String email;
	public String password;
	public String userName;
	public long cellNumber;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(long cellNumber) {
		this.cellNumber = cellNumber;
	}

}
