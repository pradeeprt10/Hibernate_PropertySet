package com.hirbernate.Hibernate_PropertySet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_tbl_Hibernate")
public class Employee_Hibernate {
@Id
@Column(name="Emp_Id")
	private int empid;

	@Column(name="Emp_Name")
	private String name;
	@Column(name="Emp_Address")
	private String address;
	@Column(name="Emp_Mobile")
	private int mobile;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Employee_Hibernate(int empid, String name, String address, int mobile) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	public Employee_Hibernate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
