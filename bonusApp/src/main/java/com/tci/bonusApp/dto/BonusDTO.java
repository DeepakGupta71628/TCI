package com.tci.bonusApp.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tci.bonusApp.utility.DateHandler;



public class BonusDTO {
	
	public String empName;
	public String department;
	public Integer amount;
	public String currency;
	@JsonDeserialize(using = DateHandler.class)
//	@DateTimeFormat(pattern = "mmm-dd-yyyy")
	public Date joiningDate;
	@JsonDeserialize(using = DateHandler.class)
//	@DateTimeFormat(pattern = "mmm-dd-yyyy")
	public Date exitDate;
	
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
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Date getExitDate() {
		return exitDate;
	}
	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}
	public BonusDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BonusDTO(String empName, String department, Integer amount, String currency, Date joiningDate, Date exitDate) {
		super();
		this.empName = empName;
		this.department = department;
		this.amount = amount;
		this.currency = currency;
		this.joiningDate = joiningDate;
		this.exitDate = exitDate;
	}

	
	
	


}
