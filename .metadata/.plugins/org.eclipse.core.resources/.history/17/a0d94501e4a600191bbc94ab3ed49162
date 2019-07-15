package com.java.jjam.controller;

import java.io.IOException;
<<<<<<< HEAD
import java.util.Date;

import javax.servlet.http.HttpSession;
=======
import java.util.List;
>>>>>>> 7e8d138b3c3659399a8a16a82dfa3c7f7c505097

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.java.jjam.domain.BoardAndCateVO;
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
<<<<<<< HEAD

			@Autowired
			private CustomerService customerService;
			
			@RequestMapping(value="idCheck.do", produces="applicateion/text; charset=UTF-8")
			@ResponseBody
			public String idCheck(CustomerVO vo) {
				CustomerVO customerVO =customerService.idCheck_Login(vo);
				String result = "사용가능한 아이디입니다";
				if( customerVO !=null) result ="중복된 아이디입니다";
				System.out.println("##idCheck controller##");
				return result;
			}
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
=======
			@RequestMapping("/jjam_3_form.do")
			public void viewBoard(BoardAndCateVO vo, Model model) {
				List<BoardAndCateVO> list = boardService.viewBoard1(vo);
				for(BoardAndCateVO a:list) {
				System.out.println(a.getB_date());
				}
				
			//mybatis에서 받아온 list값을 json구조의 array로 변환
				JSONArray jsonArray = new JSONArray();
				model.addAttribute("jsonList", jsonArray.fromObject(list));
			}
			
			
>>>>>>> 7e8d138b3c3659399a8a16a82dfa3c7f7c505097
			
			
}
