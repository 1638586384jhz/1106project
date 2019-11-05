package com.hq.pojo;

public class Files extends MyPage{
	private Integer fId;
	private int eId;
	private String fName;
	private String fContent;
	private String fRemark;
	public Integer getfId() {
		return fId;
	}
	public void setfId(Integer fId) {
		this.fId = fId;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfContent() {
		return fContent;
	}
	public void setfContent(String fContent) {
		this.fContent = fContent;
	}
	public String getfRemark() {
		return fRemark;
	}
	public void setfRemark(String fRemark) {
		this.fRemark = fRemark;
	}
	public Files(Integer fId, int eId, String fName, String fContent, String fRemark) {
		super();
		this.fId = fId;
		this.eId = eId;
		this.fName = fName;
		this.fContent = fContent;
		this.fRemark = fRemark;
	}
	public Files() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Files [fId=" + fId + ", eId=" + eId + ", fName=" + fName + ", fContent=" + fContent + ", fRemark="
				+ fRemark + "]";
	}
	
	
}
