package com.etc.entity;

public class Log {
	
	private int logId ;
	private String logop ;
	private String logDate ;
	
	public Log() {
		// TODO Auto-generated constructor stub
	}

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public String getLogop() {
		return logop;
	}

	public void setLogop(String logop) {
		this.logop = logop;
	}

	public String getLogDate() {
		return logDate;
	}

	public void setLogDate(String logDate) {
		this.logDate = logDate;
	}

	@Override
	public String toString() {
		return "Log [logId=" + logId + ", logop=" + logop + ", logDate=" + logDate + "]";
	}
	
	

}
