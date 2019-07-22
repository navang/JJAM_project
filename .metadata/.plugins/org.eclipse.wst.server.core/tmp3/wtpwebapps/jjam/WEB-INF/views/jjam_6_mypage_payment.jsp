<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ page import="java.util.*" %>
    <%@ page import="com.java.jjam.domain.PaymentListVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<PaymentListVO> list = (List<PaymentListVO>)request.getAttribute("data");%>
 <div>

          <h2 style="color:black;">결제내역</h2>
        <div class="row">
        <%for(int i=0; i<list.size(); i++){ %>
        <div class="col-lg-4 col-md-12">
          <div class="card h-100">
            <a style="border:1px solid #e8e8e8;"><img class="card-img-top" src="<%=list.get(i).getCate_icon()%>.png" alt=""></a>
            <div class="card-body">
              <h4 class="card-title">
                <a href=""><%=list.get(i).getB_title()%></a>
              </h4 >
              <h5 style="color:black;">나눔가격 : <%=list.get(i).getB_price()%>원</h5>
              <p class="card-text" style="color:black;"><%=list.get(i).getB_content()%></br>판매자id : <%=list.get(i).getPc_id()%></br> 구매자id : <%=list.get(i).getBc_id()%></p>
            </div>
            <div class="card-footer">
              <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
            </div>
          </div>
        </div>
	<%} %>
     

      </div>
      <!-- /.row -->

</div>
    <!-- /.tab5 -->


</body>
</html>