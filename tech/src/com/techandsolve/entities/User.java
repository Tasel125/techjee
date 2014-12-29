package com.techandsolve.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: 
 *
 */
@Entity

public class User implements Serializable {

	
	private String email;
	private String userName;
	private String password;   
	@Id
	private long cellNumber;
	
	
	@OneToMany(mappedBy = "userEvent")
	private List <Event> events;
	
	@OneToMany(mappedBy = "userContact")
	private List <Contact> contacts;

	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	
	public long getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(long cellNumber) {
		this.cellNumber = cellNumber;
	}

   
}
