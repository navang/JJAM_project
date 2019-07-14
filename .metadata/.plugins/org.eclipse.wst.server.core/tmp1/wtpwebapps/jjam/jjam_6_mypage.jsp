<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Homepage - Start Bootstrap Template</title>

</head>
<!-- Bootstrap core CSS -->

<link rel="stylesheet" href="./resources/style/mypage1.css">
<link rel="stylesheet" href="./resources/style/main.css">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>


<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
</script>
<!--주소 스크립트 end-->

<script>
  $(function(){
      $('.mypage-menu a').each(function(){
          $(this).click(function() { 
        	  $('.mypage-menu a').css("background-color", "white");
        	  $('.mypage-menu a').css("color", "black");
        	  $(this).css("background-color", "#147b6b");
        	  $(this).css("color", "white");
        	 activeTab = $(this).attr("rel");
        	 $("#ddd").empty();
          $.ajax({
        	  type:'POST',
        	  url:'./'+activeTab+'.jsp',
        	  success:function(data){
        		  $('#ddd').html(data);
        	  },
        	  error:function(){
        		  alert("통신실패");
        	  }
          });
          });
      });
  });
</script>





<!--이메일-->
<script>
/**
 * FloatLabels
 * Version: 1.0
 * URL: http://clubdesign.github.io/floatlabels.js/
 * Description: 
 * Author: Marcus Pohorely ( http://www.clubdesign.at )
 * Copyright: Copyright 2013 / 2014 http://www.clubdesign.at
 */
 !function(a,b){function g(b,c){this.$element=a(b),this.settings=a.extend({},f,c),this.init()}var e="floatlabel",f={slideInput:!0,labelStartTop:"20px",labelEndTop:"10px",paddingOffset:"10px",transitionDuration:.3,transitionEasing:"ease-in-out",labelClass:"",typeMatches:/text|password|email|number|search|url/};g.prototype={init:function(){var a=this,c=this.settings,d=c.transitionDuration,e=c.transitionEasing,f=this.$element,g={"-webkit-transition":"all "+d+"s "+e,"-moz-transition":"all "+d+"s "+e,"-o-transition":"all "+d+"s "+e,"-ms-transition":"all "+d+"s "+e,transition:"all "+d+"s "+e};if("INPUT"===f.prop("tagName").toUpperCase()&&c.typeMatches.test(f.attr("type"))){var h=f.attr("id");h||(h=Math.floor(100*Math.random())+1,f.attr("id",h));var i=f.attr("placeholder"),j=f.data("label"),k=f.data("class");k||(k=""),i&&""!==i||(i="You forgot to add placeholder attribute!"),j&&""!==j||(j=i),this.inputPaddingTop=parseFloat(f.css("padding-top"))+parseFloat(c.paddingOffset),f.wrap('<div class="floatlabel-wrapper" style="position:relative"></div>'),f.before('<label for="'+h+'" class="label-floatlabel '+c.labelClass+" "+k+'">'+j+"</label>"),this.$label=f.prev("label"),this.$label.css({position:"absolute",top:c.labelStartTop,left:f.css("padding-left"),display:"none","-moz-opacity":"0","-khtml-opacity":"0","-webkit-opacity":"0",opacity:"0"}),c.slideInput||f.css({"padding-top":this.inputPaddingTop}),f.on("keyup blur change",function(b){a.checkValue(b)}),b.setTimeout(function(){a.$label.css(g),a.$element.css(g)},100),this.checkValue()}},checkValue:function(a){if(a){var b=a.keyCode||a.which;if(9===b)return}var c=this.$element,d=c.data("flout");""!==c.val()&&c.data("flout","1"),""===c.val()&&c.data("flout","0"),"1"===c.data("flout")&&"1"!==d&&this.showLabel(),"0"===c.data("flout")&&"0"!==d&&this.hideLabel()},showLabel:function(){var a=this;a.$label.css({display:"block"}),b.setTimeout(function(){a.$label.css({top:a.settings.labelEndTop,"-moz-opacity":"1","-khtml-opacity":"1","-webkit-opacity":"1",opacity:"1"}),a.settings.slideInput&&a.$element.css({"padding-top":a.inputPaddingTop}),a.$element.addClass("active-floatlabel")},50)},hideLabel:function(){var a=this;a.$label.css({top:a.settings.labelStartTop,"-moz-opacity":"0","-khtml-opacity":"0","-webkit-opacity":"0",opacity:"0"}),a.settings.slideInput&&a.$element.css({"padding-top":parseFloat(a.inputPaddingTop)-parseFloat(this.settings.paddingOffset)}),a.$element.removeClass("active-floatlabel"),b.setTimeout(function(){a.$label.css({display:"none"})},1e3*a.settings.transitionDuration)}},a.fn[e]=function(b){return this.each(function(){a.data(this,"plugin_"+e)||a.data(this,"plugin_"+e,new g(this,b))})}}(jQuery,window,document);


