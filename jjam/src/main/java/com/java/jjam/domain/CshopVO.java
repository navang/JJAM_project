package com.java.jjam.domain;

public class CshopVO {   //회원상점
 	private String c_id;  //회원id
	private int cs_heart;  // 회원하트
	private int cs_view;   //회원 조회수
	
	
	
	//getter, setter
	
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public int getCs_heart() {
		return cs_heart;
	}
	public void setCs_heart(int cs_heart) {
		this.cs_heart = cs_heart;
	}
	public int getCs_view() {
		return cs_view;
	}
	public void setCs_view(int cs_view) {
		this.cs_view = cs_view;
	}
	
	
	

}
