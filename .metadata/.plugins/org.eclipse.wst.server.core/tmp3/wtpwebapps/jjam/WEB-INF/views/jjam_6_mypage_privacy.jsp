<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>

<style>
.form-width {
	border: none;
	background-color: white;
	width: 200%;
	font-size: 20px;
	border-radius: 5px;
}

.form-width:focus, .form-width:hover {
	border: none;
	outline: none;
	background-color: white;
}

@media ( max-width :640px) {
	.form-width {
		border: none;
		background-color: white;
		width: 100%;
		font-size: 18px;
		border-radius: 5px;
	}
	.form-width:focus, .form-width:hover {
		border: none;
		outline: none;
		background-color: white;
	}
}
</style>
</head>
<body>




</head>
<body>

	<div class="container w-100">
		<form class="well form-horizontal" action="updatePrivacy.do" method="post"
			id="contact_form">
			<fieldset>
				<!-- Form Name -->
				<legend>개인정보변경</legend>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">ID</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input name="c_id"
								class="form-width" type="text"
								value="<%=session.getAttribute("userName")%>" readonly>
						</div>
					</div>
				</div>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">기존 Password</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input 
								placeholder="기존 패스워드 입력" class="form-width" type="password">
						</div>
					</div>
				</div>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">새로운 Password</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input
								placeholder="변경할 패스워드 입력" class="form-width" type="password">
						</div>
					</div>
				</div>
								<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">새로운 Password</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input name="c_pw"
								placeholder="변경할 패스워드 다시 입력" class="form-width" type="password">
						</div>
					</div>
				</div>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">이름</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-envelope"></i></span> <input name="c_name"
								placeholder="이름 입력" class="form-width" type="text">
						</div>
					</div>
				</div>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">전화번호</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-earphone"></i></span> <input name="c_tel"
								placeholder="(845)555-1212" class="form-width" type="text">
						</div>
					</div>
				</div>


				<!-- 주소-->
				<div class="form-group">
					<label class="col-md-4 control-label">주소</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span> 
					<input type="text" id="sample4_postcode" placeholder="우편번호">
					<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
					<input type="text" id="sample4_roadAddress" placeholder="도로명주소">
					<input type="text" id="sample4_jibunAddress" placeholder="지번주소">
					<span id="guide" style="color:#999;display:none"></span>
					<input type="text" id="sample4_detailAddress" placeholder="상세주소">
					<input type="text" id="sample4_extraAddress" placeholder="참고항목">
					</div>
				</div>
				</div>
				
				
				<!-- Success message -->
				<div class="alert alert-success" role="alert" id="success_message">
					Success <i class="glyphicon glyphicon-thumbs-up"></i> Thanks for
					contacting us, we will get back to you shortly.
				</div>
				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label"></label>
					<div class="col-md-4">
						<button type="submit" class="btn btn-warning">
							Send <span class="glyphicon glyphicon-send"></span>
						</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
	<!-- /.container -->



</body>
</html>