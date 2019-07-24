<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<style>
</style>
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
   
   
    <link rel="stylesheet" href="./resources/style/main.css">

    <link rel="stylesheet" href="./resources/style/index.css">

    <script src="https://kit.fontawesome.com/825d367943.js"></script>

</head>
<% String cntB =(String)request.getAttribute("cntB"); %>
<% String cntC =(String)request.getAttribute("cntC"); %>

<body>
<!--  상단 햄버거  -->
<label>
    <img id="logo" style="width: 60px; height: 60px; position:fixed;" src="./resources/image/character.png" alt=""><img style="margin-left: 60px; position:fixed;" src="./resources/image/JJCR_white1.png">
</label>

    <label>
        <input type="checkbox"></input>
        <span class="menu">
          <span class="hamburger"></span>
        </span>
        <ul>
          <li>
            <a href="#">Home</a>
          </li>
          <li>
            <a href="#">About</a>
          </li>
          <li>
            <a href="#">Work</a>
          </li>
          <li>
            <a href="customerLogin.do">Login</a>
          </li>
        </ul>
      </label>
   
      
    <!--------------------------------------------------------------->

<div class="intro_form"> <!--전체화면 분할-->
    <div class=""></div> <!-- 상단 navbar로 인한 공백-->

    <div class=""><!-- carousel 칸-->
            <div class="carousel slide " id="myCarousel" data-ride="carousel">
                    <div class="carousel-inner">
                            <!-- ---------------------- -->
                            <div class="carousel-item active" >
                                  <img class=""  src="./resources/image/hidden.png" alt="">                              
                                <div  class="carousel-caption">                                        
                               			    <h2 class="bigfont">${cntB } </h2>
                                            <h2>나눔되는 게시물 수</h2>
                                </div>
                            </div>
                            <!-- ---------------------- -->
                            <div class="carousel-item">
                                    <img class=""src="./resources/image/hidden.png" alt="">
                                    <div class="carousel-caption">                                                                      
                                            <h2 class="bigfont">${cntC }</h2>
                                            <h2>나눔에 참여한 회원 수</h2>
                                    </div>
                                </div>
                                 <div class="carousel-item w">     
                                        <img class=""  src="./resources/image/hidden.png" alt="">
                                <div class="carousel-caption">
                                           <h2 class="bigfont">1000</h2>
                                           <h2>옴슑슑</h2>
                                </div>
                            </div>        
                        </div>
                    <!-- 좌우 버튼 -->
               
                    <ul class="carousel-indicators">
                            <li class="active" data-target="#myCarousel" data-slide-to="0"></li>
                            <li data-target="#myCarousel" data-slide-to="1"></li>
                            <li data-target="#myCarousel" data-slide-to="2"></li>
                        </ul>
                 </div>
    </div>
  

 <div class="">
  
         <div class="blue">
         <h3>남은 식재료를 이웃에게 나눠주세요</h3>
             <p>짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기</p>
  
         </div>
</div>
<div >

        <div class="intro-main" > 
             <h1>짬처리는식재료 공유 플랫폼입니다</h1>
         </div>
        
   			
       <button class="btn btn-primary" type="button">지금 바로 시작하세요 </button><!--다음페이지 링크 버튼-->
  
  
  
   </div>
   
  
    </div>
  
   <div class="footer">copylight</div>

</body>


</html>