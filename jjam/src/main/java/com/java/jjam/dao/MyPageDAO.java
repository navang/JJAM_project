package com.java.jjam.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.jjam.domain.ChatVO;
import com.java.jjam.domain.PaymentListVO;



@Repository
public class MyPageDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<PaymentListVO> selectPayment(PaymentListVO vo){
		System.out.println("mybatis selectPayment 실행");
		List<PaymentListVO> list = mybatis.selectList("MyPage.selectPayment", vo);
		return list;
	}
	public List<PaymentListVO> selectJjim(PaymentListVO vo){
		System.out.println("mybatis selectJjim 실행");
		List<PaymentListVO> list = mybatis.selectList("MyPage.selectJjim", vo);
		return list;
	}
	
	//쪽지 select
	public List<ChatVO> selectChat(ChatVO chat){
		System.out.println("mybatis selectChat 실행");
		List<ChatVO> list = mybatis.selectList("MyPage.selectChat", chat);
		return list;
	}
}