package LeaveManagementSystem;

public class LeaveHistory {
			
	private int leaveId;
	private int noOfDays;
	private String managerComments;
	private int empId;
	private String leaveReason;
	public LeaveHistory(int leaveId, int noOfDays, String managerComments, int empId, String leaveReason) {
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
		return "LeaveHistory [leaveId=" + leaveId + ", noOfDays=" + noOfDays + ", managerComments=" + managerComments
				+ ", empId=" + empId + ", leaveReason=" + leaveReason + "]";
	}
	
}

		public static list