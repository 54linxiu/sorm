package com.qht.po;

import java.sql.*;
import java.util.*;

public class U_user {
	private java.sql.Date regtime;
	private java.sql.Time lasttime;
	private java.sql.Timestamp ttt;
	private String name;
	private Integer id;


	public java.sql.Date getRegtime(){
		return regtime;
	}
	public java.sql.Time getLasttime(){
		return lasttime;
	}
	public java.sql.Timestamp getTtt(){
		return ttt;
	}
	public String getName(){
		return name;
	}
	public Integer getId(){
		return id;
	}
	public void setRegtime(java.sql.Date regtime){
		this.regtime=regtime;
	}
	public void setLasttime(java.sql.Time lasttime){
		this.lasttime=lasttime;
	}
	public void setTtt(java.sql.Timestamp ttt){
		this.ttt=ttt;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public U_user(){}

}
