<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ page import="java.util.*" %>
    <%@ page import="com.java.jjam.domain.PaymentListVO"%>

<meta charset="UTF-8">
<script>
$(function(){
 $(".jjim").each(function(){
	 $(this).click(function(){
		 $.ajax({
			 type:"POST",
			 url:"jjam_3_participate.do",
			 data:
				 {
					"b_no" : $(this).find("#b_no").text(),
					"b_title" : $(this).find(".b_title").text(),
					"c_id" : $(this).find("#c_id").text(),
					"b_content" : $(this).find("#b_content").text(),
					"b_location" : $(this).find("#b_location").text(),
					"b_date" : $(this).find("#b_date").text(),
					"cate_icon": $(this).find("#cate_icon").text(),
					"b_price" : $(this).find("#b_price").text(),
					"b_name":$(this).find("#b_name").text(),
					"cate_name" :$(this).find("#cate_name").text()
				 },
				 success: function(data){
						$("#jjoin").html(data);
						$("#join").modal();
				 }, error:function(){
					 alert("에러");
				 }
		 });
	 })
 });
});
 
 
</script>

<% List<PaymentListVO> list = (List<PaymentListVO>)request.getAttribute("data");%>
 <div>

          <h2 style="color:black;">찜목록</h2>
        <div class="row">
        <%for(int i=0; i<list.size(); i++){ %>
        <div class="col-lg-4 col-md-12 jjim">
          <div class="card h-100">
            <a style="border:1px solid #e8e8e8;"><img class="card-img-top" src="<%=list.get(i).getCate_icon()%>.png" alt=""></a>
            <div class="card-body">
              <h4 class="card-title">
                <span class="b_title"><%=list.get(i).getB_title()%></span>
              </h4 >
              <h5 style="color:black;">나눔가격 : <span id="b_price"><%=list.get(i).getB_price()%></span>원</h5>
              <p class="card-text" style="color:black;"><span id="b_content"><%=list.get(i).getB_content()%></span></br>판매자id : <span id="c_id"><%=list.get(i).getPc_id()%></span></br> 찜신청자id : <%=list.get(i).getBc_id()%></p>
            </div>
            <span id="b_no" style="display:none;"><%=list.get(i).getB_no()%></span><span id="b_location" style="display:none;"><%=list.get(i).getB_location()%></span><span id="cate_icon" style="display:none;"><%=list.get(i).getCate_icon()%></span><span id="b_name" style="display:none;"><%=list.get(i).getB_name()%></span><span id="cate_name" style="display:none;"><%=list.get(i).getCate_name() %></span><span id="b_date" style="display:none;"><%=list.get(i).getB_date() %></span>
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