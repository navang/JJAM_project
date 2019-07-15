package com.java.jjam.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.jjam.domain.BoardVO;
import com.java.jjam.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	//이렇게 함으로서 db를 가지않고 바로 view로 연결해주는 메소드를 처리할 수 있음
			@RequestMapping("/{step}.do")
			public String viewPage(@PathVariable String step) {
				return step;
			}
	
			// 글 등록
			@RequestMapping(value = "/insertBoard.do")
			public void insertBoard(BoardVO vo) throws IOException {
				boardService.insertBoard(vo);
			}
			@RequestMapping("/jjam_3_form.do")
			public void viewBoard() {
				
			}
			
			
			
			
}
