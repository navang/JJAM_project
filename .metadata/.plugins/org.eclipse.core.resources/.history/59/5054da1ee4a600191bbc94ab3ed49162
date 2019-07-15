package com.java.jjam.dao;



import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.jjam.domain.BoardAndCateVO;
import com.java.jjam.domain.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardVO vo) {
		System.out.println("mybatis insertBoard 실행");
		mybatis.insert("Board.insertBoard", vo);
	}
<<<<<<< HEAD
	
=======
	public void viewBoard() {
		System.out.println("mybatis viewBoard 실행");
		mybatis.select("Board.viewBoard", null);
	}
	public List<BoardAndCateVO> viewBoard1(BoardAndCateVO vo){
		System.out.println("mybatis viewBoard1 실행");
		List<BoardAndCateVO> list = mybatis.selectList("Board.viewBoard", vo);
		
		return list;
	}
>>>>>>> 7e8d138b3c3659399a8a16a82dfa3c7f7c505097
}
