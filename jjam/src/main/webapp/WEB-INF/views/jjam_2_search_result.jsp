<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="java.util.*" %>
   <%@ page import="com.java.jjam.domain.BoardByCateVO"%>
   
   <meta charset="UTF-8">

 <body> 
 
 
    
 <script>
	$(".participation3").each(function(){
	 $(this).click(function(){
		 $("#jjoin").empty();
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
			success:function(data){
				$("#jjoin").html(data);
				$("#join").modal('show');
			},error:function(){
				alert("에러");
			}
		});
	 });
});

</script>
  <%List<BoardByCateVO> list = (List<BoardByCateVO>)request.getAttribute("data");%>  
    
    <% for(int i=0; i<list.size(); i++){%>
  <div class="card w-100 <%=list.get(i).getCate_ename()%> participation3">
                <img src="<%=list.get(i).getCate_icon()%>.png" alt="" class="card-img-top">
                <div class="card-body">
                    <h4 class="card-title"><span class="b_title"><%=list.get(i).getB_title()%></span></h4>
                 <div><span id="c_id"><%=list.get(i).getC_id()%></span> 
                  / <span id="b_content"><%=list.get(i).getB_content()%></span>
                  / <span id="b_ea"><%=list.get(i).getB_ea()%></span>
                  / <span id="b_date"><%=list.get(i).getB_date() %></span>
                  / <span id="b_name"><%=list.get(i).getB_name()%></span>
                  / <span id="b_price"><%=list.get(i).getB_price()%></span>원
                  <span id="b_no" style="display:none;"><%=list.get(i).getB_no()%></span>
                  /<span id="b_location"><%=list.get(i).getB_location()%></span>
                  <span id="cate_icon" style="display:none;"><%=list.get(i).getCate_icon()%></span>
                  <span id="cate_name" style="display:none;"><%=list.get(i).getCate_name()%></span>
            
                  <input type="button" class="btn btn-success btn-sm" value="참여하기"></div>
             
                </div>
            </div>         
	<%} %>

</body>