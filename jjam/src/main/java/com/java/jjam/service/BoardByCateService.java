package com.java.jjam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.jjam.dao.BoardDAO;
import com.java.jjam.domain.BoardAndCateVO;
import com.java.jjam.domain.BoardByCateVO;
import com.java.jjam.domain.BoardVO;

@Service
public class BoardByCateService {
	@Autowired
	private BoardDAO boardDAO;
	
	
	// select

	public List<BoardByCateVO> viewBoardByCate(BoardByCateVO vo){
		return boardDAO.viewBoardByCate(vo);
	}
}
