/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.20
 * Generated at: 2019-07-23 04:08:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.java.jjam.domain.ChatVO;

public final class jjam_005f6_005fmypage_005fletter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.java.jjam.domain.ChatVO");
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body{margin-top:20px;\r\n");
      out.write("background:#eee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ========================================================================\r\n");
      out.write(" * MESSAGES\r\n");
      out.write(" * ======================================================================== */\r\n");
      out.write(".message form {\r\n");
      out.write("  padding: 6px 15px;\r\n");
      out.write("  background-color: #FAFAFA;\r\n");
      out.write("  border-bottom: 1px solid #E6EBED;\r\n");
      out.write("}\r\n");
      out.write(".message form .has-icon .form-control-icon {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  z-index: 5;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  right: 0;\r\n");
      out.write("  width: 34px;\r\n");
      out.write("  line-height: 33px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  color: #777;\r\n");
      out.write("}\r\n");
      out.write(".message > a {\r\n");
      out.write("  position: relative;\r\n");
      out.write("}\r\n");
      out.write(".message .indicator {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".message .indicator .spinner {\r\n");
      out.write("  left: 26%;\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  font-size: 13px;\r\n");
      out.write("  line-height: 17px;\r\n");
      out.write("  color: #999;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".message-wrapper {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  padding: 0px;\r\n");
      out.write("  background-color: #ffffff;\r\n");
      out.write("  margin: 0px;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .message-sideleft {\r\n");
      out.write("  vertical-align: top !important;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .message-sideleft[class*=\"col-\"] {\r\n");
      out.write("  padding-right: 0px;\r\n");
      out.write("  padding-left: 0px;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .message-sideright {\r\n");
      out.write("  background-color: #f8f8f8;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .message-sideright[class*=\"col-\"] {\r\n");
      out.write("/*   padding: 30px; */\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .message-sideright .panel {\r\n");
      out.write("  border-top: 1px dotted #DDD;\r\n");
      out.write("  padding-top: 20px;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .message-sideright .panel:first-child {\r\n");
      out.write("  border-top: none;\r\n");
      out.write("  padding-top: 0px;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .message-sideright .panel .panel-heading {\r\n");
      out.write("  border-bottom: none;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .panel {\r\n");
      out.write("  background-color: transparent !important;\r\n");
      out.write("  -moz-box-shadow: none !important;\r\n");
      out.write("  -webkit-box-shadow: none !important;\r\n");
      out.write("  box-shadow: none !important;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .panel .panel-heading, .message-wrapper .panel .panel-body {\r\n");
      out.write("  background-color: transparent !important;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .media .media-body {\r\n");
      out.write("  font-weight: 300;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .media .media-heading {\r\n");
      out.write("  margin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".message-wrapper .media small {\r\n");
      out.write("  color: #999999;\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".list-message .list-group-item {\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  color: #999999 !important;\r\n");
      out.write("  border-right: 3px solid #8CC152 !important;\r\n");
      out.write("}\r\n");
      out.write(".list-message .list-group-item.active {\r\n");
      out.write("  background-color: #EEEEEE;\r\n");
      out.write("  border-bottom: 1px solid #DDD !important;\r\n");
      out.write("}\r\n");
      out.write(".list-message .list-group-item.active p {\r\n");
      out.write("  color: #999999 !important;\r\n");
      out.write("}\r\n");
      out.write(".list-message .list-group-item.active:hover, .list-message .list-group-item.active:focus, .list-message .list-group-item.active:active {\r\n");
      out.write("  background-color: #EEEEEE;\r\n");
      out.write("}\r\n");
      out.write(".list-message .list-group-item small {\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".list-message .list-group-item .list-group-item-heading {\r\n");
      out.write("  color: #999999 !important;\r\n");
      out.write("}\r\n");
      out.write(".list-message .list-group-item .list-group-item-text {\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(".list-message .list-group-item:last-child {\r\n");
      out.write("  -moz-border-radius: 0px;\r\n");
      out.write("  -webkit-border-radius: 0px;\r\n");
      out.write("  border-radius: 0px;\r\n");
      out.write("  border-bottom: 1px solid #DDD !important;\r\n");
      out.write("}\r\n");
      out.write(".avatar{\r\n");
      out.write("    width:50px;\r\n");
      out.write("    height:50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<title>Insert title here</title>\r\n");
 List<ChatVO> list = (List<ChatVO>)request.getAttribute("data");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\" style=\"background-color:white;\">\r\n");
      out.write("<div class=\"row message-wrapper rounded shadow mb-20\">\r\n");
      out.write("<!--     <div class=\"col-md-4 message\"> -->\r\n");
      out.write("<!--         <div class=\"panel\"> -->\r\n");
      out.write("<!--             <div class=\"panel-heading\"> -->\r\n");
      out.write("<!--                 <div class=\"pull-left\"> -->\r\n");
      out.write("<!--                     <h3 class=\"panel-title\">Conversations</h3> -->\r\n");
      out.write("<!--                 </div> -->\r\n");
      out.write("<!--                 <div class=\"pull-right\"> -->\r\n");
      out.write("<!--                     <div class=\"btn-group\"> -->\r\n");
      out.write("<!--                         <button type=\"button\" class=\"btn btn-sm btn-success\">All Sources</button> -->\r\n");
      out.write("<!--                         <button type=\"button\" class=\"btn btn-sm btn-success dropdown-toggle\" data-toggle=\"dropdown\"> -->\r\n");
      out.write("<!--                             <span class=\"caret\"></span> -->\r\n");
      out.write("<!--                             <span class=\"sr-only\">Toggle Dropdown</span> -->\r\n");
      out.write("<!--                         </button> -->\r\n");
      out.write("<!--                         <ul class=\"dropdown-menu pull-right\" role=\"menu\"> -->\r\n");
      out.write("<!--                             <li><a href=\"#\"><i class=\"fa fa-download\"></i> Inbox</a></li> -->\r\n");
      out.write("<!--                             <li><a href=\"#\"><i class=\"fa fa-upload\"></i> Outbox</a></li> -->\r\n");
      out.write("<!--                             <li><a href=\"#\"><i class=\"fa fa-trash-o\"></i> Trash</a></li> -->\r\n");
      out.write("<!--                             <li class=\"divider\"></li> -->\r\n");
      out.write("<!--                             <li><a href=\"#\"><i class=\"fa fa-briefcase\"></i> Other</a></li> -->\r\n");
      out.write("<!--                         </ul> -->\r\n");
      out.write("<!--                     </div> -->\r\n");
      out.write("<!--                 </div> -->\r\n");
      out.write("<!--                 <div class=\"clearfix\"></div> -->\r\n");
      out.write("<!--             </div>/.panel-heading -->\r\n");
      out.write("<!--             <div class=\"panel-body no-padding\"> -->\r\n");
      out.write("<!--                 <div class=\"list-group no-margin list-message\"> -->\r\n");
      out.write("<!--                     <a href=\"#\" class=\"list-group-item\"> -->\r\n");
      out.write("<!--                         <h4 class=\"list-group-item-heading\">Jeck Joko <small>Yesterday at 15:45</small></h4> -->\r\n");
      out.write("<!--                         <p class=\"list-group-item-text\"> -->\r\n");
      out.write("<!--                             Ticket #78: <strong>Problems with custom CSS3</strong> -->\r\n");
      out.write("<!--                         </p> -->\r\n");
      out.write("<!--                         <span class=\"label label-success pull-right\">SOLVED</span> -->\r\n");
      out.write("<!--                         <div class=\"clearfix\"></div> -->\r\n");
      out.write("<!--                     </a> -->\r\n");
      out.write("<!--                     <a href=\"#\" class=\"list-group-item active\"> -->\r\n");
      out.write("<!--                         <h4 class=\"list-group-item-heading\">Toni Miring <small>Sunday at 12:33</small></h4> -->\r\n");
      out.write("<!--                         <p class=\"list-group-item-text\">Ticket #43: <strong>How do i use something</strong></p> -->\r\n");
      out.write("<!--                         <span class=\"label label-success pull-right rounded\">SOLVED</span> -->\r\n");
      out.write("<!--                         <div class=\"clearfix\"></div> -->\r\n");
      out.write("<!--                     </a> -->\r\n");
      out.write("<!--                     <a href=\"#\" class=\"list-group-item\"> -->\r\n");
      out.write("<!--                         <h4 class=\"list-group-item-heading\">Bella Negoro <small>Sunday at 12:33</small></h4> -->\r\n");
      out.write("<!--                         <p class=\"list-group-item-text\">Ticket #15: <strong>Why doesn't my cheese work properly? :(</strong></p> -->\r\n");
      out.write("<!--                         <span class=\"label label-default pull-right circle\">OPEN</span> -->\r\n");
      out.write("<!--                         <div class=\"clearfix\"></div> -->\r\n");
      out.write("<!--                     </a> -->\r\n");
      out.write("<!--                     <a href=\"#\" class=\"list-group-item\"> -->\r\n");
      out.write("<!--                         <h4 class=\"list-group-item-heading\">Daddy Botak <small>Sunday at 12:33</small></h4> -->\r\n");
      out.write("<!--                         <p class=\"list-group-item-text\">Can i have longer on my free trial please?</p> -->\r\n");
      out.write("<!--                     </a> -->\r\n");
      out.write("<!--                 </div>/.list-group -->\r\n");
      out.write("<!--             </div>/.panel-body -->\r\n");
      out.write("<!--         </div> /.panel -->\r\n");
      out.write("<!--     </div> /.message-sideleft -->\r\n");
      out.write("    <div class=\"col-md-12 message\">\r\n");
      out.write("        \r\n");
      out.write("        ");
for(int i=0; i<list.size(); i++){ 
      out.write("\r\n");
      out.write("        <div class=\"panel\"> \r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("                <div class=\"media\">\r\n");
      out.write("                        <img src=\"https://bootdey.com/img/Content/avatar/avatar1.png\"  class=\"img-circle avatar\">\r\n");
      out.write("                    <div class=\"media-body\">\r\n");
      out.write("                        <h4 class=\"media-heading\">");
      out.print(list.get(i).getCustomerA() );
      out.write(" <small>(보낸사람)</small></h4>\r\n");
      out.write("                        <small>");
      out.print(list.get(i).getChat_date() );
      out.write("</small>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!-- /.panel-heading -->\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("                <p class=\"lead\" style=\"color:black;\">\r\n");
      out.write("                    ");
      out.print(list.get(i).getChat_title());
      out.write("\r\n");
      out.write("                </p>\r\n");
      out.write("             \r\n");
      out.write("                <p style=\"color:black;\">\r\n");
      out.write("                    ");
      out.print(list.get(i).getChat_content());
      out.write("\r\n");
      out.write("                </p>\r\n");
      out.write("                <br>\r\n");
      out.write("                <p style=\"color:black;\">\r\n");
      out.write("                    Thanks! <br>\r\n");
      out.write("                    ");
      out.print(list.get(i).getBc_id());
      out.write("\r\n");
      out.write("                </p>\r\n");
      out.write("                <hr>\r\n");
      out.write("            </div><!-- /.panel-body -->\r\n");
      out.write("        </div><!-- /.panel -->\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("    </div><!-- /.message-sideright -->\r\n");
      out.write("</div><!-- /row -->\r\n");
      out.write("\r\n");
      out.write("</div><!--/ container -->\r\n");
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
