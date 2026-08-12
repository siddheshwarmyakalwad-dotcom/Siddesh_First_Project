package com.cs.demo.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Passbook {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pid;
    private int rdamt;
    
    @Column(name="rddate")
    private LocalDate rddate;
    
    private int lateday;
    private int fmt; //this is a fine amt
    private int flag;//this is a flag integer
    
    @ManyToOne
    @JoinColumn(name="rid")
    private Rduser rduser;
    
    

	

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
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

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Rduser getRduser() {
		return rduser;
	}

	public void setRduser(Rduser rduser) {
		this.rduser = rduser;
	}
    
    
    
   
	
}
