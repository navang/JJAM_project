<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.java.jjam.domain.ChatVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

<style>
body{margin-top:20px;
background:#eee;
}

/* ========================================================================
 * MESSAGES
 * ======================================================================== */
.message form {
  padding: 6px 15px;
  background-color: #FAFAFA;
  border-bottom: 1px solid #E6EBED;
}
.message form .has-icon .form-control-icon {
  position: absolute;
  z-index: 5;
  top: 0;
  right: 0;
  width: 34px;
  line-height: 33px;
  text-align: center;
  color: #777;
}
.message > a {
  position: relative;
}
.message .indicator {
  text-align: center;
}
.message .indicator .spinner {
  left: 26%;
  width: 200px;
  font-size: 13px;
  line-height: 17px;
  color: #999;
}

.message-wrapper {
  position: relative;
  padding: 0px;
  background-color: #ffffff;
  margin: 0px;
}
.message-wrapper .message-sideleft {
  vertical-align: top !important;
}
.message-wrapper .message-sideleft[class*="col-"] {
  padding-right: 0px;
  padding-left: 0px;
}
.message-wrapper .message-sideright {
  background-color: #f8f8f8;
}
.message-wrapper .message-sideright[class*="col-"] {
/*   padding: 30px; */
}
.message-wrapper .message-sideright .panel {
  border-top: 1px dotted #DDD;
  padding-top: 20px;
}
.message-wrapper .message-sideright .panel:first-child {
  border-top: none;
  padding-top: 0px;
}
.message-wrapper .message-sideright .panel .panel-heading {
  border-bottom: none;
}
.message-wrapper .panel {
  background-color: transparent !important;
  -moz-box-shadow: none !important;
  -webkit-box-shadow: none !important;
  box-shadow: none !important;
}
.message-wrapper .panel .panel-heading, .message-wrapper .panel .panel-body {
  background-color: transparent !important;
}
.message-wrapper .media .media-body {
  font-weight: 300;
}
.message-wrapper .media .media-heading {
  margin-bottom: 0px;
}
.message-wrapper .media small {
  color: #999999;
  font-weight: 400;
}

.list-message .list-group-item {
  padding: 15px;
  color: #999999 !important;
  border-right: 3px solid #8CC152 !important;
}
.list-message .list-group-item.active {
  background-color: #EEEEEE;
  border-bottom: 1px solid #DDD !important;
}
.list-message .list-group-item.active p {
  color: #999999 !important;
}
.list-message .list-group-item.active:hover, .list-message .list-group-item.active:focus, .list-message .list-group-item.active:active {
  background-color: #EEEEEE;
}
.list-message .list-group-item small {
  font-size: 12px;
}
.list-message .list-group-item .list-group-item-heading {
  color: #999999 !important;
}
.list-message .list-group-item .list-group-item-text {
  margin-bottom: 10px;
}
.list-message .list-group-item:last-child {
  -moz-border-radius: 0px;
  -webkit-border-radius: 0px;
  border-radius: 0px;
  border-bottom: 1px solid #DDD !important;
}
.avatar{
    width:50px;
    height:50px;
}


</style>
<title>Insert title here</title>
<% List<ChatVO> list = (List<ChatVO>)request.getAttribute("data");%>
</head>
<body>
<<<<<<< HEAD
<div class="container" style="background-color:white;">
<div class="row message-wrapper rounded shadow mb-20">
<!--     <div class="col-md-4 message"> -->
<!--         <div class="panel"> -->
<!--             <div class="panel-heading"> -->
<!--                 <div class="pull-left"> -->
<!--                     <h3 class="panel-title">Conversations</h3> -->
<!--                 </div> -->
<!--                 <div class="pull-right"> -->
<!--                     <div class="btn-group"> -->
<!--                         <button type="button" class="btn btn-sm btn-success">All Sources</button> -->
<!--                         <button type="button" class="btn btn-sm btn-success dropdown-toggle" data-toggle="dropdown"> -->
<!--                             <span class="caret"></span> -->
<!--                             <span class="sr-only">Toggle Dropdown</span> -->
<!--                         </button> -->
<!--                         <ul class="dropdown-menu pull-right" role="menu"> -->
<!--                             <li><a href="#"><i class="fa fa-download"></i> Inbox</a></li> -->
<!--                             <li><a href="#"><i class="fa fa-upload"></i> Outbox</a></li> -->
<!--                             <li><a href="#"><i class="fa fa-trash-o"></i> Trash</a></li> -->
<!--                             <li class="divider"></li> -->
<!--                             <li><a href="#"><i class="fa fa-briefcase"></i> Other</a></li> -->
<!--                         </ul> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="clearfix"></div> -->
<!--             </div>/.panel-heading -->
<!--             <div class="panel-body no-padding"> -->
<!--                 <div class="list-group no-margin list-message"> -->
<!--                     <a href="#" class="list-group-item"> -->
<!--                         <h4 class="list-group-item-heading">Jeck Joko <small>Yesterday at 15:45</small></h4> -->
<!--                         <p class="list-group-item-text"> -->
<!--                             Ticket #78: <strong>Problems with custom CSS3</strong> -->
<!--                         </p> -->
<!--                         <span class="label label-success pull-right">SOLVED</span> -->
<!--                         <div class="clearfix"></div> -->
<!--                     </a> -->
<!--                     <a href="#" class="list-group-item active"> -->
<!--                         <h4 class="list-group-item-heading">Toni Miring <small>Sunday at 12:33</small></h4> -->
<!--                         <p class="list-group-item-text">Ticket #43: <strong>How do i use something</strong></p> -->
<!--                         <span class="label label-success pull-right rounded">SOLVED</span> -->
<!--                         <div class="clearfix"></div> -->
<!--                     </a> -->
<!--                     <a href="#" class="list-group-item"> -->
<!--                         <h4 class="list-group-item-heading">Bella Negoro <small>Sunday at 12:33</small></h4> -->
<!--                         <p class="list-group-item-text">Ticket #15: <strong>Why doesn't my cheese work properly? :(</strong></p> -->
<!--                         <span class="label label-default pull-right circle">OPEN</span> -->
<!--                         <div class="clearfix"></div> -->
<!--                     </a> -->
<!--                     <a href="#" class="list-group-item"> -->
<!--                         <h4 class="list-group-item-heading">Daddy Botak <small>Sunday at 12:33</small></h4> -->
<!--                         <p class="list-group-item-text">Can i have longer on my free trial please?</p> -->
<!--                     </a> -->
<!--                 </div>/.list-group -->
<!--             </div>/.panel-body -->
<!--         </div> /.panel -->
<!--     </div> /.message-sideleft -->
    <div class="col-md-12 message">
