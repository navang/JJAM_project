/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.20
 * Generated at: 2019-07-23 04:03:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.java.jjam.domain.BoardByCateVO;

public final class jjam_005f2_005fsearch_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.java.jjam.domain.BoardByCateVO");
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
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write(" <body> \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write(" <script>\r\n");
      out.write("\t$(\".participation3\").each(function(){\r\n");
      out.write("\t $(this).click(function(){\r\n");
      out.write("\t\t $(\"#jjoin\").empty();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\turl:\"jjam_3_participate.do\",\r\n");
      out.write("\t\t\tdata:\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\"b_no\" : $(this).find(\"#b_no\").text(),\r\n");
      out.write("\t\t\t\t\"b_title\" : $(this).find(\".b_title\").text(),\r\n");
      out.write("\t\t\t\t\"c_id\" : $(this).find(\"#c_id\").text(),\r\n");
      out.write("\t\t\t\t\"b_content\" : $(this).find(\"#b_content\").text(),\r\n");
      out.write("\t\t\t\t\"b_location\" : $(this).find(\"#b_location\").text(),\r\n");
      out.write("\t\t\t\t\"b_date\" : $(this).find(\"#b_date\").text(),\r\n");
      out.write("\t\t\t\t\"cate_icon\": $(this).find(\"#cate_icon\").text(),\r\n");
      out.write("\t\t\t\t\"b_price\" : $(this).find(\"#b_price\").text(),\r\n");
      out.write("\t\t\t\t\"b_name\":$(this).find(\"#b_name\").text(),\r\n");
      out.write("\t\t\t\t\"cate_name\" :$(this).find(\"#cate_name\").text()\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t$(\"#jjoin\").html(data);\r\n");
      out.write("\t\t\t\t$(\"#join\").modal('show');\r\n");
      out.write("\t\t\t},error:function(){\r\n");
      out.write("\t\t\t\talert(\"에러\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("  ");
List<BoardByCateVO> list = (List<BoardByCateVO>)request.getAttribute("data");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    ");
 for(int i=0; i<list.size(); i++){
      out.write("\r\n");
      out.write("  <div class=\"card w-100 ");
      out.print(list.get(i).getCate_ename());
      out.write(" participation3\">\r\n");
      out.write("                <img src=\"");
      out.print(list.get(i).getCate_icon());
      out.write(".png\" alt=\"\" class=\"card-img-top\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h4 class=\"card-title\"><span class=\"b_title\">");
      out.print(list.get(i).getB_title());
      out.write("</span></h4>\r\n");
      out.write("                 <div><span id=\"c_id\">");
      out.print(list.get(i).getC_id());
      out.write("</span> \r\n");
      out.write("                  / <span id=\"b_content\">");
      out.print(list.get(i).getB_content());
      out.write("</span>\r\n");
      out.write("                  / <span id=\"b_ea\">");
      out.print(list.get(i).getB_ea());
      out.write("</span>\r\n");
      out.write("                  / <span id=\"b_date\">");
      out.print(list.get(i).getB_date() );
      out.write("</span>\r\n");
      out.write("                  / <span id=\"b_name\">");
      out.print(list.get(i).getB_name());
      out.write("</span>\r\n");
      out.write("                  / <span id=\"b_price\">");
      out.print(list.get(i).getB_price());
      out.write("</span>원\r\n");
      out.write("                  <span id=\"b_no\" style=\"display:none;\">");
      out.print(list.get(i).getB_no());
      out.write("</span>\r\n");
      out.write("                  /<span id=\"b_location\">");
      out.print(list.get(i).getB_location());
      out.write("</span>\r\n");
      out.write("                  <span id=\"cate_icon\" style=\"display:none;\">");
      out.print(list.get(i).getCate_icon());
      out.write("</span>\r\n");
      out.write("                  <span id=\"cate_name\" style=\"display:none;\">");
      out.print(list.get(i).getCate_name());
      out.write("</span>\r\n");
      out.write("            \r\n");
      out.write("                  <input type=\"button\" class=\"btn btn-success btn-sm\" value=\"참여하기\"></div>\r\n");
      out.write("             \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>         \r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>");
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
