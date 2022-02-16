package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="account")

public class Account {
	@Id
	@Column(name="account_name")
	private String accountName;
	@Column(name="total_amount")
	private double totalAmount;
	@Column(name="interest")
	private double interest;
	@Column(name="min_payment")
	private double minPayment;
	@Column(name="loan_length")
	private double loanLength;
	
	public Account() {
		
	}

	public Account(String accountName, double totalAmount, double interest, double minPayment, double loanLength) {
		super();
		this.accountName = accountName;
		this.totalAmount = totalAmount;
		this.interest = interest;
		this.minPayment = minPayment;
		this.loanLength = loanLength;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getMinPayment() {
		return minPayment;
	}

	public void setMinPayment(double minPayment) {
		this.minPayment = minPayment;
	}

	public double getLoanLength() {
		return loanLength;
	}

	public void setLoanLength(double loanLength) {
		this.loanLength = loanLength;
	}
	
	
	
}
