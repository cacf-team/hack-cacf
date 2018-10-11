package com.table7.model;

import org.springframework.data.annotation.Id;

public class specialty {

	@Id
	private Integer id;
	private String name;
	public specialty() {
		super();
	}
	public specialty(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
