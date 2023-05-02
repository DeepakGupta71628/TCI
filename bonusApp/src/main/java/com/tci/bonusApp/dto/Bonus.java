package com.tci.bonusApp.dto;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tci.bonusApp.utility.DateHandler;

public class Bonus {
	
	public String empName;
	public String department;
	public Integer amount;
	public String currency;
//	@JsonDeserialize(using = DateHandler.class)
	public String joiningDate;
//	@JsonDeserialize(using = DateHandler.class)
	public String exitDate;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getExitDate() {
		return exitDate;
	}
	public void setExitDate(String exitDate) {
		this.exitDate = exitDate;
	}
	public Bonus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bonus(String empName, String department, Integer amount, String currency, String joiningDate, String exitDate) {
		super();
		this.empName = empName;
		this.department = department;
		this.amount = amount;
		this.currency = currency;
		this.joiningDate = joiningDate;
		this.exitDate = exitDate;
	}

	
	
	


}
