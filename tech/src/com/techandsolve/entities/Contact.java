package com.techandsolve.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contact
 *
 */
@Entity

public class Contact implements Serializable {

	   
	@Id
	private long cellNumber;
	private String nameContact;
	private String email;
	
	@ManyToOne
	private User userContact;
	
	@ManyToMany
	private List <Event> events;
	private static final long serialVersionUID = 1L;

	public Contact() {
		super();
	}   
	public long getCellNumber() {
		return this.cellNumber;
	}

	public void setCellNumber(long cellNumber) {
		this.cellNumber = cellNumber;
	}   
	public String getNameContact() {
		return this.nameContact;
	}

	public void setNameContact(String nameContact) {
		this.nameContact = nameContact;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
