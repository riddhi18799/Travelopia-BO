package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Traveller")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Traveller {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int noOfTravellers;
	private String place;
	private String email;
	private long budgetPerPerson;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfTravellers() {
		return noOfTravellers;
	}
	public void setNoOfTravellers(int noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getBudgetPerPerson() {
		return budgetPerPerson;
	}
	public void setBudgetPerPerson(long budgetPerPerson) {
		this.budgetPerPerson = budgetPerPerson;
	}
}
