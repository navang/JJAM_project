<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	var message = '${ErrorMessage}';
	var url = '${URL}';
	
	alert(message);
	window.location.href=url;

</script>

<body>

</body>
</html>