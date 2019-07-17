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
	public void viewBoardByCate() {
		System.out.println("mybatis viewBoardByCate 실행");
		mybatis.select("BoardByCate.viewBoardByCate", null);
	}
	public List<BoardByCateVO> viewBoardByCate1(BoardByCateVO vo){
		System.out.println("mybatis viewBoardByCate1 실행");
		List<BoardByCateVO> listByCate = mybatis.selectList("BoardByCate.viewBoardByCate", vo);
		
		return listByCate;
	}
	
}
