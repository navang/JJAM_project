package com.java.jjam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.jjam.dao.BoardDAO;
import com.java.jjam.domain.BoardAndCateVO;
import com.java.jjam.domain.BoardByCateVO;
import com.java.jjam.domain.BoardVO;

@Service
public class BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	public void insertPayment(BoardVO vo) {
		boardDAO.insertPayment(vo); 
	}
	public void insertJjim(BoardVO vo) {
		boardDAO.insertJjim(vo);
	}
	
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}
	public void viewBoard() {
		boardDAO.viewBoard();
	}
	public List<BoardAndCateVO> viewBoard1(BoardAndCateVO vo){
		return boardDAO.viewBoard1(vo);
	}
	// select

	public List<BoardByCateVO> viewBoardByCate(BoardByCateVO vo){
		return boardDAO.viewBoardByCate(vo);
	}
	public List<BoardAndCateVO> changeBoard(BoardAndCateVO vo){
		return boardDAO.changeBoard(vo);
	}
	// 게시물수
	public int cntBoard() {
		return boardDAO.cntBoard();
	}

	public List<BoardByCateVO> viewSearch(BoardByCateVO vo){
		return boardDAO.viewSearch(vo);
	}
//회원수
	public int cntMember() {
		return boardDAO.cntMember();
	}



}
