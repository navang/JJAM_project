<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div id="frogue-container" class="position-right-bottom" data-chatbot="00b6f39a-b84c-48d4-9037-e20bfac8625a" data-user="사용자ID" data-init-key="value"></div>

        <script>
        (function(d, s, id){
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) {return;}
            js = d.createElement(s); js.id = id;
            js.src = "https:\/\/danbee.ai/js/plugins/frogue-embed/frogue-embed.min.js";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'frogue-embed'));
        </script> 

</body>
</html>