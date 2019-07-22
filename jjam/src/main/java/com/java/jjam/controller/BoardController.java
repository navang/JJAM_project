package com.java.jjam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.java.jjam.domain.BoardAndCateVO;
import com.java.jjam.domain.BoardByCateVO;
import com.java.jjam.domain.BoardVO;
import com.java.jjam.domain.ChatVO;
import com.java.jjam.domain.CustomerVO;
import com.java.jjam.domain.PaymentListVO;
import com.java.jjam.service.BoardByCateService;
import com.java.jjam.service.BoardService;
import com.java.jjam.service.CustomerService;
import com.java.jjam.service.MyPageService;

import net.sf.json.JSONArray;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	@Autowired
	private BoardByCateService boardByCateService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private MyPageService mypageService;

	
	
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
			
			// 글 갯수 
			@RequestMapping("/jjam_intro.do")
			public ModelAndView cntBoard() {
				int result1 =boardService.cntBoard();
				int result2 =boardService.cntMember();
				String count1 = String.valueOf(result1);
				String count2 = String.valueOf(result2);
				ModelAndView mv = new ModelAndView();
				mv.addObject("cntB", count1);
				mv.addObject("cntC", count2);
				mv.setViewName("/jjam_intro");
				return mv;
			}
			
			

			//아이디체크
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
				System.out.println("로그인 컨트롤러 실행");
				CustomerVO result= customerService.idCheck_Login(vo);
				if(result ==null || result.getC_id() ==null) {
					System.out.println("로그인 실패");
					return "/customerLogin";
				}else {
					System.out.println("로그인성공");
//					session.setAttribute("sessionTime", new Date().toLocaleString());
					session.setAttribute("userName", result.getC_id());
				}
				return "redirect:jjam_3_form.do";
			}
			//로그아웃
			@RequestMapping("jjam_login&out.do")
			public String loginOut(HttpSession session) {
		
				if(session.getAttribute("userName")==null) {
					return "redirect:customerLogin.do";
				}else {
					session.invalidate();
					return "redirect:customerLogin.do";
				}
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

			// 지도화면 시작시 디비값 불러옴

			//게시물 가져오기

			@RequestMapping("/jjam_3_form.do")
			public void viewBoard(BoardAndCateVO vo, Model model) {
				List<BoardAndCateVO> list = boardService.viewBoard1(vo);
		
			//mybatis에서 받아온 list값을 json구조의 array로 변환
				JSONArray jsonArray = new JSONArray();
				model.addAttribute("jsonList", jsonArray.fromObject(list));
				model.addAttribute("list",list);
			}

			
			//참여모달
			@RequestMapping(value= "/jjam_3_participate.do", method = RequestMethod.POST)
			@ResponseBody
			public ModelAndView test11(BoardAndCateVO vo){
				System.out.println("참여모달 컨트롤러 실행");
				ModelAndView mv = new ModelAndView();
				mv.setViewName("/jjam_3_modal_join");
				mv.addObject("data", vo);
				return mv;
			}
			
			//게시판리스트
			@RequestMapping(value="/jjam_3_boardlist.do", method=RequestMethod.POST)
			@ResponseBody
			public ModelAndView boardlist(BoardAndCateVO vo){
				System.out.println("게시판리스트 컨트롤러 실행");
				List<BoardAndCateVO> list = boardService.viewBoard1(vo);
				ModelAndView mv = new ModelAndView();
				mv.setViewName("jjam_3_boardlist");
				JSONArray jsonArray = new JSONArray();
				mv.addObject("jsonList", jsonArray.fromObject(list));
				mv.addObject("data",list);
				return mv;
			}
			//지도 클릭마다 게시판리스트 변경
			@RequestMapping(value="/jjam_3_changeboardlist.do", method=RequestMethod.POST)
			public ModelAndView changeBoard(BoardAndCateVO vo) {
				List<BoardAndCateVO> list = boardService.changeBoard(vo);
				ModelAndView mv = new ModelAndView();
				mv.setViewName("jjam_3_boardlist");
				JSONArray jsonArray = new JSONArray();
				mv.addObject("data",list);
				return mv;
			}
			
			//참여하기 클릭하고 결제와 동시에 db에 데이터 전송
			@RequestMapping(value="/jjam_3_payment.do", method=RequestMethod.POST)
			@ResponseBody
			public void insertPayment(BoardVO vo) {
				boardService.insertPayment(vo);	
			}
			
			//찜하기 눌렀을때 db에 전송
			@RequestMapping(value="/jjam_3_jjim.do", method=RequestMethod.POST)
			@ResponseBody
			public void insertJjim(BoardVO vo) {
				boardService.insertJjim(vo);
			}
			
			//마이페이지에서 결제내역 페이지 출력
			@RequestMapping(value="/jjam_6_mypage_payment.do", method=RequestMethod.POST)
			@ResponseBody
			public ModelAndView selectPayment(PaymentListVO vo) {
				System.out.println("마이페이지 결제내역 컨트롤러 실행");
				System.out.println(vo.getBc_id());
				List<PaymentListVO> plist= mypageService.selectPayment(vo);
				ModelAndView mv = new ModelAndView();
				mv.addObject("data", plist);
				mv.setViewName("jjam_6_mypage_payment");
				return mv;
			}
			//마이페이지에서 찜목록 페이지 출력
			@RequestMapping(value="/jjam_6_mypage_jjim.do", method=RequestMethod.POST)
			@ResponseBody
			public ModelAndView selectJjim(PaymentListVO vo) {
				System.out.println("마이페이지 찜목록 컨트롤러 실행");
				System.out.println(vo.getBc_id());
				List<PaymentListVO> plist= mypageService.selectJjim(vo);
				ModelAndView mv = new ModelAndView();
				mv.addObject("data", plist);
				mv.setViewName("jjam_6_mypage_jjim");
				return mv;
			}
			
			//마이페이지에서 쪽지내역 출력
			@RequestMapping(value="/jjam_6_mypage_letter.do", method=RequestMethod.POST)
			public ModelAndView selectChat(ChatVO chat) {
				List<ChatVO> clist = mypageService.selectChat(chat);
				ModelAndView mv = new ModelAndView();
				mv.addObject("data", clist);
				mv.setViewName("jjam_6_mypage_letter");
				return mv;
			}
			

			// viewBoardByCate 모델 엔뷰(이미지클릭시 검색)
		@RequestMapping(value="boardByCate.do",method=RequestMethod.POST)
		@ResponseBody
			public ModelAndView viewBoardByCate(BoardByCateVO vo) {
			List<BoardByCateVO> listByCate = boardByCateService.viewBoardByCate(vo);
				ModelAndView mv= new ModelAndView();
				mv.addObject("data", listByCate);
				mv.setViewName("jjam_2_search_result");
				return mv;
			}
		
		
		//게시글 검색기능
		@RequestMapping(value="viewSearch.do", method=RequestMethod.POST)
		public ModelAndView viewSearch(BoardByCateVO vo) {
			System.out.println(vo.getB_title());
			List<BoardByCateVO> list = boardService.viewSearch(vo);
			ModelAndView mv = new ModelAndView();
			mv.addObject("data", list);
			mv.setViewName("jjam_2_search_result");
			return mv;
		}
		
		//마이페이지 회원정보수정
		@RequestMapping("updatePrivacy.do")
		public String updatePrivacy(CustomerVO vo, Model model){
			customerService.updatePrivacy(vo);
			model.addAttribute("msg", "개인정보수정이 완료 되었습니다");
			model.addAttribute("url", "jjam_6_mypage.do");
			return "jjam_6_mypage_privacy_alert";
		}
		

			
		

}
