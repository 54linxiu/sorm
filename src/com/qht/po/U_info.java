package com.qht.po;

import java.sql.*;
import java.util.*;

public class U_info {
	private String myInfo;
	private String newzd;
	private String name;
	private Integer id;
	private java.sql.Clob myimg;


	public String getMyInfo(){
		return myInfo;
	}
	public String getNewzd(){
		return newzd;
	}
	public String getName(){
		return name;
	}
	public Integer getId(){
		return id;
	}
	public java.sql.Clob getMyimg(){
		return myimg;
	}
	public void setMyInfo(String myInfo){
		this.myInfo=myInfo;
	}
	public void setNewzd(String newzd){
		this.newzd=newzd;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public void setMyimg(java.sql.Clob myimg){
		this.myimg=myimg;
	}
	public U_info(){}

}