=======

<div>
<<<<<<< HEAD
  <h2 style="color:black;">댓글 및 쪽지</h2>

  <h1>댓글 및 쪽지</h1>

  
<div class="tab-content">
    <div class="tab-pane active" id="inbox">
        <div class="container">
             <div class="content-container clearfix">
                 <div class="col-md-12">     
                     <ul class="mail-list">
                         <li>
                             <a href="" data-toggle="modal" data-target="#comment">
                                 <span class="mail-sender">You Tube</span>
                                 <span class="mail-subject">New subscribers!</span>
                                 <span class="mail-message-preview">You have ten more subscriptions click her...</span>
                             </a>
                         </li>
                         <li>
                             <a href="">
                                 <span class="mail-sender">You Tube</span>
                                 <span class="mail-subject">New subscribers!</span>
                                 <span class="mail-message-preview">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil eveniet ipsum nisi? Eaque odio quae debitis saepe explicabo alias sit tenetur animi...</span>
                             </a>
                         </li>
                         <li>
                             <a href="">
                                 <span class="mail-sender">You Tube</span>
                                 <span class="mail-subject">New subscribers!</span>
                                 <span class="mail-message-preview">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil eveniet ipsum nisi? Eaque odio quae debitis saepe explicabo alias sit tenetur animi...</span>
                             </a>
                         </li>
                         <li>
                             <a href="">
                                 <span class="mail-sender">You Tube</span>
                                 <span class="mail-subject">New subscribers!</span>
                                 <span class="mail-message-preview">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil eveniet ipsum nisi? Eaque odio quae debitis saepe explicabo alias sit tenetur animi...</span>
                             </a>
                         </li>
                         <li>
                             <a href="">
                                 <span class="mail-sender">You Tube</span>
                                 <span class="mail-subject">New subscribers!</span>
                                 <span class="mail-message-preview">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil eveniet ipsum nisi? Eaque odio quae debitis saepe explicabo alias sit tenetur animi...</span>
                             </a>
                         </li>
                     </ul>
                 </div>
             </div>
         </div>
        
    </div>
    <div class="tab-pane" id="compose">
        
        <div class="container">
      <div class="content-container clearfix">
          <h1 class="content-title">Compose</h1>
          <div class="col-md-12">
              <div class="form-group">
                  <input id="tokenfield" type="text" class="form-control" placeholder="To" />
              </div>
              <div class="form-group">
                  <input type="text" class="form-control" placeholder="Cc" />
              </div>
              <div class="form-group">
                  <input type="text" class="form-control" placeholder="Bcc" />
              </div>
              <div class="form-group">
                  <input type="text" class="form-control" placeholder="Subject" />
              </div>
              <textarea class="form-control" placeholder="message"></textarea>
              <div class="btn-send">
              <button class="btn btn-success btn-lg"><span class="glyphicon glyphicon-send"></span> Send</button>
              </div>
          </div>
      </div>
  </div>
>>>>>>> 6e33cf90ee0db050711ae0cc38fe432e36897e02
        
        <%for(int i=0; i<list.size(); i++){ %>
        <div class="panel"> 
            <div class="panel-heading">
                <div class="media">
                        <img src="https://bootdey.com/img/Content/avatar/avatar1.png"  class="img-circle avatar">
                    <div class="media-body">
                        <h4 class="media-heading"><%=list.get(i).getCustomerA() %> <small>(보낸사람)</small></h4>
                        <small><%=list.get(i).getChat_date() %></small>
                    </div>
                </div>
            </div><!-- /.panel-heading -->
            <div class="panel-body">
                <p class="lead" style="color:black;">
                    <%=list.get(i).getChat_title()%>
                </p>
             
                <p style="color:black;">
                    <%=list.get(i).getChat_content()%>
                </p>
                <br>
                <p style="color:black;">
                    Thanks! <br>
                    <%=list.get(i).getBc_id()%>
                </p>
                <hr>
            </div><!-- /.panel-body -->
        </div><!-- /.panel -->
        <%} %>

          
    </div><!-- /.message-sideright -->
</div><!-- /row -->

</div><!--/ container -->


</body>
</html>