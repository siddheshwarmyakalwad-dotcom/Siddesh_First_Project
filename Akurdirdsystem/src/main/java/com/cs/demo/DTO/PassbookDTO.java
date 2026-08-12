package com.cs.demo.DTO;

import java.time.LocalDate;

public class PassbookDTO {
	
	private String name;
	private int rdamt;
	private LocalDate rddate;
	private int lateday;
	private int fmt;
	private long pid;
	
	
	
	
	public PassbookDTO(String name, int rdamt, LocalDate rddate, int lateday, int fmt, long pid) {
		super();
		this.name = name;
		this.rdamt = rdamt;
		this.rddate = rddate;
		this.lateday = lateday;
		this.fmt = fmt;
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRdamt() {
		return rdamt;
	}
	public void setRdamt(int rdamt) {
		this.rdamt = rdamt;
	}
	public LocalDate getRddate() {
		return rddate;
	}
	public void setRddate(LocalDate rddate) {
		this.rddate = rddate;
	}
	public int getLateday() {
		return lateday;
	}
	public void setLateday(int lateday) {
		this.lateday = lateday;
	}
	public int getFmt() {
		return fmt;
	}
	public void setFmt(int fmt) {
		this.fmt = fmt;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	
	
	
	

	
	
}
