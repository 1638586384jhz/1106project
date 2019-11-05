package com.hq.pojo;

public class MyPage {
	private Integer page;
	
	private Integer rows;
	
	private Integer start;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public MyPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyPage [page=" + page + ", rows=" + rows + ", start=" + start + "]";
	}
	
}
