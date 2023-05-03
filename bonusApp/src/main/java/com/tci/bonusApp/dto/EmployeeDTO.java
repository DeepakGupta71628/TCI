package com.tci.bonusApp.dto;

public class EmployeeDTO implements Comparable<EmployeeDTO>{
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
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDTO(String empName, Integer amount) {
		super();
		this.empName = empName;
		this.amount = amount;
	}
	@Override
	public int compareTo(EmployeeDTO o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}
	

	
}
