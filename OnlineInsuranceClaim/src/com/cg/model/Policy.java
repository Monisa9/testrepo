package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Policies")
@Table(name="policy")
public class Policy {
  
	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", policyPremium=" + policyPremium + ", accountNumber="
				+ accountNumber + "]";
	}

	@Id
	private int policyNumber;
	@Column(name="policypremium")
	private int policyPremium;
	@Column(name="accountnumber")
	private int accountNumber;

	public Policy(int policyNumber, int policyPremium, int accountNumber) {
		super();
		this.policyNumber = policyNumber;
		this.policyPremium = policyPremium;
		this.accountNumber = accountNumber;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Policy() {
		super();
	}

	public int getPolicyPremium() {
		return policyPremium;
	}

	public void setPolicyPremium(int policyPremium) {
		this.policyPremium = policyPremium;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
