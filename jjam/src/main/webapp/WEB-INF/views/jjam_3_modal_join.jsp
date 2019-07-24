<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%> 
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
   <%@ page import="java.util.*" %>
    <%@ page import="com.java.jjam.domain.BoardAndCateVO"%>


      <!-- 모달 css -->
   <link rel="stylesheet" href="./resources/style/modalStyle.css" type="text/css">
       
<script>
$(function(){
    // 버튼 호버 시 이미지 각 아이디값 잘 볼것 
    $('div #btn1').hover(function(){
        $('div #btn1 img').attr('src','./resources/image/form/heart1.png'); 
    },function(){ $('div #btn1 img').attr('src','./resources/image/form/heart-before.png')});
    $('div #btn2').hover(function(){
        $('div #btn2 img').attr('src','./resources/image/form/arrow1.png');
    },function(){ $('div #btn2 img').attr('src','./resources/image/form/arrow-before.png')});
    $('div #btn3').hover(function(){
        $('div #btn3 img').attr('src','./resources/image/form/paid1.png'); 
    },function(){ $('div #btn3 img').attr('src','./resources/image/form/paid-before.png')});
    $('div #btn4').hover(function(){
        $('div #btn4 img').attr('src','./resources/image/form/chat1.png');
    },function(){ $('div #btn4 img').attr('src','./resources/image/form/chat-before.png')});
    $('div #btn5').hover(function(){
        $('div #btn5 img').attr('src','./resources/image/form/cancle1.png');
    },function(){ $('div #btn5 img').attr('src','./resources/image/form/cancle-before.png')});
    $('div #btn6').hover(function(){
        $('div #btn6 img').attr('src','./resources/image/form/progress1.png');
    },function(){ $('div #btn6 img').attr('src','./resources/image/form/progress-berfore.png')});
   

	
	//참여하기 클릭했을때 결제페이지에 정보 넘기기 
	$('#btn3').click(function(){
		$(".parti").empty();
 		var c_id = $("#c_id2").val();
 		var cate_name = $("#cate_name2").val();
 		var b_title = $("#b_title2").val();
 		var b_location = $("#b_location2").val();
 		var b_date = $("#b_date2").val();
 		var b_content = $("#b_content2").val();
 		var b_price = $("#b_price2").val();
 		var b_no = $("#b_no2").val();
 		var bc_id = "<%=session.getAttribute("userName")%>";
 	
//  		var cate_image = $("#cate_image").attr("src");
		
 		$("#c_id1").text(c_id);
 		$("#cate_name1").text(cate_name);
 		$("#b_title1").text(b_title);
 		$("#b_location1").text(b_location);
 		$("#b_date1").text(b_date);
 		$("#b_price1").text(b_price);
 		$("#b_content1").text(b_content);
 		$("#b_no1").text(b_no);
 		$("#bc_id1").text(bc_id);  //구매자 id값 추후 삭제 안보이게 처리
 		$("#pay").modal("show");
	});	
	
	
	//////////////////찜하기
	
	$(".jjim").click(function(){
		alert("클릭");
		$.ajax({
			type:"POST",
			url:"jjam_3_jjim.do",
			data:
			{"b_no":$("#b_no2").val(),
			 "c_id" : $("#bc_id1").text()        			
			},
			success: function(){
				alert("찜 성공");
			},
			error: function(){
				alert("찜 실패");
			}
		});
	});
	//결제모달창

	$(".pay_button").click(function(){
		if($(".pay_checkbox").prop("checked")){
			$.ajax({
				type:"POST",
				url:"jjam_3_payment.do",
				data:
				{
				"c_id" : $("#bc_id1").text(),
				"b_no" : $("#b_no1").text()
				},
				success: function(){
					$("#join").modal("hide");
					$("#pay").modal("hide");
					alert("결제성공")
				},
				error:function(){
					alert("결제보내기 실패")
				}
				
			});
		}else{
// 			$("#pay_cancel_Modal").modal("show");
			$("#pay_cancel_Modal").modal("show");
		}
	});
	
 	});

