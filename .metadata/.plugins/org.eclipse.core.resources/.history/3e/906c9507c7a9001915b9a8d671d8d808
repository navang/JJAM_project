<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%> 
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
   <%@ page import="java.util.*" %>
    <%@ page import="com.java.jjam.domain.BoardAndCateVO"%>
<!-- <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> -->
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
         

</body>

