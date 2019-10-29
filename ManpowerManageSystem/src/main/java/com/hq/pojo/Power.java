package com.hq.pojo;

public class Power {
	 private Integer pId;

	    private String pName;

	    private String pUrl;

	    private Integer level;
	    
	    private Integer parentId;

		public Integer getpId() {
			return pId;
		}

		public void setpId(Integer pId) {
			this.pId = pId;
		}

		public String getpName() {
			return pName;
		}

		public void setpName(String pName) {
			this.pName = pName;
		}

		public String getpUrl() {
			return pUrl;
		}

		public void setpUrl(String pUrl) {
			this.pUrl = pUrl;
		}

		public Integer getLevel() {
			return level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public Integer getParentId() {
			return parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}
}
