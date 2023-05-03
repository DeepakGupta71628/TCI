package com.tci.bonusApp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.tci.bonusApp.dto.JsonDeserialize;
import com.tci.bonusApp.utility.DateHandler;

@Entity
public class Bonus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bonusId;
	private String empName;
    @ManyToOne
    @JoinColumn(name = "deptId")
    private Department department;
    private Integer amount;
	private String currency;
	private Date joiningDate;
	private Date exitDate;
	public Integer getBonusId() {
		return bonusId;
	}
	public void setBonusId(Integer bonusId) {
		this.bonusId = bonusId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
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
	public Bonus(Integer bonusId, String empName, Department department, Integer amount, String currency,
			Date joiningDate, Date exitDate) {
		super();
		this.bonusId = bonusId;
		this.empName = empName;
		this.department = department;
		this.amount = amount;
		this.currency = currency;
		this.joiningDate = joiningDate;
		this.exitDate = exitDate;
	}
	public Bonus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
