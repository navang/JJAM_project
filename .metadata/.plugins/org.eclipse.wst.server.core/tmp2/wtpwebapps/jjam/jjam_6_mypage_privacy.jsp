<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<form action="" class="tab" id="tab1">
  <div class="container">
      <div class="row">
          <div class="col-md-8  justify-content-center">
             <h3>개인정보 변경</h3>
              <div class="form-group">
           <!-- 입력 요소(input,label)를 묶는 그룹-->
              <label for="user" class="margin_top">아이디</label>
              <input class="form-control" id="user" type="text" value="godgod" disabled>
              <div class="form-group">
                  <!-- 입력 요소(input,label)를 묶는 그룹-->
                <label for="pw" class="margin_top1">기존 비밀번호</label>
                 <!--라벨-->
               <input class="form-control" id="pw" type="password" placeholder="기존 비밀번호를 입력하세요">

              <label for="pw" class="margin_top1">새로운 비밀번호</label>
                 <!--라벨-->
               <input class="form-control" id="npw" type="password" placeholder="새로운 비밀번호를 입력하세요">
                <!--라벨-->
                <input class="form-control margin_top1" id="npw" type="password" placeholder="새로운 비밀번호를 다시 입력하세요">
             
              
              <!-- 주소-->
              <label for="pw"class="margin_top1">주소</label><br/>
              <input type="text" id="sample6_postcode" placeholder="우편번호">
              <input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
              <input type="text" id="sample6_address" placeholder="주소"><br>
              <input type="text" id="sample6_detailAddress" placeholder="상세주소">
              <input type="text" id="sample6_extraAddress" placeholder="참고항목">
              </div>
              </div>
       </div>       
      </div>
  
  
          <button class="btn btn-primary float-right">
              <!--flate-rigth 오른쪽으로 이동-->
              <i class="fas fa-paper-plane"> 정보변경</i>
              <!--fontawesome icon-->
          </button>
  </div>
      </form>
</body>
</html>