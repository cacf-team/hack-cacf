/**
 * 
 */
package com.table7.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author hackathon
 *
 */
public class Card {

	@Id
	private Integer id;
	private String name;
	@DateTimeFormat(pattern = "yyyy/mm/dd")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date birthDate;
	private cardType type;
	private customer costumerId;

	public Card() {
		super();
	}

	public Card(Integer id, String name, Date birthDate, cardType type, customer customerId) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.type = type;
		this.costumerId = customerId;
	}

	public customer getCostumerId() {
		return costumerId;
	}

	public void setCostumerId(customer costumerId) {
		this.costumerId = costumerId;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public cardType getType() {
		return type;
	}

	public void setType(cardType type) {
		this.type = type;
	}

}
