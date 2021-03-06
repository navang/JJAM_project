package com.java.jjam.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.jjam.domain.CustomerVO;

@Repository
public class CustomerDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public CustomerVO idCheck(CustomerVO vo) {
		System.out.println("mybatis idCheck 실행");
		return mybatis.selectOne("Customer.idCheck", vo);
	
	}
	public int insertCustomer(CustomerVO vo) {
		System.out.println("mybatis insertCustomer 실행");
		return mybatis.insert("Customer.insertCustomer", vo);
	}
	public CustomerVO idCheck_Login(CustomerVO vo) {
		System.out.println("mybatis idCheck 호출");
		return (CustomerVO) mybatis.selectOne("Customer.idCheck", vo);
	}
	public void updatePrivacy(CustomerVO vo) {
		System.out.println("mybatis updatePrivacy 실행");
		mybatis.update("Customer.updatePrivacy",vo);
	}
	
}
