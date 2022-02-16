package com.claim.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")

public class User {
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="account_name")
	private Account account;
	@Column(name="budget")
	private double budget;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	@Column(name="telephone")
	private String telephone;

	public User(Account account, double budget, String firstName, String lastName, String email, String password, String telephone) {
		super();
		this.account = account;
		this.budget = budget;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
	}
	public User() {

	}



	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}



	public double getBudget() {
		return budget;
	}



	public void setBudget(double budget) {
		this.budget = budget;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
