/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.20
 * Generated at: 2019-07-18 08:29:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- https://getbootstrap.com/docs/4.3/getting-started/introduction/ 부트스트랩에서 가져옴-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resources/style/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resources/style/login.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/825d367943.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$('label[for=\"signin\"]').click(function() {\r\n");
      out.write("\t\t\t$('div form').attr('action', 'Login.do');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('label[for=\"signup\"]').click(function() {\r\n");
      out.write("\t\t\t$('div form').attr('action', 'insertCustomer.do');\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//입력폼에 마우스 올리면 변화, 빼면 되돌아가기       \t\r\n");
      out.write("\t\t$('div form').hover(\r\n");
      out.write("\t\t//handlerIn\r\n");
      out.write("\t\tfunction() {\r\n");
      out.write("\t\t\t$('body').css({\r\n");
      out.write("\t\t\t\t\"background\" : '#37415a',\r\n");
      out.write("\t\t\t\t\"transition\" : 'all 0.65s ease-in-out'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t//     //$('body').css({ \"background\":'linear-gradient(135deg, #033f3b 0%, #8310b1b7 100%)', \"transition\":'all 5s ease-in-out'});\r\n");
      out.write("\t\t\t// 로고 갸우뚱\r\n");
      out.write("\t\t\t$('#logo').css({\r\n");
      out.write("\t\t\t\t\"transform\" : 'rotate(90deg)',\r\n");
      out.write("\t\t\t\t\"transition\" : 'all 1s ease-in-out'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// handlerOut\r\n");
      out.write("\t\tfunction() {\r\n");
      out.write("\t\t\t$('#logo').css({\r\n");
      out.write("\t\t\t\t\"transform\" : 'rotate(0deg)',\r\n");
      out.write("\t\t\t\t\"transition\" : 'all 1s ease-in-out'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('body').css({\r\n");
      out.write("\t\t\t\t\"background\" : '#033f3b',\r\n");
      out.write("\t\t\t\t\"transition\" : 'all 0.65s ease-in-out'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<body>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--------------------------------------본문 ------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"login\">\r\n");
      out.write("\t\t<!--전체화면 분할-->\r\n");
      out.write("\t\t<div class=\"\"></div>\r\n");
      out.write("\t\t<!-- 상단 navbar로 인한 공백-->\r\n");
      out.write("\t\t<div class=\"\"></div>\r\n");
      out.write("\t\t<!-- 상단 navbar로 인한 공백-->\r\n");
      out.write("\t\t<div class=\"\"></div>\r\n");
      out.write("\t\t<!-- 상단 navbar로 인한 공백-->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"\"></div>\r\n");
      out.write("\t\t<!-- 공백-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<form name=\"frm\" method=\"post\" action=\"Login.do\">\r\n");
      out.write("\t\t\t<input checked=\"true\" id=\"signin\" name=\"action\" type=\"radio\"\r\n");
      out.write("\t\t\t\tvalue=\"signin\"></input> <label for=\"signin\">Sign in</label> <input\r\n");
      out.write("\t\t\t\tid=\"signup\" name=\"action\" type=\"radio\" value=\"signup\"></input> <label\r\n");
      out.write("\t\t\t\tfor=\"signup\">Sign up</label> <input id=\"reset\" name=\"action\"\r\n");
      out.write("\t\t\t\ttype=\"radio\" value=\"reset\"></input> <label for=\"reset\">kakao</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"wrapper\">\r\n");
      out.write("\t\t\t\t<div id=\"arrow\"></div>\r\n");
      out.write("\t\t\t\t<input id=\"c_id\" name=\"c_id\" placeholder=\"Email\" type=\"text\"></input>\r\n");
      out.write("\t\t\t\t<input id=\"c_pw\" name=\"c_pw\" placeholder=\"Password\" type=\"password\"></input>\r\n");
      out.write("\t\t\t\t<input id=\"c_name\" name=\"c_name\" placeholder=\"Name\" type=\"text\"></input>\r\n");
      out.write("\t\t\t\t<input id=\"c_tel\" name=\"c_tel\" placeholder=\"Tel_Number\" type=\"text\"></input>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!---- SUBMIT BUTTON ----->\r\n");
      out.write("\t\t\t<button type=\"submit\">\r\n");
      out.write("\t\t\t\t<span> KAKAO LOGIN<br /> Sign in<br /> Sign up\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 상단 navbar로 인한 공백-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div></div>\r\n");
      out.write("\t<!-- 그리드 왼쪽 공백-->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
