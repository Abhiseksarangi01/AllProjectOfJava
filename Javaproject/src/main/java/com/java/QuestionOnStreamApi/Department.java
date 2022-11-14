package com.java.QuestionOnStreamApi;

import java.util.ArrayList;
import java.util.List;

public class Department {
	int departmentId ;
	String departmentName ;
	String departmentInfo ;
	public Department(int departmentId, String departmentName, String departmentInfo) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentInfo = departmentInfo;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentInfo() {
		return departmentInfo;
	}
	public void setDepartmentInfo(String departmentInfo) {
		this.departmentInfo = departmentInfo;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentInfo="
				+ departmentInfo + "]";
	}
	
	public static void main(String[] args) {
		
		List<Department> departmentList = new ArrayList<>();
		departmentList.add(new Department(121, "cricket", "virat"));
		departmentList.add(new Department(122, "cricket", "Gambhir"));
		departmentList.add(new Department(123, "cricket", "Tendulkar"));
		departmentList.add(new Department(124, "cricket", "Sehwag"));
		departmentList.add(new Department(125, "cricket", "Ganguly"));
		departmentList.add(new Department(126, "cricket", "Yuvraj"));
		
	
	}
	
}


