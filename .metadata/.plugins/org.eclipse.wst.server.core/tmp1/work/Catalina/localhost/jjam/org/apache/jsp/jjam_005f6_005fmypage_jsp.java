/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.20
 * Generated at: 2019-07-15 00:35:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jjam_005f6_005fmypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>Shop Homepage - Start Bootstrap Template</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resources/style/mypage1.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resources/style/main.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    function sample6_execDaumPostcode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                var addr = ''; // 주소 변수\r\n");
      out.write("                var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                    addr = data.roadAddress;\r\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                    addr = data.jibunAddress;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("                if(data.userSelectedType === 'R'){\r\n");
      out.write("                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                    // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                        extraAddr += data.bname;\r\n");
      out.write("                    }\r\n");
      out.write("                    // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                    if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                    }\r\n");
      out.write("                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                    if(extraAddr !== ''){\r\n");
      out.write("                        extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("                    }\r\n");
      out.write("                    // 조합된 참고항목을 해당 필드에 넣는다.\r\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = extraAddr;\r\n");
      out.write("                \r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = '';\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                document.getElementById('sample6_postcode').value = data.zonecode;\r\n");
      out.write("                document.getElementById(\"sample6_address\").value = addr;\r\n");
      out.write("                // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("                document.getElementById(\"sample6_detailAddress\").focus();\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<!--주소 스크립트 end-->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  $(function(){\r\n");
      out.write("      $('.mypage-menu a').each(function(){\r\n");
      out.write("          $(this).click(function() { \r\n");
      out.write("        \t  $('.mypage-menu a').css(\"background-color\", \"white\");\r\n");
      out.write("        \t  $('.mypage-menu a').css(\"color\", \"black\");\r\n");
      out.write("        \t  $(this).css(\"background-color\", \"#147b6b\");\r\n");
      out.write("        \t  $(this).css(\"color\", \"white\");\r\n");
      out.write("        \t activeTab = $(this).attr(\"rel\");\r\n");
      out.write("        \t $(\"#ddd\").empty();\r\n");
      out.write("          $.ajax({\r\n");
      out.write("        \t  type:'POST',\r\n");
      out.write("        \t  url:'./'+activeTab+'.jsp',\r\n");
      out.write("        \t  success:function(data){\r\n");
      out.write("        \t\t  $('#ddd').html(data);\r\n");
      out.write("        \t  },\r\n");
      out.write("        \t  error:function(){\r\n");
      out.write("        \t\t  alert(\"통신실패\");\r\n");
      out.write("        \t  }\r\n");
      out.write("          });\r\n");
      out.write("          });\r\n");
      out.write("      });\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--이메일-->\r\n");
      out.write("<script>\r\n");
      out.write("/**\r\n");
      out.write(" * FloatLabels\r\n");
      out.write(" * Version: 1.0\r\n");
      out.write(" * URL: http://clubdesign.github.io/floatlabels.js/\r\n");
      out.write(" * Description: \r\n");
      out.write(" * Author: Marcus Pohorely ( http://www.clubdesign.at )\r\n");
      out.write(" * Copyright: Copyright 2013 / 2014 http://www.clubdesign.at\r\n");
      out.write(" */\r\n");
      out.write(" !function(a,b){function g(b,c){this.$element=a(b),this.settings=a.extend({},f,c),this.init()}var e=\"floatlabel\",f={slideInput:!0,labelStartTop:\"20px\",labelEndTop:\"10px\",paddingOffset:\"10px\",transitionDuration:.3,transitionEasing:\"ease-in-out\",labelClass:\"\",typeMatches:/text|password|email|number|search|url/};g.prototype={init:function(){var a=this,c=this.settings,d=c.transitionDuration,e=c.transitionEasing,f=this.$element,g={\"-webkit-transition\":\"all \"+d+\"s \"+e,\"-moz-transition\":\"all \"+d+\"s \"+e,\"-o-transition\":\"all \"+d+\"s \"+e,\"-ms-transition\":\"all \"+d+\"s \"+e,transition:\"all \"+d+\"s \"+e};if(\"INPUT\"===f.prop(\"tagName\").toUpperCase()&&c.typeMatches.test(f.attr(\"type\"))){var h=f.attr(\"id\");h||(h=Math.floor(100*Math.random())+1,f.attr(\"id\",h));var i=f.attr(\"placeholder\"),j=f.data(\"label\"),k=f.data(\"class\");k||(k=\"\"),i&&\"\"!==i||(i=\"You forgot to add placeholder attribute!\"),j&&\"\"!==j||(j=i),this.inputPaddingTop=parseFloat(f.css(\"padding-top\"))+parseFloat(c.paddingOffset),f.wrap('<div class=\"floatlabel-wrapper\" style=\"position:relative\"></div>'),f.before('<label for=\"'+h+'\" class=\"label-floatlabel '+c.labelClass+\" \"+k+'\">'+j+\"</label>\"),this.$label=f.prev(\"label\"),this.$label.css({position:\"absolute\",top:c.labelStartTop,left:f.css(\"padding-left\"),display:\"none\",\"-moz-opacity\":\"0\",\"-khtml-opacity\":\"0\",\"-webkit-opacity\":\"0\",opacity:\"0\"}),c.slideInput||f.css({\"padding-top\":this.inputPaddingTop}),f.on(\"keyup blur change\",function(b){a.checkValue(b)}),b.setTimeout(function(){a.$label.css(g),a.$element.css(g)},100),this.checkValue()}},checkValue:function(a){if(a){var b=a.keyCode||a.which;if(9===b)return}var c=this.$element,d=c.data(\"flout\");\"\"!==c.val()&&c.data(\"flout\",\"1\"),\"\"===c.val()&&c.data(\"flout\",\"0\"),\"1\"===c.data(\"flout\")&&\"1\"!==d&&this.showLabel(),\"0\"===c.data(\"flout\")&&\"0\"!==d&&this.hideLabel()},showLabel:function(){var a=this;a.$label.css({display:\"block\"}),b.setTimeout(function(){a.$label.css({top:a.settings.labelEndTop,\"-moz-opacity\":\"1\",\"-khtml-opacity\":\"1\",\"-webkit-opacity\":\"1\",opacity:\"1\"}),a.settings.slideInput&&a.$element.css({\"padding-top\":a.inputPaddingTop}),a.$element.addClass(\"active-floatlabel\")},50)},hideLabel:function(){var a=this;a.$label.css({top:a.settings.labelStartTop,\"-moz-opacity\":\"0\",\"-khtml-opacity\":\"0\",\"-webkit-opacity\":\"0\",opacity:\"0\"}),a.settings.slideInput&&a.$element.css({\"padding-top\":parseFloat(a.inputPaddingTop)-parseFloat(this.settings.paddingOffset)}),a.$element.removeClass(\"active-floatlabel\"),b.setTimeout(function(){a.$label.css({display:\"none\"})},1e3*a.settings.transitionDuration)}},a.fn[e]=function(b){return this.each(function(){a.data(this,\"plugin_\"+e)||a.data(this,\"plugin_\"+e,new g(this,b))})}}(jQuery,window,document);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    $('.form-control').floatlabel({\r\n");
      out.write("        labelClass: 'float-label',\r\n");
      out.write("        labelEndTop: 5\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- ---------------------------------상단 고정 메뉴바--------------------------------------------->\r\n");
      out.write("\t<h1 class=\"seperator\"></h1>\r\n");
      out.write("\t<nav id=\"top_navcolor\"\r\n");
      out.write("\t\tclass=\"navbar fixed-top navbar navbar-expand-xl navbar-dark\">\r\n");
      out.write("\t\t<!-- fixed-top 상단고정-->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<!-- 브랜드 로고 삽입-->\r\n");
      out.write("\t\t\t<a href=\"jjam_3_form.jsp\" class=\"navbar-brand\"> <img id=\"logo\"\r\n");
      out.write("\t\t\t\tclass=\"\" style=\"width: 60px; height: 60px;\"\r\n");
      out.write("\t\t\t\tsrc=\"./resources/image/character.png\" alt=\"\"><img\r\n");
      out.write("\t\t\t\tsrc=\"./resources/image/JJCR_white1.png\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<!-- 햄버거 버튼-->\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\tdata-target=\"#myNav\">\r\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<!-- 네비게이션 버튼 -->\r\n");
      out.write("\t\t\t<div id=\"myNav\" class=\"collapse navbar-collapse justify-content-end\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"\" class=\"nav-link\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"\" class=\"nav-link\">나눔찾기(메인지도)</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"\" class=\"nav-link\">검색하기</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"\" class=\"nav-link\">챗봇</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"\" class=\"nav-link\">로그인/로그아웃</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--------------------------------------본문 ------------------------------------------------------>\r\n");
      out.write("\t<!-- Page Content -->\r\n");
      out.write("\t<div class=\"mypage\">\r\n");
      out.write("\t\t<div></div>\r\n");
      out.write("\t\t<!-- 공백 -->\r\n");
      out.write("\t\t<div class=\"\">\r\n");
      out.write("\t\t\t<img width=\"100%\" src=\"./resources/image/mypage_03.png\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div></div>\r\n");
      out.write("\t\t<!-- 공백 -->\r\n");
      out.write("\t\t<div></div>\r\n");
      out.write("\t\t<!-- 공백 -->\r\n");
      out.write("\t\t<!-- ------------------------------------------------------------------------- -->\r\n");
      out.write("\t\t<div class=\" mypage-columns \">\r\n");
      out.write("\t\t\t<!-- ----------------------------------------------------------------------------------------------- -->\r\n");
      out.write("\t\t\t<!-- ------------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"mypage-rows \">\r\n");
      out.write("\t\t\t\t\t<div style=\"padding:20px;\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"./resources/image/3.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 200px; height: 200px; border-radius: 100px;\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"My Image\">\r\n");
      out.write("\t\t\t\t\t\t<h1 class=\"my-4\">마이페이지</h1>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<!-- ------------------------------------------------------------------------- -->\r\n");
      out.write("\t\t\t\t<div class=\"mypage-menu\">\r\n");
      out.write("\t\t\t\t\t<div><a class=\"list-group-item\" rel=\"jjam_6_mypage_privacy\">개인정보변경</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div><a class=\"list-group-item\" rel=\"jjam_6_mypage_letter\">댓글 및 쪽지</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div><a class=\"list-group-item\" rel=\"jjam_6_mypage_jjim\">찜목록</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div><a class=\"list-group-item\" rel=\"jjam_6_mypage_payment\">결제내역</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- ------------------------------------------------------------------------- -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<!-- ------------------------------------------------------------------------- -->\r\n");
      out.write("\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t<div id=\"ddd\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Footer -->\r\n");
      out.write("\t\r\n");
      out.write("\t<footer class=\"py-5 bg-dark footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<p class=\"m-0 text-center text-white\">Copyright &copy; Your\r\n");
      out.write("\t\t\t\tWebsite 2019</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!----------------------------------쪽지 modal 창----------------------------------------->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"modal\" tabindex=\"-1\" id=\"comment\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\"\r\n");
      out.write("\t\t\t\t\tstyle=\"display: grid; grid-template-columns: 30% 40% 30%;\">\r\n");
      out.write("\t\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-title\" style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"./resources/image/letter.png\" width=\"100px\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<p>양파좀 네고해주세요</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"text-secondary\">\r\n");
      out.write("\t\t\t\t\t\t<small>님 양파 네고좀</small>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("\t\t\t\t\t\tdata-dismiss=\"modal\">닫기</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">확인</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- <div class=\"footer fixed-bottom\">copylight</div> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap core JavaScript -->\r\n");
      out.write("\t<script src=\"./resources/image/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"./resources/image/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
