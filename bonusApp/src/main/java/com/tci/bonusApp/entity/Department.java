package com.tci.bonusApp.entity;

import javax.persistence.Entity;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deptId;
	private String department;
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Integer deptId, String department) {
		super();
		this.deptId = deptId;
		this.department = department;
	}
	public Department( String department) {
		super();
		
		this.department = department;
	}
	
	
	
}
