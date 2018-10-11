package com.table7.model;

import org.springframework.data.annotation.Id;

public class advisor {
	
	
	@Id
	private Integer id;
	private String firstname;	
	private String lastname;	
	private specialty specialties;
	
	public advisor() {
		super();
	}

	public advisor(Integer id, String firstname, String lastname, specialty specialties) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.specialties = specialties;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public specialty getSpecialties() {
		return specialties;
	}

	public void setSpecialties(specialty specialties) {
		this.specialties = specialties;
	}
	
	
	
	

}
