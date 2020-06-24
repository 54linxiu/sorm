package com.qht.po;

import java.sql.*;
import java.util.*;

public class Bumen {
	private Integer buid;
	private String dz;


	public Integer getBuid(){
		return buid;
	}
	public String getDz(){
		return dz;
	}
	public void setBuid(Integer buid){
		this.buid=buid;
	}
	public void setDz(String dz){
		this.dz=dz;
	}
	public Bumen(){}

}
