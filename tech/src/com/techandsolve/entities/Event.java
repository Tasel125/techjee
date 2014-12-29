package com.techandsolve.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity

public class Event implements Serializable {

	
	private String description;
	@Id
	private double eventId;
	private String date;
	private String title;
	private String location;
	
	@ManyToOne
	private User userEvent;
	
	@ManyToMany(mappedBy = "events")
	private List <Contact> contacts;
	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public double getEventId() {
		return this.eventId;
	}

	public void setEventId(double eventId) {
		this.eventId = eventId;
	}   
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
   
}
