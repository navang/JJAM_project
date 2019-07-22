<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%> 
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
   <%@ page import="java.util.*" %>
    <%@ page import="com.java.jjam.domain.BoardAndCateVO"%>


    <link rel="stylesheet" href="./css/modalStyle.css" type="text/css">
<script>
$(function(){
	
	
	
	//참여하기 클릭했을때 결제페이지에 정보 넘기기 
	$('.participation').click(function(){
		$(".parti").empty();
 		var c_id = $("#c_id2").text();
 		var cate_name = $("#cate_name2").text();
 		var b_title = $("#b_title2").text();
 		var b_location = $("#b_location2").text();
 		var b_date = $("#b_date2").text();
 		var b_content = $("#b_content2").text();
 		var b_price = $("#b_price2").text();
 		var b_no = $("#b_no2").text();
 		var bc_id = $("#bc_id2").text();  //입력한 구매자id값 
 	
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
	});	
	
	
	//////////////////찜하기
	
	$(".jjim").click(function(){
		alert("클릭");
		$.ajax({
			type:"POST",
			url:"jjam_3_jjim.do",
			data:
			{"b_no":$("#b_no2").text(),
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

<div id="join" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content modal-size">
                        <div class="modal-header">
                            <h4>나눔에 참여하기 </h4>
                         
                        </div>
                        <div class="modal-body ">
                            <div class="modal-inner-grid">
                                <div>
                                    <div>
                                            <li><span id="c_id2">${data.c_id}</span> 님의 나눔</li>
                                            <li>글번호&nbsp; : <span id="b_no2">${data.b_no}</span></li>
                                            <!-- 추후에 안보이게 처리 -->
                                            <li>구매자id&nbsp; : <span id="bc_id2" >${userName}</span></li>
                                            <li>제목 &nbsp; : <span id="b_title2">${data.b_title}</span></li>
                                            <li>품목 &nbsp; : <span id="cate_name2">${data.cate_name}</span></li>
                                            <li>위치 &nbsp; : <span id="b_location2">${data.b_location}</span></li>
                                            <li>가격 &nbsp; : <span id="b_price2">${data.b_price}</span></li>
                                            <li>날짜 &nbsp; : <span id="b_date2">${data.b_date}</span></li>
                                             <li>내용 &nbsp; : <span id="b_content2">${data.b_content}</span></li>
                                             <span id="b_no2" style="display:none;">${data.b_no}</span>
                                             
                                    </div>
                                    <div class="col-lg-12"
                                        style="display: grid; grid-template-columns:50% 50%; grid-template-rows:50% 50%;">
                                        <input type="button" class="col-sm-12 participation"
                                            style="color:white; background-color: #147b6b" value="참여하기" data-toggle="modal" data-target="#pay">
                                        <input type="button" class="col-sm-12 jjim"
                                            style="color:white; background-color: #f37f7f" value="찜 하기">
                                        <input type="button" class="col-sm-12 cancel"  data-dismiss="modal"
                                            style="color:white; background-color: #999999" value="취소">
                                        <input type="button" class="col-sm-12"
                                            style="color:white; background-color: #558ccf" value="길찾기"
                                            data-toggle="modal" data-target="#road">
                                    </div>
                                </div>
                                <div><img src="<%=data.getCate_icon()%>.png" class="w-100 h-100 cate_image" alt=""></div>
                            </div>

                        </div>
                        <div class="modal-footer">

                        </div>
                    </div>
                </div>
            </div>
            
            
            
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

