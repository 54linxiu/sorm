package com.qht.po;

import java.sql.*;
import java.util.*;

public class Emp {
	private String empname;
	private java.sql.Date hireDate;
	private Double salay;
	private Integer bmid;
	private Integer id;


	public String getEmpname(){
		return empname;
	}
	public java.sql.Date getHireDate(){
		return hireDate;
	}
	public Double getSalay(){
		return salay;
	}
	public Integer getBmid(){
		return bmid;
	}
	public Integer getId(){
		return id;
	}
	public void setEmpname(String empname){
		this.empname=empname;
	}
	public void setHireDate(java.sql.Date hireDate){
		this.hireDate=hireDate;
	}
	public void setSalay(Double salay){
		this.salay=salay;
	}
	public void setBmid(Integer bmid){
		this.bmid=bmid;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Emp(){}

}
