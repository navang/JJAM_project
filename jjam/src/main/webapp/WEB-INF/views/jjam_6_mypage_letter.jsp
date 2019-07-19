<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
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
        
    </div>
    <div class="tab-pane" id="sent-mail">
        
        <div class="container">
             <div class="content-container clearfix">
                 <div class="col-md-12">
                     <h1 class="content-title">Sent Mail</h1>
                     
                     <input type="search" placeholder="Search Mail" class="form-control mail-search" />
                     
                     <ul class="mail-list">
                         <li>
                             <a href="">
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
    <div class="tab-pane" id="draft">
        
        <div class="container">
             <div class="content-container clearfix">
                 <div class="col-md-12">
                     <h1 class="content-title">Draft</h1>
                     
                     <input type="search" placeholder="Search Mail" class="form-control mail-search" />
                     
                     <ul class="mail-list">
                         <li>
                             <a href="">
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
    <div class="tab-pane" id="trash">
        
        <div class="container">
             <div class="content-container clearfix">
                 <div class="col-md-12">
                     <h1 class="content-title">Trash</h1>
                     
                     <input type="search" placeholder="Search Mail" class="form-control mail-search" />
                     
                     <ul class="mail-list">
                         <li>
                             <a href="">
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
  </div>
</div>

</body>
</html>