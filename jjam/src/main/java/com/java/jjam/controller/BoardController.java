package com.java.jjam.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.java.jjam.domain.BoardAndCateVO;
import com.java.jjam.domain.BoardByCateVO;
import com.java.jjam.domain.BoardVO;
import com.java.jjam.domain.CustomerVO;
import com.java.jjam.service.BoardService;
import com.java.jjam.service.CustomerService;

import net.sf.json.JSONArray;

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

			@Autowired
			private CustomerService customerService;
			
			//아이디 중복확인
			@RequestMapping(value="idCheck.do", produces="applicateion/text; charset=UTF-8")
			@ResponseBody
			public String idCheck(CustomerVO vo) {
				CustomerVO customerVO =customerService.idCheck_Login(vo);
				String result = "사용가능한 아이디입니다";
				if( customerVO !=null) result ="중복된 아이디입니다";
				System.out.println("##idCheck controller##");
				return result;
			}
			//로그인
			@RequestMapping("Login.do")
			public String login(CustomerVO vo, HttpSession session) {
				CustomerVO result= customerService.idCheck_Login(vo);
				if(result ==null || result.getC_id() ==null) {
					
					return "/customerLogin";
				}else {
					session.setAttribute("sessionTime", new Date().toLocaleString());
					session.setAttribute("c_id", result.getC_id());
				}
				return "/insertBoard";
			}

			// 회원가입
			@RequestMapping("/insertCustomer.do")
			public ModelAndView insert(CustomerVO vo) {
				System.out.println("컨트롤러");
				int result =customerService.insertCustomer(vo);
				String message = "가입되지않았습니다.";
				if(result >0) message = vo.getC_id()+"님 회원가입 완료";
				ModelAndView mv = new ModelAndView();
				mv.addObject("result", result);
				mv.addObject("message", message);
				mv.setViewName("/customerJoin_done");
				return mv;
			}
			//게시물 가져오기
			@RequestMapping("/jjam_3_form.do")
			public void viewBoard(BoardAndCateVO vo, Model model) {
				List<BoardAndCateVO> list = boardService.viewBoard1(vo);
		
			//mybatis에서 받아온 list값을 json구조의 array로 변환
				JSONArray jsonArray = new JSONArray();
				model.addAttribute("jsonList", jsonArray.fromObject(list));
				model.addAttribute("list",list);
			}
			//cate별 검색한 게시물 가져오기 
			@RequestMapping("/jjam_2_search.do")
			public void jjam() {}
			
			
			
		@RequestMapping("/boardByCate.do")
			public ModelAndView viewBoardByCate(BoardByCateVO vo) {
				List<BoardByCateVO> listByCate = boardService.viewBoardByCate1(vo);
				ModelAndView mv = new ModelAndView();
//				for(int i=0; i<listByCate.size(); i++) {
//					System.out.println(listByCate.get(i).getCate_ename());
//				}
				JSONArray jsonArrayCate = new JSONArray();
		
//				model.addAttribute("listByCate",listByCate);
				mv.setViewName("/jjam_2_search");
				mv.addObject("jsonList", jsonArrayCate.fromObject(listByCate));
			
				return mv;
			}
		
		
		
						
}
