package com.java.jjam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.jjam.dao.CustomerDAO;
import com.java.jjam.domain.CustomerVO;

@Service
public class CustomerService {
	@Autowired
	private CustomerDAO customerDAO;
	
	public CustomerVO idCheck_Login(CustomerVO vo) {
	return customerDAO.idCheck(vo);
	}
	
	public int insertCustomer(CustomerVO vo) {
		return customerDAO.insertCustomer(vo);
		
	}
	public void updatePrivacy(CustomerVO vo) {
		customerDAO.updatePrivacy(vo);
	}

	
}
