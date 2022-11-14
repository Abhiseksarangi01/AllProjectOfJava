package com.java.Employ;



public class Employ {

	int empId;
	String empName;
	String empCity;
	int empPhoneNo;
	String empHobby;
	public Employ(int empId, String empName, String empCity, int empPhoneNo, String empHobby) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empPhoneNo = empPhoneNo;
		this.empHobby = empHobby;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public int getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(int empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	public String getEmpHobby() {
		return empHobby;
	}
	public void setEmpHobby(String empHobby) {
		this.empHobby = empHobby;
	}
	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", empPhoneNo=" + empPhoneNo
				+ ", empHobby=" + empHobby + "]";
	}
	
	
}



