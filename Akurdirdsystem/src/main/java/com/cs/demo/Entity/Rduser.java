package com.cs.demo.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rduser {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long rid;
    
    private String name;
    private String address;
    
    @Column(name="dob") //this will be save as date in db
    private LocalDate dob;
    
    
    @Column(name="rdate")  // this will be save as date in db
    private LocalDate rddates;
    
    private String gender;
    
    private int rdamt;
    private String occupation;
    private String acnum;
    
    @Column(name="adharno", unique=true, nullable=false)
    private String adhar;
    
    private String panno;
    
    private String nname;
    private String naddress;
    private String nadharno;
    private String npanno;
    
    private boolean agree;

	public long getRid() {
		return rid;
	}

	public void setRid(long rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getRddates() {
		return rddates;
	}

	public void setRddates(LocalDate rddates) {
		this.rddates = rddates;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getRdamt() {
		return rdamt;
	}

	public void setRdamt(int rdamt) {
		this.rdamt = rdamt;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAcnum() {
		return acnum;
	}

	public void setAcnum(String acnum) {
		this.acnum = acnum;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public String getNaddress() {
		return naddress;
	}

	public void setNaddress(String naddress) {
		this.naddress = naddress;
	}

	public String getNadharno() {
		return nadharno;
	}

	public void setNadharno(String nadharno) {
		this.nadharno = nadharno;
	}

	public String getNpanno() {
		return npanno;
	}

	public void setNpanno(String npanno) {
		this.npanno = npanno;
	}

	public boolean isAgree() {
		return agree;
	}

	public void setAgree(boolean agree) {
		this.agree = agree;
	}
    
    
    
    
    
    
	
}
