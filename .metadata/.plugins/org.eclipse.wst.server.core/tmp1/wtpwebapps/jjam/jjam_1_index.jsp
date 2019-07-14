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
   
   
    <link rel="stylesheet" href="./resources/style/main.css">

    <script src="https://kit.fontawesome.com/825d367943.js"></script>
<title>index</title>
</head>
<body>

<!-- ---------------------------------상단 고정 메뉴바--------------------------------------------->
    <h1 class="seperator"></h1>
    <nav id="top_navcolor" class="navbar fixed-top navbar navbar-expand-xl navbar-dark">
        <!-- fixed-top 상단고정-->
        <div class="container">
            <!-- 브랜드 로고 삽입-->
            <a href="jjam_3_form.jsp" class="navbar-brand">
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


    <!--------------------------------------------------------------->

<div class="row"> <!--전체화면 분할-->
    <div class=""></div> <!-- 상단 navbar로 인한 공백-->
    <div class=""><!-- carousel 칸-->
            <div class="carousel slide " id="myCarousel" data-ride="carousel">
                    <div class="carousel-inner">
                           
                            <div class="carousel-item active " style="width: 100%">
                                    <img class=""  src="./resources/image/hidden.png" alt="">                              
                                <div  class="carousel-caption">                                        
                                        <h1 class="bigfont">23,487</h1>                              
                                        <h1 style="font-size: 100%">현재 거래되는 게시물 수</h1>              
                                </div>
                            </div>
                            <div class="carousel-item">
                                    <img class=""src="./resources/image/hidden.png" alt="">
                                    <div class="carousel-caption">                                                                      
                                            <h1 class="bigfont">1,000</h1>
                                            <h1 style="font-size: 100%">절약한 음식물쓰레기 비용</h1>
                                    </div>
                                </div>
                                 <div class="carousel-item w">     
                                        <img class=""  src="./resources/image/hidden.png" alt="">
                                <div class="carousel-caption">
                                        <h1 class="bigfont">디비값</h1>
                                       
                                        <h1 style="font-size: 100%">설명</h1>
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
  
    <!-- ----------------------------- 본문 ------------------------------------------------>
<div >
        <div class="wrapper"> 
        <div class=""></div>
        <div class=""></div>
        <div class=""></div>            
                <div class=""></div>
             <div><h1>짬처리는식재료 공유 플랫폼입니다</h1></div>
             <div></div>
             <div></div>
             <div class=""></div>
             <div class=""></div>
             <div class=""></div>
             <div class=""><h3>남은 식재료를 이웃에게 나눠주세요</h3></div>
             <div class=""></div>
             <div class=""></div>
             <div class=""></div>
             <div class=""></div>
             <div class=""></div>
             <div class=""><p>짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기짬처리소개하기</p></div>
             <div class=""></div>
             <div class=""></div>
             <div class=""></div>
             <div class=""></div>
             <div class=""></div> 
             <button class="btn btn-primary" type="button">지금 바로 시작하세요 </button><!--다음페이지 링크 버튼-->
             <div class=""></div>
        
              
            </div>
          
            <div class="footer">copylight</div>
            
   </div>
   <!------------------------------------------------------------------------------>
  
  </div>



</body>
</html>