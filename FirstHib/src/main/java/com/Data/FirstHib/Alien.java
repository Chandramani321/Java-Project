package com.Data.FirstHib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
//@Table(name="Alien_Table1")
public class Alien {
@Id
	private int id;
	private String FirstName;
	private Midle m;
	
	public Midle getM() {
		return m;
	}
	public void setM(Midle m) {
		this.m = m;
	}
	private String LastName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
}
