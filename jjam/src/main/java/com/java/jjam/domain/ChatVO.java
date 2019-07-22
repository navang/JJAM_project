package com.java.jjam.domain;


public class ChatVO { //쪽지
	private int chat_no;  // 채팅번호
	private String customerA;    //보낸사람 (본인)
	private String bc_id;    //받는사람 (타인) customerB
	private String chat_content;
	private String chat_date;
	private String chat_title;
	
	
	
	//getter setter
	public int getChat_no() {
		return chat_no;
	}
	public void setChat_no(int chat_no) {
		this.chat_no = chat_no;
	}
	public String getCustomerA() {
		return customerA;
	}
	public void setCustomerA(String customerA) {
		this.customerA = customerA;
	}
	public String getBc_id() {
		return bc_id;
	}
	public void setBc_id(String bc_id) {
		this.bc_id = bc_id;
	}
	public String getChat_content() {
		return chat_content;
	}
	public void setChat_content(String chat_content) {
		this.chat_content = chat_content;
	}
	public String getChat_date() {
		return chat_date;
	}
	public void setChat_date(String chat_date) {
		this.chat_date = chat_date;
	}
	public String getChat_title() {
		return chat_title;
	}
	public void setChat_title(String chat_title) {
		this.chat_title = chat_title;
	}
	
	
}
