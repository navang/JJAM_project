package com.java.jjam.dao;



import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.jjam.domain.BoardAndCateVO;
import com.java.jjam.domain.BoardByCateVO;
import com.java.jjam.domain.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertPayment(BoardVO vo) {
		System.out.println("mybatis insertPayment 실행");
		mybatis.insert("Board.insertPayment", vo);
	}
	public void insertJjim(BoardVO vo) {
		System.out.println("mybatis insertJjim 실행");
		mybatis.insert("Board.insertJjim", vo);
	}
	
	public void insertBoard(BoardVO vo) {
		System.out.println("mybatis insertBoard 실행");
		mybatis.insert("Board.insertBoard", vo);
	}
	public void viewBoard() {
		System.out.println("mybatis viewBoard 실행");
		mybatis.select("Board.viewBoard", null);
	}
	public List<BoardAndCateVO> viewBoard1(BoardAndCateVO vo){
		System.out.println("mybatis viewBoard1 실행");
		List<BoardAndCateVO> list = mybatis.selectList("Board.viewBoard", vo);
		
		return list;
	}
	
	//마우스클릭시 게시글 리스트 변경
	public List<BoardAndCateVO> changeBoard(BoardAndCateVO vo){
		System.out.println("mybatis changeBoard 실행");
		List<BoardAndCateVO> list = mybatis.selectList("Board.changeBoard", vo);
		return list;
	}
	
	// select by 

	public List<BoardByCateVO> viewBoardByCate(BoardByCateVO vo){
		System.out.println("mybatis viewBoardByCate 실행"+vo.getCate_ename());
		List<BoardByCateVO> listByCate = mybatis.selectList("BoardByCate.viewBoardByCate", vo);
	
		return listByCate;
	}
	// 게시물 수 
	public int cntBoard() {
		System.out.println("mybatis cntBoard 실행");
		int result=mybatis.selectOne("BoardCount.cntBoard", null);
		return result;
	}
	//회원수
	public int cntMember() {
		System.out.println("mybatis cntMember 실행");
		int result=mybatis.selectOne("BoardCount.cntMember", null);
		return result;
	}
	
}
