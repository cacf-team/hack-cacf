package com.table7.model;

import org.springframework.data.annotation.Id;

public class cardType {
	
	@Id
	private Integer id;
	private String name;

	

	public cardType(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public cardType() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
