package com.hq.pojo;

public class Agreement extends MyPage{
	private Integer aId;
	private int eId;
	private String aStartDate;
	private String aEndDate;
	private String eJob;
	private String aContent;
	private String aRemark;
	private String eName;
	public Agreement(Integer aId, int eId, String aStartDate, String aEndDate, String eJob, String aContent,
			String aRemark, String eName) {
		super();
		this.aId = aId;
		this.eId = eId;
		this.aStartDate = aStartDate;
		this.aEndDate = aEndDate;
		this.eJob = eJob;
		this.aContent = aContent;
		this.aRemark = aRemark;
		this.eName = eName;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Agreement [aId=" + aId + ", eId=" + eId + ", aStartDate=" + aStartDate + ", aEndDate=" + aEndDate
				+ ", eJob=" + eJob + ", aContent=" + aContent + ", aRemark=" + aRemark + ", eName=" + eName + "]";
	}
	public Agreement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agreement(Integer aId, int eId, String aStartDate, String aEndDate, String eJob, String aContent,
			String aRemark) {
		super();
		this.aId = aId;
		this.eId = eId;
		this.aStartDate = aStartDate;
		this.aEndDate = aEndDate;
		this.eJob = eJob;
		this.aContent = aContent;
		this.aRemark = aRemark;
	}
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getaStartDate() {
		return aStartDate;
	}
	public void setaStartDate(String aStartDate) {
		this.aStartDate = aStartDate;
	}
	public String getaEndDate() {
		return aEndDate;
	}
	public void setaEndDate(String aEndDate) {
		this.aEndDate = aEndDate;
	}
	public String geteJob() {
		return eJob;
	}
	public void seteJob(String eJob) {
		this.eJob = eJob;
	}
	public String getaContent() {
		return aContent;
	}
	public void setaContent(String aContent) {
		this.aContent = aContent;
	}
	public String getaRemark() {
		return aRemark;
	}
	public void setaRemark(String aRemark) {
		this.aRemark = aRemark;
	}
	
}
