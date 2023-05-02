package com.tci.bonusApp.dto;

public class Employee {
	public String empName;
	public Integer amount;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, Integer amount) {
		super();
		this.empName = empName;
		this.amount = amount;
	}
	
	public int compareTo(Employee o) {
		return this.empName.compareTo(o.empName);
	}

	
}