$(document).ready(function(){
    $('.form-control').floatlabel({
        labelClass: 'float-label',
        labelEndTop: 5
    });
});

</script>
<body>


	<!-- ---------------------------------상단 고정 메뉴바--------------------------------------------->
	<h1 class="seperator"></h1>
	<nav id="top_navcolor"
		class="navbar fixed-top navbar navbar-expand-xl navbar-dark">
		<!-- fixed-top 상단고정-->
		<div class="container">
			<!-- 브랜드 로고 삽입-->
			<a href="jjam_3_form.jsp" class="navbar-brand"> <img id="logo"
				class="" style="width: 60px; height: 60px;"
				src="./resources/image/character.png" alt=""><img
				src="./resources/image/JJCR_white1.png">
			</a>
			<!-- 햄버거 버튼-->
			<button class="navbar-toggler" data-toggle="collapse"
				data-target="#myNav">
				<span class="navbar-toggler-icon"></span>
			</button>
			<!-- 네비게이션 버튼 -->
			<div id="myNav" class="collapse navbar-collapse justify-content-end">
				<ul class="navbar-nav">
					<li class="nav-item"><a href="" class="nav-link">HOME</a></li>
					<li class="nav-item"><a href="" class="nav-link">나눔찾기(메인지도)</a></li>
					<li class="nav-item"><a href="" class="nav-link">검색하기</a></li>
					<li class="nav-item"><a href="" class="nav-link">챗봇</a></li>
					<li class="nav-item"><a href="" class="nav-link">로그인/로그아웃</a>

					</li>
				</ul>
			</div>
		</div>
	</nav>


	<!--------------------------------------본문 ------------------------------------------------------>
	<!-- Page Content -->
	<div class="mypage">
		<div></div>
		<!-- 공백 -->
		<div class="">
			<img width="100%" src="./resources/image/mypage_test1.png" />
		</div>
		<div></div>
		<!-- 공백 -->
		<div></div>
		<!-- 공백 -->
		<!-- ------------------------------------------------------------------------- -->
		<div class=" mypage-columns ">
			<!-- ----------------------------------------------------------------------------------------------- -->
			<!-- ------------------------------------------------------------------------- -->

			
				<div class="mypage-rows ">
					<div style="padding:20px;">
						<img src="./resources/image/3.jpg"
							style="width: 200px; height: 200px; border-radius: 100px;"
							alt="My Image">
						<h1 class="my-4">마이페이지</h1>
					</div>

			
				<!-- ------------------------------------------------------------------------- -->
				<div class="mypage-menu">
					<div><a class="list-group-item" rel="jjam_6_mypage_privacy">개인정보변경</a>
					</div>
					<div><a class="list-group-item" rel="jjam_6_mypage_letter">댓글 및 쪽지</a>
					</div>
					<div><a class="list-group-item" rel="jjam_6_mypage_jjim">찜목록</a>
					</div>
					<div><a class="list-group-item" rel="jjam_6_mypage_payment">결제내역</a>
					</div>

				</div>
			</div>
				<!-- ------------------------------------------------------------------------- -->
	
			<!-- ------------------------------------------------------------------------- -->
			<div class="">
			<div id="ddd"></div>
			</div>
			
		</div>

	</div>
	<!-- Footer -->
	
	<footer class="py-5 bg-dark footer">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Your
				Website 2019</p>
		</div>

	</footer>


	<!----------------------------------쪽지 modal 창----------------------------------------->

	<div class="modal" tabindex="-1" id="comment">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header"
					style="display: grid; grid-template-columns: 30% 40% 30%;">
					<div></div>
					<div class="modal-title" style="text-align: center">
						<img src="./resources/image/letter.png" width="100px">
					</div>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<div class="modal-body">
					<p>양파좀 네고해주세요</p>
					<p class="text-secondary">
						<small>님 양파 네고좀</small>
					</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">닫기</button>
					<button type="button" class="btn btn-primary">확인</button>
				</div>
			</div>
		</div>
	</div>




	<!-- /.container -->



	<!-- <div class="footer fixed-bottom">copylight</div> -->

	<!-- Bootstrap core JavaScript -->
	<script src="./resources/image/vendor/jquery/jquery.min.js"></script>
	<script
		src="./resources/image/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>