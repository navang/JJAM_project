/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.20
 * Generated at: 2019-07-22 06:20:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jjam_005f6_005fmypage_005fprivacy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".form-width {\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\twidth: 200%;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-width:focus, .form-width:hover {\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( max-width :640px) {\r\n");
      out.write("\t.form-width {\r\n");
      out.write("\t\tborder: none;\r\n");
      out.write("\t\tbackground-color: white;\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\tfont-size: 18px;\r\n");
      out.write("\t\tborder-radius: 5px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.form-width:focus, .form-width:hover {\r\n");
      out.write("\t\tborder: none;\r\n");
      out.write("\t\toutline: none;\r\n");
      out.write("\t\tbackground-color: white;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container w-100\">\r\n");
      out.write("\t\t<form class=\"well form-horizontal\" action=\"updatePrivacy.do\" method=\"post\"\r\n");
      out.write("\t\t\tid=\"contact_form\">\r\n");
      out.write("\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t<!-- Form Name -->\r\n");
      out.write("\t\t\t\t<legend>개인정보변경</legend>\r\n");
      out.write("\t\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-md-4 control-label\">ID</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></i></span> <input name=\"c_id\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-width\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(session.getAttribute("userName"));
      out.write("\" readonly>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-md-4 control-label\">기존 Password</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></i></span> <input \r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"기존 패스워드 입력\" class=\"form-width\" type=\"password\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-md-4 control-label\">새로운 Password</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></i></span> <input\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"변경할 패스워드 입력\" class=\"form-width\" type=\"password\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-md-4 control-label\">새로운 Password</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></i></span> <input name=\"c_pw\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"변경할 패스워드 다시 입력\" class=\"form-width\" type=\"password\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-md-4 control-label\">이름</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-envelope\"></i></span> <input name=\"c_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"이름 입력\" class=\"form-width\" type=\"text\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-md-4 control-label\">전화번호</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-earphone\"></i></span> <input name=\"c_tel\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"(845)555-1212\" class=\"form-width\" type=\"text\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 주소-->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-md-4 control-label\">주소</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 inputGroupContainer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-earphone\"></i></span> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"sample4_postcode\" placeholder=\"우편번호\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"sample4_execDaumPostcode()\" value=\"우편번호 찾기\"><br>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"sample4_roadAddress\" placeholder=\"도로명주소\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"sample4_jibunAddress\" placeholder=\"지번주소\">\r\n");
      out.write("\t\t\t\t\t<span id=\"guide\" style=\"color:#999;display:none\"></span>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"sample4_detailAddress\" placeholder=\"상세주소\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"sample4_extraAddress\" placeholder=\"참고항목\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- Success message -->\r\n");
      out.write("\t\t\t\t<div class=\"alert alert-success\" role=\"alert\" id=\"success_message\">\r\n");
      out.write("\t\t\t\t\tSuccess <i class=\"glyphicon glyphicon-thumbs-up\"></i> Thanks for\r\n");
      out.write("\t\t\t\t\tcontacting us, we will get back to you shortly.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Button -->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-md-4 control-label\"></label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-warning\">\r\n");
      out.write("\t\t\t\t\t\t\tSend <span class=\"glyphicon glyphicon-send\"></span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</fieldset>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.container -->\r\n");
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
