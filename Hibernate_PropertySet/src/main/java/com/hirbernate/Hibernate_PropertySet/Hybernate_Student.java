package com.hirbernate.Hibernate_PropertySet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hybernate_Student {
	@Id
	@Column(name="std_id")
	private int stdid;
	@Column(name="std_name")
	private String name;
	@Column(name="std_address")
	private String address;
	
	
	public Hybernate_Student(int stdid, String name, String address) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.address = address;
	}
		
	public Hybernate_Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
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

	@Override
	public String toString() {
		return "Hybernate_Student [stdid=" + stdid + ", name=" + name + ", address=" + address + "]";
	}
	

}
