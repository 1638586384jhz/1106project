package com.hq.pojo;

import com.hq.pojo.Role;

public class Admin {
	 private Integer sysId;

	    private String sysName;

	    private String sysPwd;
	    
	    private Role role;

		public Integer getSysId() {
			return sysId;
		}

		public void setSysId(Integer sysId) {
			this.sysId = sysId;
		}

		public String getSysName() {
			return sysName;
		}

		public void setSysName(String sysName) {
			this.sysName = sysName;
		}

		public String getSysPwd() {
			return sysPwd;
		}

		public void setSysPwd(String sysPwd) {
			this.sysPwd = sysPwd;
		}

		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}
	    
}
