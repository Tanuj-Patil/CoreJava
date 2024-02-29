package com.infogalaxy.employeemodel;

import java.util.Scanner;

public class EmployeeModel {

	private int eid;
	private String ename;
	private String mobno;
	private double salary;
	Scanner scanner = new Scanner(System.in);
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void setMobNo(String mobno) {
		this.mobno = mobno;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getEid() {
		return this.eid;
	}
	
	public String getEname() {
		return this.ename;
	}
	
	public String getMobNo() {
		return this.mobno;
	}
	
	public double getSalary() {
		return this.salary;
	}
}
