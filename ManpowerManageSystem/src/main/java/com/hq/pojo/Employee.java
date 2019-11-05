package com.hq.pojo;

import java.util.Date;

public class Employee extends MyPage {
	private int eId;
	private String eName;
	private String eSex;
	private String eBirthDate;
	private String ePhone;
	private String eEmail;
	private String eEducation;
	private String eDepartment;
	private String eJob;
	private String eEntryDate;
	private String eState;
	private String eRemark;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteSex() {
		return eSex;
	}
	public void seteSex(String eSex) {
		this.eSex = eSex;
	}
	public String geteBirthDate() {
		return eBirthDate;
	}
	public void seteBirthDate(String eBirthDate) {
		this.eBirthDate = eBirthDate;
	}
	public String getePhone() {
		return ePhone;
	}
	public void setePhone(String ePhone) {
		this.ePhone = ePhone;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public String geteEducation() {
		return eEducation;
	}
	public void seteEducation(String eEducation) {
		this.eEducation = eEducation;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}
	public String geteJob() {
		return eJob;
	}
	public void seteJob(String eJob) {
		this.eJob = eJob;
	}
	public String geteEntryDate() {
		return eEntryDate;
	}
	public void seteEntryDate(String eEntryDate) {
		this.eEntryDate = eEntryDate;
	}
	public String geteState() {
		return eState;
	}
	public void seteState(String eState) {
		this.eState = eState;
	}
	public String geteRemark() {
		return eRemark;
	}
	public void seteRemark(String eRemark) {
		this.eRemark = eRemark;
	}
	public Employee(int eId, String eName, String eSex, String eBirthDate, String ePhone, String eEmail,
			String eEducation, String eDepartment, String eJob, String eEntryDate, String eState, String eRemark) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSex = eSex;
		this.eBirthDate = eBirthDate;
		this.ePhone = ePhone;
		this.eEmail = eEmail;
		this.eEducation = eEducation;
		this.eDepartment = eDepartment;
		this.eJob = eJob;
		this.eEntryDate = eEntryDate;
		this.eState = eState;
		this.eRemark = eRemark;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSex=" + eSex + ", eBirthDate=" + eBirthDate
				+ ", ePhone=" + ePhone + ", eEmail=" + eEmail + ", eEducation=" + eEducation + ", eDepartment="
				+ eDepartment + ", eJob=" + eJob + ", eEntryDate=" + eEntryDate + ", eState=" + eState + ", eRemark="
				+ eRemark + "]";
	}
	
}
