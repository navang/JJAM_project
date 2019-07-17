<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <div class="form-list" style=" text-align: center">
                   <div></div> <div><img class="w-100" src="./resources/image/category_icon/fruit_icon.png" alt=""></div><div></div><div class="btn-light" style="border-radius: 50px; margin:  3px;">
                    <a href="" data-toggle="modal"  data-target="#join">참여하기</a></div>


          <!------------------------------------------------------------------------------->
                   <div></div> <div><img class="w-100" src="./resources/image/category_icon/fruit_icon.png"  alt=""></div><div></div><div class="btn-light" style="border-radius: 50px; margin:  3px;">
                    <a href="" data-toggle="modal" data-target="#join">${data[0].c_id}</a></div>
                   
                   <div></div> <div><img class="w-100" src="./resources/image/category_icon/fruit_icon.png"  alt=""></div><div></div><div class="btn-light" style="border-radius: 50px; margin:  3px;">
                    <a href="" data-toggle="modal" data-target="#join">참여하기</a></div>
</div>
                

</body>
</html>