/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-07-27 02:07:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery-3.5.0.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            async : false,\r\n");
      out.write("            url : \"selectType\",\r\n");
      out.write("            dataType : \"json\",\r\n");
      out.write("            type : \"post\",\r\n");
      out.write("            success : function (obj) {\r\n");
      out.write("                for (let x in obj) {\r\n");
      out.write("                    $(\"#type\").append(\"<option value=\" + obj[x].id + \">\" + obj[x].name + \"</option>\" )\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            async: false,\r\n");
      out.write("            url : \"selectOne\",\r\n");
      out.write("            data : {\"id\":");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("},\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            type: \"post\",\r\n");
      out.write("            success : function (obj) {\r\n");
      out.write("                $(\"[name='code']\").val(obj.code)\r\n");
      out.write("                $(\"[name='name']\").val(obj.name)\r\n");
      out.write("                $(\"[name='start_time']\").val(obj.start_time)\r\n");
      out.write("                $(\"[name='end_time']\").val(obj.end_time)\r\n");
      out.write("                $(\"#type option[value=\" + obj.type + \"]\").prop(\"selected\",true);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"update\" method=\"post\">\r\n");
      out.write("    <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    会议编号: <input type=\"text\" name=\"code\"><br>\r\n");
      out.write("    会议名称: <input type=\"text\" name=\"name\"><br>\r\n");
      out.write("    会议时间: <input type=\"text\" name=\"start_time\"> -- <input type=\"text\" name=\"end_time\"><br>\r\n");
      out.write("    会议类型: <select name=\"type\" id=\"type\">\r\n");
      out.write("    <option>请选择</option>\r\n");
      out.write("</select><br>\r\n");
      out.write("    <input type=\"submit\" value=\"保存\">\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
