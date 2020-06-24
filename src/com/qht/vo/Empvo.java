package com.qht.vo;

public class Empvo {
	//select e.id,e.empname,e.salay,b.buid 'bmid',b.dz 'addr' from emp e join bumen b on e.bmid=b.buid
	private Integer id;
	private String empname;
	private Double salay;
	private Integer bmid;
	private String addr;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Double getSalay() {
		return salay;
	}
	public void setSalay(Double salay) {
		this.salay = salay;
	}
	public Integer getBmid() {
		return bmid;
	}
	public void setBmid(Integer bmid) {
		this.bmid = bmid;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Empvo(Integer id, String empname, Double salay, Integer bmid, String addr) {
		super();
		this.id = id;
		this.empname = empname;
		this.salay = salay;
		this.bmid = bmid;
		this.addr = addr;
	}
	public Empvo() {
		
	}
}
