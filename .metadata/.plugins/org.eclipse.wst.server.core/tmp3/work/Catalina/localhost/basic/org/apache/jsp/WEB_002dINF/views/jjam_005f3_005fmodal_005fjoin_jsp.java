/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.20
<<<<<<< HEAD
 * Generated at: 2019-07-23 00:42:15 UTC
=======
 * Generated at: 2019-07-23 06:14:00 UTC
>>>>>>> 7f7c7283d27dcf0b9cae4bf84bee2c912e11a8f9
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.java.jjam.domain.BoardAndCateVO;

public final class jjam_005f3_005fmodal_005fjoin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1562201258899L));
    _jspx_dependants.put("jar:file:/C:/Users/navan/Documents/Spring/Jjam_teamproject_ver.2/.metadata/.plugins/org.eclipse.wst.server.core/tmp3/wtpwebapps/jjam/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.java.jjam.domain.BoardAndCateVO");
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

      out.write(" \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- 모달 css -->\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"./resources/style/modalStyle.css\" type=\"text/css\">\r\n");
      out.write("       \r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("    // 버튼 호버 시 이미지 각 아이디값 잘 볼것 \r\n");
      out.write("    $('div #btn1').hover(function(){\r\n");
      out.write("        $('div #btn1 img').attr('src','./resources/image/form/heart1.png'); \r\n");
      out.write("    },function(){ $('div #btn1 img').attr('src','./resources/image/form/heart-before.png')});\r\n");
      out.write("    $('div #btn2').hover(function(){\r\n");
      out.write("        $('div #btn2 img').attr('src','./resources/image/form/arrow1.png');\r\n");
      out.write("    },function(){ $('div #btn2 img').attr('src','./resources/image/form/arrow-before.png')});\r\n");
      out.write("    $('div #btn3').hover(function(){\r\n");
      out.write("        $('div #btn3 img').attr('src','./resources/image/form/paid1.png'); \r\n");
      out.write("    },function(){ $('div #btn3 img').attr('src','./resources/image/form/paid-before.png')});\r\n");
      out.write("    $('div #btn4').hover(function(){\r\n");
      out.write("        $('div #btn4 img').attr('src','./resources/image/form/chat1.png');\r\n");
      out.write("    },function(){ $('div #btn4 img').attr('src','./resources/image/form/chat-before.png')});\r\n");
      out.write("    $('div #btn5').hover(function(){\r\n");
      out.write("        $('div #btn5 img').attr('src','./resources/image/form/cancle1.png');\r\n");
      out.write("    },function(){ $('div #btn5 img').attr('src','./resources/image/form/cancle-before.png')});\r\n");
      out.write("    $('div #btn6').hover(function(){\r\n");
      out.write("        $('div #btn6 img').attr('src','./resources/image/form/progress1.png');\r\n");
      out.write("    },function(){ $('div #btn6 img').attr('src','./resources/image/form/progress-berfore.png')});\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t//참여하기 클릭했을때 결제페이지에 정보 넘기기 \r\n");
      out.write("\t$('#btn3').click(function(){\r\n");
      out.write("\t\t$(\".parti\").empty();\r\n");
      out.write(" \t\tvar c_id = $(\"#c_id2\").val();\r\n");
      out.write(" \t\tvar cate_name = $(\"#cate_name2\").val();\r\n");
      out.write(" \t\tvar b_title = $(\"#b_title2\").val();\r\n");
      out.write(" \t\tvar b_location = $(\"#b_location2\").val();\r\n");
      out.write(" \t\tvar b_date = $(\"#b_date2\").val();\r\n");
      out.write(" \t\tvar b_content = $(\"#b_content2\").val();\r\n");
      out.write(" \t\tvar b_price = $(\"#b_price2\").val();\r\n");
      out.write(" \t\tvar b_no = $(\"#b_no2\").val();\r\n");
      out.write(" \t\tvar bc_id = \"");
      out.print(session.getAttribute("userName"));
      out.write("\";\r\n");
      out.write(" \t\r\n");
      out.write("//  \t\tvar cate_image = $(\"#cate_image\").attr(\"src\");\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\t$(\"#c_id1\").text(c_id);\r\n");
      out.write(" \t\t$(\"#cate_name1\").text(cate_name);\r\n");
      out.write(" \t\t$(\"#b_title1\").text(b_title);\r\n");
      out.write(" \t\t$(\"#b_location1\").text(b_location);\r\n");
      out.write(" \t\t$(\"#b_date1\").text(b_date);\r\n");
      out.write(" \t\t$(\"#b_price1\").text(b_price);\r\n");
      out.write(" \t\t$(\"#b_content1\").text(b_content);\r\n");
      out.write(" \t\t$(\"#b_no1\").text(b_no);\r\n");
      out.write(" \t\t$(\"#bc_id1\").text(bc_id);  //구매자 id값 추후 삭제 안보이게 처리\r\n");
      out.write(" \t\t$(\"#pay\").modal(\"show\");\r\n");
      out.write("\t});\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//////////////////찜하기\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".jjim\").click(function(){\r\n");
      out.write("\t\talert(\"클릭\");\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\turl:\"jjam_3_jjim.do\",\r\n");
      out.write("\t\t\tdata:\r\n");
      out.write("\t\t\t{\"b_no\":$(\"#b_no2\").val(),\r\n");
      out.write("\t\t\t \"c_id\" : $(\"#bc_id1\").text()        \t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess: function(){\r\n");
      out.write("\t\t\t\talert(\"찜 성공\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(){\r\n");
      out.write("\t\t\t\talert(\"찜 실패\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t//결제모달창\r\n");
      out.write("\r\n");
      out.write("\t$(\".pay_button\").click(function(){\r\n");
      out.write("\t\tif($(\".pay_checkbox\").prop(\"checked\")){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\t\turl:\"jjam_3_payment.do\",\r\n");
      out.write("\t\t\t\tdata:\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\"c_id\" : $(\"#bc_id1\").text(),\r\n");
      out.write("\t\t\t\t\"b_no\" : $(\"#b_no1\").text()\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess: function(){\r\n");
      out.write("\t\t\t\t\t$(\"#join\").modal(\"hide\");\r\n");
      out.write("\t\t\t\t\t$(\"#pay\").modal(\"hide\");\r\n");
      out.write("\t\t\t\t\talert(\"결제성공\")\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror:function(){\r\n");
      out.write("\t\t\t\t\talert(\"결제보내기 실패\")\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}else{\r\n");
      out.write("// \t\t\t$(\"#pay_cancel_Modal\").modal(\"show\");\r\n");
      out.write("\t\t\t$(\"#pay_cancel_Modal\").modal(\"show\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write(" \t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
 BoardAndCateVO data = (BoardAndCateVO)request.getAttribute("data"); 
      out.write("\r\n");
<<<<<<< HEAD
      out.write("  \r\n");
      out.write("<!----------------------------------참여 MODAL창----------------------------------------->\r\n");
=======
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <!----------------------------------참여 MODAL창----------------------------------------->\r\n");
>>>>>>> 7f7c7283d27dcf0b9cae4bf84bee2c912e11a8f9
      out.write("    \r\n");
      out.write("                <div id=\"join\" class=\"modal fade \"> \r\n");
      out.write("                     <div class=\"cate-img\">\r\n");
      out.write("                    <img class=\"w-100\" src=\"");
<<<<<<< HEAD
      out.print(data.getCate_icon());
      out.write(".png\" style=\"border: 15px solid white; border-radius:90px;\" ><!-- 품목카테고리 이미지 동적으로 넣어주세요-->\r\n");
=======
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.cate_icon}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(".png\"  ><!-- 품목카테고리 이미지 동적으로 넣어주세요-->\r\n");
>>>>>>> 7f7c7283d27dcf0b9cae4bf84bee2c912e11a8f9
      out.write("                </div>             \r\n");
      out.write("                        \r\n");
      out.write("                    <div class=\" modal-dialog modal-position\"><!-- dialog 지우면 닫기 기능이 안됨-->\r\n");
      out.write("                            <div class=\"modal-content modal-style\"><!-- content 지우면 클릭이안됨-->\r\n");
      out.write("                                <div class=\"modal-header\" style=\"display:none;\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"modal-body\"><!--padding-->\r\n");
<<<<<<< HEAD
      out.write("                                  \r\n");
      out.write("                                            <!-- 모달 내용칸 -->\r\n");
      out.write("                                            <input class=\"input-form\" id=\"c_id2\"       readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.c_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" > <input class=\"input-form\" readonly value=\"님의 나눔\"/>    <input  class=\"input-form\" readonly id=\"b_no2\"        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.b_no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"글번호\">\r\n");
      out.write("                                            <input class=\"input-form\" id=\"b_title2\"    readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.b_title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"제목\">                                      <input  class=\"input-form\" readonly id=\"cate_name2\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.cate_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"품목\">\r\n");
      out.write("                                            <input class=\"input-form\" id=\"b_location2\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.b_location}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"위치\">                                   <input  class=\"input-form\" readonly id=\"b_price2\"     value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.b_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"가격\">\r\n");
      out.write("                                            <input  class=\"input-form\" readonly id=\"b_content2\"   value=\"");
=======
      out.write("                                    <input class=\"input-form\" id=\"input-title\" readonly value=\"나눔참여\"/>\r\n");
      out.write("                                            <!-- 모달 내용칸 -->\r\n");
      out.write("                                             <input readonly class=\"input-form\" id=\"c_id2\"  readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.c_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" >                      \r\n");
      out.write("                                             <input class=\"input-form\" readonly value=\"님의 나눔\"/> \r\n");
      out.write("                                             <input class=\"input-form\" readonly value=\"제목 : \"/>\r\n");
      out.write("                                             <input class=\"input-form\" id=\"b_title2\"    readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.b_title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"제목\">                                            \r\n");
      out.write("                                             <input readonly  class=\"input-form\" readonly id=\"b_no2\"        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.b_no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"글번호\"> \r\n");
      out.write("                                             <input class=\"input-form\" readonly value=\"품목 : \"/>      \r\n");
      out.write("                                             <input  class=\"input-form\" readonly id=\"cate_name2\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.cate_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"품목\">\r\n");
      out.write("                                             <input class=\"input-form\" readonly value=\"가격 : \"/>                                  \r\n");
      out.write("                                             <input  class=\"input-form\" readonly id=\"b_price2\"     value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.b_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"가격\">\r\n");
      out.write("                                             <input class=\"input-form\" readonly value=\"위치 : \"/>     \r\n");
      out.write("                                             <input readonly class=\"input-form\" id=\"b_location2\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.b_location}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"위치\"> \r\n");
      out.write("                                        \r\n");
      out.write("                                             <input readonly  class=\"input-form\" readonly id=\"b_content2\"   value=\"");
>>>>>>> 7f7c7283d27dcf0b9cae4bf84bee2c912e11a8f9
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.b_content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"내용\">                           \r\n");
      out.write("                                            \r\n");
      out.write("                                            <div class=\"modal-inner-grid2\">\r\n");
<<<<<<< HEAD
      out.write("                                            <!--3--><div id=\"btn3\" class=\"button\"><img class=\"h-50\"   style=\"margin-top:30px;\"src=\"./img/form/paid-before.png\"></div>\r\n");
      out.write("                                        <!--4--><div style=\"text-align: right; padding-top:30px;\">  \r\n");
      out.write("                                                \r\n");
      out.write("                                                <div id=\"btn1\" class=\"button\"><img class=\"h-50\" style=\"margin-top:17px;\" src=\"./img/form/heart-before.png\"></div> \r\n");
      out.write("                                                <div id=\"btn2\" class=\"button\"><img class=\"h-50\" style=\"margin-top:17px;\" src=\"./img/form/arrow-before.png\"></div>\r\n");
      out.write("                                                <div id=\"btn4\" class=\"button\"><img class=\"h-50\" style=\"margin-top:17px;\" src=\"./img/form/chat-before.png\"></div>\r\n");
      out.write("                                                <div id=\"btn5\" class=\"button\"><img class=\"h-50\" data-dismiss=\"modal\" style=\"margin-top:17px;\" src=\"./img/form/cancle-before.png\"></div>\r\n");
=======
      out.write("                                            <!--3--><div id=\"btn3\" class=\"button\"><img class=\"h-50 img_cart_margin\" src=\"./resources/image/form/paid-before.png\"></div>\r\n");
      out.write("                                        <!--4--><div class=\"button_div\" >  \r\n");
      out.write("                                                \r\n");
      out.write("                                                <div id=\"btn1\" class=\"button\"><img class=\"h-50 img_margin\" src=\"./resources/image/form/heart-before.png\"></div> \r\n");
      out.write("                                                <div id=\"btn2\" class=\"button\"><img class=\"h-50 img_margin\" src=\"./resources/image/form/arrow-before.png\"></div>\r\n");
      out.write("                                                <div id=\"btn4\" class=\"button\"><img class=\"h-50 img_margin\" src=\"./resources/image/form/chat-before.png\"></div>\r\n");
      out.write("                                                <div id=\"btn5\" class=\"button\"><img class=\"h-50 img_margin\" data-dismiss=\"modal\" src=\"./resources/image/form/cancle-before.png\"></div>\r\n");
>>>>>>> 7f7c7283d27dcf0b9cae4bf84bee2c912e11a8f9
      out.write("                                               \r\n");
      out.write("                                                </div>\r\n");
      out.write("                                         </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
<<<<<<< HEAD
=======
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                          \r\n");
>>>>>>> 7f7c7283d27dcf0b9cae4bf84bee2c912e11a8f9
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("              <!----------------------------------결제 MODAL창----------------------------------------->\r\n");
      out.write("\r\n");
      out.write("            <div id=\"pay\" class=\"modal fade\">\r\n");
      out.write("                    <div class=\"modal-dialog\">\r\n");
      out.write("                        <div class=\"modal-content modal-size\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <h4>결제 </h4>\r\n");
      out.write("                             \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div >\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <li>판매자: <span id=\"c_id1\" class=\"parti\"></span> 님의 나눔</li>\r\n");
      out.write("                                            <li>글번호: <span id=\"b_no1\" class=\"parti\"></span></li>\r\n");
      out.write("                              \r\n");
      out.write("                                            <li>구매자id : <span id=\"bc_id1\" class=\"parti\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></li>\r\n");
      out.write("                                            <li>제목 : <span id=\"b_title1\" class=\"parti\"></span></li>\r\n");
      out.write("                                            <li>품목 : <span id=\"cate_name1\" class=\"parti\"></span></li>                                          \r\n");
      out.write("                                            <li>위치 : <span id=\"b_location1\" class=\"parti\"></span></li>\r\n");
      out.write("                                            <li>가격 : <span id=\"b_price1\" class=\"parti\"></span></li>\r\n");
      out.write("                                            <li>날짜 : <span id=\"b_date1\" class=\"parti\"></span></li>\r\n");
      out.write("                                            <li>내용 : <span id=\"b_content1\" class=\"parti\"></span></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span id=\"cate_image1\" style=\"display:none;\" class=\"parti\"></span>\r\n");
      out.write("                                            <li><input type=\"checkbox\" class=\"pay_checkbox\"> 위의 내용을 확인 하셨습니까?</li>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"col-lg-12\"\r\n");
      out.write("                                            style=\"display: grid;  grid-template-rows:50% 50%;\">\r\n");
      out.write("                                            <input type=\"button\" class=\"col-sm-12 pay_button\" style=\"border-radius: 10px; color:white; background-color: #d4b113\" value=\"카카오페이\">\r\n");
      out.write("                                            <input  data-dismiss=\"modal\" type=\"button\" class=\"col-sm-12\" style=\"border-radius: 10px; color:white; background-color: #525252\" value=\"돌아가기\">\r\n");
      out.write("                                         \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 \r\n");
      out.write("                                </div>\r\n");
      out.write("    \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("    \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("<!--                 aria-hidden=\"true\" -->\r\n");
      out.write("                <!-- --------------------결제 실패시 뜨는 모달창 ---------------->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"modal fade\" id=\"pay_cancel_Modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"basicModal\" >\r\n");
      out.write(" \t\t\t\t <div class=\"modal-dialog\">\r\n");
      out.write("    \t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("      \t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("        \t<h4 class=\"modal-title\" id=\"myModalLabel\">결제실패</h4>\r\n");
      out.write("       \t\t <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">×</span>\r\n");
      out.write("       \t\t\t </button>\r\n");
      out.write("      \t\t\t</div>\r\n");
      out.write("      \t\t\t<div class=\"modal-body\">\r\n");
      out.write("        <h5 style=\"text-align:center; color:black\">체크버튼을 눌러주세요</h5>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("            \r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
