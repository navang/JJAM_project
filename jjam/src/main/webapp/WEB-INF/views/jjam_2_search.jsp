<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    <!-- https://getbootstrap.com/docs/4.3/getting-started/introduction/ 부트스트랩에서 가져옴-->
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <link rel="stylesheet" href="./resources/style/main.css">

    <script src="https://kit.fontawesome.com/825d367943.js"></script>
    
<title>Insert title here</title>
</head>
<script>
$(function(){
	// 이미지 클릭 이벤트 
  	$("input:image").each(function(){	
		$(this).click(function(){
		var idval= $(this).attr('id');
		$.ajax({
			type:"POST",
			url:"boardByCate.do",
 			data:{ "cate_ename" :idval },

			success: function(data){
				alert("연결성공");
				$(".dong").html(data);
			},
			error:function(err){
				alert("연결실패");
			}
		});
	
		// 클릭한 이미지에 'selectImg' 추가 
				$(this).toggleClass('selectImg');
		
			if($(this).hasClass('selectImg')){
				// JSON LIST파싱
// 				var jsonList = JSON.parse('${jsonListCate}');
// 				for(var i=0; i<jsonListCate.length; i++){		
// 					$('.card-columns').append("<div class='card w-100 "
// 							+jsonListCate[i].cate_ename+"'><img src="
// 							+"'"+jsonListCate[i].cate_icon+".png' alt='' class='card-img-top'><div class='card-body'><h4 class='card-title'>"
// 							+jsonListCate[i].c_id+"님의 나눔</h4><div>"
// 							+jsonListCate[i].b_name+"/"
// 							+jsonListCate[i].b_price+"원/"
// 							+jsonListCate[i].b_date+"/"
// 							+jsonListCate[i].b_location+"/ "						
// 							+"<input type='button' class='btn btn-success btn-sm' value='"
// 							+"참여하기"
// 							+"'></div></div></div>");
// 						}
					//최초 클릭
			$('.selectImg').css({"background":"white","border-radius":"0px"});
			}else{
			//클릭된 상태
			$(this).removeAttr('style');
			$('div[class*="'+idval+'"]').remove();// 매퍼 변경 후 속성값을 jsonList[i].cate_ename 로 해주자 
		}
	});
	});
});
</script>
<body>

 <!-- ---------------------------------상단 고정 메뉴바--------------------------------------------->
      <h1 class="seperator"></h1>
      <nav id="top_navcolor" class="navbar fixed-top navbar navbar-expand-xl navbar-dark">
          <!-- fixed-top 상단고정-->
          <div class="container">
              <!-- 브랜드 로고 삽입-->
              <a href="JJAM_3_form.html" class="navbar-brand">
                  <img id="logo" class="" style="width: 60px; height: 60px;" src="./resources/image/character.png" alt=""><img src="./resources/image/JJCR_white1.png">
              </a>
              <!-- 햄버거 버튼-->
              <button class="navbar-toggler" data-toggle="collapse" data-target="#myNav">
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
  
  

<!------------------------------------------------------------------------->

<div class="search"> <!--전체화면 분할-->
    <div class=""></div> <!-- 상단 navbar로 인한 공백-->
    <div class=""></div> <!-- 상단 navbar로 인한 공백-->
    <div class=""></div> <!-- 상단 navbar로 인한 공백-->
    
    <div></div><!-- 그리드 왼쪽 공백-->
    <div>
   
      <div id="grid"> 
      <!--  음식 카테고리 9개는 반복문으로 만듦  -->
      <% String ename[] = {"bread", "fruit", "ingredients", "meat", "nangdong", "seafood", "spam", "spice", "vege" }; %>     
      <% for(int i=0; i<9; i++) {%>
        <div style="padding: 10px;"><input type="image" name="cate_ename" 
          id="<%=ename[i]%>" 
          value="<%=ename[i]%>" 
        src="./resources/image/category_icon/<%=ename[i]%>_icon.png" /></div>
      <%}%>
           <!--  최근순, 근처, 인기순  -->   
             <div style="padding: 10px;"><input type="image"  src="./resources/image/category_icon/recent_icon.png"/></div>
             <div style="padding: 10px;"><input type="image"  src="./resources/image/category_icon/nearby_icon.png"/></div>
             <div style="padding: 10px;"><input type="image"  src="./resources/image/category_icon/hottem_icon.png"/></div>
          </div>
                
    </div>
    <div></div>    <!-- 그리드 오른쪽공백-->  
     <!-- 그리드 아래 공백-->  
    <div class=""></div>    
    <div></div>
    <div class=""></div>   
 <!-------------검색창-------------->   
    <div class=""></div>    
    <div>  
        <form action="/search/search" method="GET">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="검색어를 입력하세요">
            <div class="input-group-append">
                <button class="btn btn-primary input-group-text" type="submit">
                    <i class="fas fa-search"></i>
                </button>
            </div>
        </div>
    </form></div>
    <div class=""></div>  
       <!-- 검색창 아래 공백-->  
       <div class=""></div>    
       <div></div>
       <div class=""></div> 
 <!-------------게시글-------------->   
 <div class=""></div>    
 <div class="container">
        <!-- 동적으로 게시물을 받아와야함-->
        <div class="card-columns text-center dong">
             <!-- 카드 1세트-->
             
        <!-------------- -->
        
        
       </div>
            
        <!-- 게시글 끝 페이지 다운-->
         
        </div>

 <div class=""></div> 
 <div class=""></div> 
 <div class=""></div> 
 <div class=""></div> 


</div>
<!--------------------------------------------------------------------------->
<div class="footer fixed-bottom">copylight</div>






</body>
</html>