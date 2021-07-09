package com.cg.entity;

public class EmployeeInfo {
	private int eid;
	private String name;
	private String designation;
	
	public EmployeeInfo(int eid, String name, String designation) {
		super();
		this.eid = eid;
		this.name = name;
		this.designation = designation;
	}
	
	public EmployeeInfo() {
		
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [eid=" + eid + ", name=" + name + ", designation=" + designation + "]";
	}
    

}