</script>
<% BoardAndCateVO data = (BoardAndCateVO)request.getAttribute("data"); %>
<<<<<<< HEAD
  
<!----------------------------------참여 MODAL창----------------------------------------->
    
                <div id="join" class="modal fade "> 
                     <div class="cate-img">
                    <img class="w-100" src="<%=data.getCate_icon()%>.png" ><!-- 품목카테고리 이미지 동적으로 넣어주세요-->
=======




     <!----------------------------------참여 MODAL창----------------------------------------->
    
                <div id="join" class="modal fade "> 
                     <div class="cate-img">
                    <img class="w-100" src="${data.cate_icon}.png"  ><!-- 품목카테고리 이미지 동적으로 넣어주세요-->
>>>>>>> 7f7c7283d27dcf0b9cae4bf84bee2c912e11a8f9
                </div>             
                        
                    <div class=" modal-dialog modal-position"><!-- dialog 지우면 닫기 기능이 안됨-->
                            <div class="modal-content modal-style"><!-- content 지우면 클릭이안됨-->
                                <div class="modal-header" style="display:none;"></div>

                                <div class="modal-body"><!--padding-->
<<<<<<< HEAD
                                  
                                            <!-- 모달 내용칸 -->
                                            <input class="input-form" id="c_id2"       readonly value="${data.c_id}" > <input class="input-form" readonly value="님의 나눔"/>    <input  class="input-form" readonly id="b_no2"        value="${data.b_no}" placeholder="글번호">
                                            <input class="input-form" id="b_title2"    readonly value="${data.b_title}" placeholder="제목">                                      <input  class="input-form" readonly id="cate_name2"   value="${data.cate_name}" placeholder="품목">
                                            <input class="input-form" id="b_location2" readonly value="${data.b_location}" placeholder="위치">                                   <input  class="input-form" readonly id="b_price2"     value="${data.b_price}" placeholder="가격">
                                            <input  class="input-form" readonly id="b_content2"   value="${data.b_content}" placeholder="내용">                           
                                            
                                            <div class="modal-inner-grid2">
                                            <!--3--><div id="btn3" class="button"><img class="h-50"   style="margin-top:30px;"src="./img/form/paid-before.png"></div>
                                        <!--4--><div style="text-align: right; padding-top:30px;">  
                                                
                                                <div id="btn1" class="button"><img class="h-50" style="margin-top:17px;" src="./img/form/heart-before.png"></div> 
                                                <div id="btn2" class="button"><img class="h-50" style="margin-top:17px;" src="./img/form/arrow-before.png"></div>
                                                <div id="btn4" class="button"><img class="h-50" style="margin-top:17px;" src="./img/form/chat-before.png"></div>
                                                <div id="btn5" class="button"><img class="h-50" data-dismiss="modal" style="margin-top:17px;" src="./img/form/cancle-before.png"></div>
