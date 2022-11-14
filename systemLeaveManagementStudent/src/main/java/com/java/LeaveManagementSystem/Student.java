package com.java.LeaveManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int leaveId;
	private int noOfDays;
	private String managerComments;
	private int empId;
	private String leaveReason;

	public Student(int leaveId, int noOfDays, String managerComments, int empId, String leaveReason) {
		super();
		this.leaveId = leaveId;
		this.noOfDays = noOfDays;
		this.managerComments = managerComments;
		this.empId = empId;
		this.leaveReason = leaveReason;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getManagerComments() {
		return managerComments;
	}

	public void setManagerComments(String managerComments) {
		this.managerComments = managerComments;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	@Override
	public String toString() {
		return "Student [leaveId=" + leaveId + ", noOfDays=" + noOfDays + ", managerComments=" + managerComments
				+ ", empId=" + empId + ", leaveReason=" + leaveReason + "]";
	}

	public static List<Student> getAllStudentList() {
		List<Student> listOfStudents = new ArrayList<>();
		listOfStudents.add(new Student(1, 2, "Approved", 12, "sickLeave"));
		listOfStudents.add(new Student(2, 3, "Approved", 12, "preveleigeLeave"));
		listOfStudents.add(new Student(3, 3, "Approved", 12, "sickLeave"));
		listOfStudents.add(new Student(4, 4, "Approved", 12, "HomeSickLeave"));
		listOfStudents.add(new Student(5, 2, "Approved", 12, "sickLeave"));
		listOfStudents.add(new Student(6, 3, "Approved", 12, "preveleigeLeave"));
		listOfStudents.add(new Student(7, 2, "Approved", 12, "HomeSickLeave"));
		listOfStudents.add(new Student(8, 5, "Approved", 12, "preveleigeLeave"));
		listOfStudents.add(new Student(9, 7, "Approved", 12, "HomeSickLeave"));
		listOfStudents.add(new Student(10, 8, "Approved", 12, "sickLeave"));

		return listOfStudents;

	}

}
