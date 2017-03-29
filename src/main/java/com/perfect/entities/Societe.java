package com.perfect.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Societe implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id; 
	private String name; 
	private String address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Societe(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	} 
	
	

}
