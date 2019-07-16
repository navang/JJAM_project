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
	public void viewBoardByCate() {
		boardDAO.viewBoardByCate();
	}
	public List<BoardByCateVO> viewBoardByCate1(BoardByCateVO vo){
		return boardDAO.viewBoardByCate1(vo);
	}
}
