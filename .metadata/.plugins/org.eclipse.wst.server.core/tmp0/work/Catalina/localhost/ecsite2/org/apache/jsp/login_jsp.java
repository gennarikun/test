/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-01-25 08:18:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.36.jar", Long.valueOf(1546835390715L));
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-narasaki/test/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ecsite2/WEB-INF/lib/struts2-core-2.3.36.jar!/META-INF/struts-tags.tld", Long.valueOf(1537588232000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody;

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
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      out.write("<!DOCTYPE htm>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\"/>\r\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\"/>\r\n");
      out.write("<meta name=\"description\" content=\"\"/>\r\n");
      out.write("<meta name=\"keywords\" content=\"\"/>\r\n");
      out.write("<title>Login画面</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\tline-height:1.6;\r\n");
      out.write("\tletter-spacing;1px;\r\n");
      out.write("\tfont-family:sans-serif;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\tcolor:#333;\r\n");
      out.write("\tbackground:url(photo.jpg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox{\r\n");
      out.write("\twidth:320px;\r\n");
      out.write("\theight:400px;\r\n");
      out.write("\tbackground:#000;\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("\ttop:380px;\r\n");
      out.write("\tleft:50%;\r\n");
      out.write(" \tposition:absolute; \r\n");
      out.write(" \ttransform:translate(-50%,-50%); \r\n");
      out.write("\tbox-sizing:border-box;\r\n");
      out.write("\tpadding:70px 30px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("h1{\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tfont-size:22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox p{\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox input{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tmargin-bottom:20px;\r\n");
      out.write("}\r\n");
      out.write(".loginbox input[type=\"text\"],input[type=\"password\"]\r\n");
      out.write("{\r\n");
      out.write("\tborder:none;\r\n");
      out.write("\tborder-bottom:1px solid #fff;\r\n");
      out.write("\tbackground:transparent;\r\n");
      out.write("\toutline:none;\r\n");
      out.write("\theight:40px;\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("\tfont-size:16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox input[type=\"submit\"]\r\n");
      out.write("{\r\n");
      out.write("\tborder:none;\r\n");
      out.write("\toutline:none;\r\n");
      out.write("\theight:40px;\r\n");
      out.write("\tbackground:#fb2525;\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("\tfontsize:18px;\r\n");
      out.write("\tborder-radius:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox input[type=\"submit\"]:hover\r\n");
      out.write("{\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\tbackground:#ffc107;\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox2 p{\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\tline-height:20px;\r\n");
      out.write("\tcolor:darkgray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox2 p:hover{\r\n");
      out.write("\tcolor:#ffc107;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#top{\r\n");
      out.write("\twidth:780px;\r\n");
      out.write("\tmargin:30px auto;\r\n");
      out.write("\tborder:1px solid #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:80px;\r\n");
      out.write("\tbackground-color:black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#main{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:500px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("#footer{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:80px;\r\n");
      out.write("\tbackground-color:black;\r\n");
      out.write("\tclear:both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<div id=\"pr\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t<p>Login</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<div class=\"loginbox\">\r\n");
      out.write("\t\t<img src=\"icon.png\" class=\"avatar\">\r\n");
      out.write("\t\t\t<h1>Login Here</h1>\r\n");
      out.write("\t\t\t<form action=\"LoginAction\">\r\n");
      out.write("\t\t\t\t\t<p>Username</p>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"loginUserId\" placeholder=\"Enter Username\">\r\n");
      out.write("\t\t\t\t\t<p>Password</p>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"loginPassword\" placeholder=\"Enter Password\">\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"\" value=\"Login\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"loginbox2\">\r\n");
      out.write("\t\t\t\t<p>新規ユーザー登録は<a href='");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("'>こちら</a></p>\r\n");
      out.write("\t\t\t\t<p>Homeへ戻る場合は<a href='");
      if (_jspx_meth_s_005furl_005f1(_jspx_page_context))
        return;
      out.write("'>こちら</a></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<div id=\"pr\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /login.jsp(146,25) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("UserCreateAction");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f1.setParent(null);
    // /login.jsp(147,26) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setAction("GoHomeAction");
    int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
    if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
    return false;
  }
}
