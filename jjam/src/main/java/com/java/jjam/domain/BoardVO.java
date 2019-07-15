package com.java.jjam.domain;

public class BoardVO {  //게시판
	private int b_no;   //게시판번호
	private String b_date; //게시판 등록일
	private String b_content; //게시판 내용
	private String b_location; // 게시판 회원위치
	private int b_price; //게시판 제품 가격
	private String b_name; // 게시판 제품 이름
	private String b_title;  //게시판 게시물제목
	private String b_image; //게시판 게시물 이미지
	private int b_view; // 게시판 조회수
	private int b_heart; //게시판 하트갯수
	private int b_ea; //게시판 제품 갯수
	private String cate_id; //카테고리id fk
	private String c_id; //회원id fk
	private String b_latitude; //게시판 위도값
	private String b_longitude; //게시판 경도값
	
	
	
	//getter, setter
	public String getB_latitude() {
		return b_latitude;
	}
	public void setB_latitude(String b_latitude) {
		this.b_latitude = b_latitude;
	}
	public String getB_longitude() {
		return b_longitude;
	}
	public void setB_longitude(String b_longitude) {
		this.b_longitude = b_longitude;
	}
	
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public String getB_location() {
		return b_location;
	}
	public void setB_location(String b_location) {
		this.b_location = b_location;
	}
	public int getB_price() {
		return b_price;
	}
	public void setB_price(int b_price) {
		this.b_price = b_price;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_image() {
		return b_image;
	}
	public void setB_image(String b_image) {
		this.b_image = b_image;
	}
	public int getB_view() {
		return b_view;
	}
	public void setB_view(int b_view) {
		this.b_view = b_view;
	}
	public int getB_heart() {
		return b_heart;
	}
	public void setB_heart(int b_heart) {
		this.b_heart = b_heart;
	}
	public int getB_ea() {
		return b_ea;
	}
	public void setB_ea(int b_ea) {
		this.b_ea = b_ea;
	}
	public String getCate_id() {
		return cate_id;
	}
	public void setCate_id(String cate_id) {
		this.cate_id = cate_id;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	
	
	
	

}
