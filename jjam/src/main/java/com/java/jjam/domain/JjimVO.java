package com.java.jjam.domain;

public class JjimVO { // 찜리스트

	private String c_id;  //회원아이디 //fk 
	private int b_no;  //게시판번호  fk

	
	
	//getter, setter
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	
}
