package com.chandrasautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	private String ename;
	private int eid;
	
	//@Autowired
	Department department;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void showEmployeeDetails()
	{
		System.out.println("Employee Name is :"+ename);
		System.out.println("Employee id is :"+eid);
		System.out.println("Department is :"+department.getDeptName());
	}

}
