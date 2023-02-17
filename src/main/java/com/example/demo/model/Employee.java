package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Employee 
{
	 @Id
	 private Integer eid;
	 private String ename;
	 private String esal;
	 private String cname;
	 private String eloc;
	 private String edept;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEloc() {
		return eloc;
	}
	public void setEloc(String eloc) {
		this.eloc = eloc;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public Employee(Integer eid, String ename, String esal, String cname, String eloc, String edept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.cname = cname;
		this.eloc = eloc;
		this.edept = edept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", cname=" + cname + ", eloc=" + eloc
				+ ", edept=" + edept + "]";
	}
	 
	 

}
