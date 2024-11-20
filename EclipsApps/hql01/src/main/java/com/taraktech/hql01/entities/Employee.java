package com.taraktech.hql01.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hemp1")
public class Employee {
	
	@Id
	@Column(name = "ENO")
	private Integer eno;
	@Column(name = "ENAME")
	private String ename;
	@Column(name = "ESAL")
	private Float esal;
	@Column(name = "EADDR")
	private String eaddr;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Float getEsal() {
		return esal;
	}
	public void setEsal(Float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
}