=======
                                    <input class="input-form" id="input-title" readonly value="나눔참여"/>
                                            <!-- 모달 내용칸 -->
                                             <input readonly class="input-form" id="c_id2"  readonly value="${data.c_id}" >                      
                                             <input class="input-form" readonly value="님의 나눔"/> 
                                             <input class="input-form" readonly value="제목 : "/>
                                             <input class="input-form" id="b_title2"    readonly value="${data.b_title}" placeholder="제목">                                            
                                             <input readonly  class="input-form" readonly id="b_no2"        value="${data.b_no}" placeholder="글번호"> 
                                             <input class="input-form" readonly value="품목 : "/>      
                                             <input  class="input-form" readonly id="cate_name2"   value="${data.cate_name}" placeholder="품목">
                                             <input class="input-form" readonly value="가격 : "/>                                  
                                             <input  class="input-form" readonly id="b_price2"     value="${data.b_price}" placeholder="가격">
                                             <input class="input-form" readonly value="위치 : "/>     
                                             <input readonly class="input-form" id="b_location2" readonly value="${data.b_location}" placeholder="위치"> 
                                        
                                             <input readonly  class="input-form" readonly id="b_content2"   value="${data.b_content}" placeholder="내용">                           
                                            
                                            <div class="modal-inner-grid2">
                                            <!--3--><div id="btn3" class="button"><img class="h-50 img_cart_margin" src="./resources/image/form/paid-before.png"></div>
                                        <!--4--><div class="button_div" >  
                                                
                                                <div id="btn1" class="button"><img class="h-50 img_margin" src="./resources/image/form/heart-before.png"></div> 
                                                <div id="btn2" class="button"><img class="h-50 img_margin" src="./resources/image/form/arrow-before.png"></div>
                                                <div id="btn4" class="button"><img class="h-50 img_margin" src="./resources/image/form/chat-before.png"></div>
                                                <div id="btn5" class="button"><img class="h-50 img_margin" data-dismiss="modal" src="./resources/image/form/cancle-before.png"></div>
>>>>>>> 7f7c7283d27dcf0b9cae4bf84bee2c912e11a8f9
                                               
                                                </div>
                                         </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>


<<<<<<< HEAD
=======













                                          
>>>>>>> 7f7c7283d27dcf0b9cae4bf84bee2c912e11a8f9

            
            
              <!----------------------------------결제 MODAL창----------------------------------------->

            <div id="pay" class="modal fade">
                    <div class="modal-dialog">
                        <div class="modal-content modal-size">
                            <div class="modal-header">
                                <h4>결제 </h4>
                             
                            </div>
                            <div class="modal-body">
                                <div >
                                    <div>
                                        <div>
                                            <li>판매자: <span id="c_id1" class="parti"></span> 님의 나눔</li>
                                            <li>글번호: <span id="b_no1" class="parti"></span></li>
                              
                                            <li>구매자id : <span id="bc_id1" class="parti">${userName}</span></li>
                                            <li>제목 : <span id="b_title1" class="parti"></span></li>
                                            <li>품목 : <span id="cate_name1" class="parti"></span></li>                                          
                                            <li>위치 : <span id="b_location1" class="parti"></span></li>
                                            <li>가격 : <span id="b_price1" class="parti"></span></li>
                                            <li>날짜 : <span id="b_date1" class="parti"></span></li>
                                            <li>내용 : <span id="b_content1" class="parti"></span></li>
											<span id="cate_image1" style="display:none;" class="parti"></span>
                                            <li><input type="checkbox" class="pay_checkbox"> 위의 내용을 확인 하셨습니까?</li>
                                        </div>
                                        
                                        <div class="col-lg-12"
                                            style="display: grid;  grid-template-rows:50% 50%;">
                                            <input type="button" class="col-sm-12 pay_button" style="border-radius: 10px; color:white; background-color: #d4b113" value="카카오페이">
                                            <input  data-dismiss="modal" type="button" class="col-sm-12" style="border-radius: 10px; color:white; background-color: #525252" value="돌아가기">
                                         
                                        </div>
                                    </div>
                                 
                                </div>
    
                            </div>
                            <div class="modal-footer">
    
                            </div>
                        </div>
                    </div>
                </div>
                
<!--                 aria-hidden="true" -->
                <!-- --------------------결제 실패시 뜨는 모달창 ---------------->
                
                <div class="modal fade" id="pay_cancel_Modal" tabindex="-1" role="dialog" aria-labelledby="basicModal" >
 				 <div class="modal-dialog">
    				<div class="modal-content">
      					<div class="modal-header">
        	<h4 class="modal-title" id="myModalLabel">결제실패</h4>
       		 <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">×</span>
       			 </button>
      			</div>
      			<div class="modal-body">
        <h5 style="text-align:center; color:black">체크버튼을 눌러주세요</h5>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
            
         

</body>

