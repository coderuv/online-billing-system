// Generated by JRun, do not edit


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import allaire.jrun.jsp.JRunJSPStaticHelpers;


public class jrun__Registration2ejsp11 extends allaire.jrun.jsp.HttpJSPServlet implements allaire.jrun.jsp.JRunJspPage 
{  
    private ServletConfig config;
    private ServletContext application;   
    private Object page = this;
    private JspFactory __jspFactory = JspFactory.getDefaultFactory();
    private allaire.jrun.jsp.PageContextPool __pageContextPool;

    public void _jspService(HttpServletRequest request, HttpServletResponse response) 
         throws ServletException, java.io.IOException
    {
        if(config == null) {
            config = getServletConfig();
            application = config.getServletContext(); 
        }
        if(__pageContextPool == null) {
            __pageContextPool = new allaire.jrun.jsp.PageContextPool(application);
        }
        response.setContentType("text/html; charset=ISO-8859-1");
        PageContext pageContext = __jspFactory.getPageContext(this, request, response,  null, true, 8192, true);
        JspWriter out = pageContext.getOut();
        HttpSession session = pageContext.getSession();




        try {


    out.print("<!--$sitebuilder version=\"2.0.3\" md5=\"aa0f7bee65116cd64d44fefa026972c6\"$-->\r\n<html>\r\n<script language=\"JavaScript\" src=\"/profile.js\"></script> \r\n<script>\r\nfunction validate()\r\n{\r\nvar errors=\"\";\r\nif(trim(register.name.value)==\"\")\r\n  errors+=\"...............Name required\\n\";\r\nif(trim(register.address.value)==\"\")\r\nerrors+=\"...............Address required\\n\";\r\nif(trim(register.phone.value)==\"\")\r\n errors+=\"...............Phone required\\n\";\r\nif(trim(register.email.value)==\"\")\r\n errors+=\"...............Email Address required\\n\";\r\nif(trim(register.password.value)==\"\")\r\n errors+=\"...............Password required\\n\";\r\nif(trim(register.re_pass.value)==\"\")\r\n errors+=\"...............Retype your password \\n\";\r\nif(register.password.value!=register.re_pass.value)\r\n errors+=\"...............Password do not match\\n\";\r\n\r\nvar iStr=register.password.value;\r\nif(errors)\r\n{\r\n alert(\"The following required\\n\"+errors);\r\n return false;\r\n}\r\nif(!checkemail(register.email.value))\r\n{\r\nalert(\"Your Email is invalid\");\r\nreturn false;\r\n}\r\n\r\nif(iStr.length < 6)\r\n{\r\nalert(\"Your Passwords must contain minimum of 6 characters\");\r\nreturn false;\r\n}\r\nreturn  true;\r\n}\r\n</script>\r\n\r\n\r\n  <body  >\r\n\r\n<FORM name=\"register\" method=\"post\"  action=\"\" onsubmit=\"return validate();\" >\r\n\r\n    \r\n      \r\n  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"674\" height=\"462\" style=\"border-collapse: collapse\" bordercolor=\"#111111\">\r\n    \r\n    <tr> \r\n      <td width=\"1\" height=\"39\"></td>\r\n      <td width=\"10\">&nbsp;</td>\r\n      <td width=\"1\"> <img src=\"sitebuilder/images/c.gif\" height=\"1\" width=\"1\"> \r\n      </td>\r\n      <td width=\"140\"><!--DWLayoutEmptyCell-->&nbsp; </td>\r\n      <td width=\"23\"> <img src=\"sitebuilder/images/c.gif\" height=\"1\" width=\"23\"> \r\n      </td>\r\n      <td width=\"1\"> <img src=\"sitebuilder/images/c.gif\" height=\"1\" width=\"1\"> \r\n      </td>\r\n      <td width=\"1\">&nbsp;</td>\r\n      <td width=\"2\">&nbsp;</td>\r\n      <td width=\"1\">&nbsp;</td>\r\n      <td width=\"2\">&nbsp;</td>\r\n      <td width=\"1\">&nbsp;</td>\r\n      <td width=\"1\">&nbsp;</td>\r\n      <td width=\"257\">&nbsp;</td>\r\n      <td width=\"1\">&nbsp;</td>\r\n      <td width=\"7\">&nbsp;</td>\r\n      <td width=\"18\">&nbsp;</td>\r\n      <td width=\"4\">&nbsp;</td>\r\n      <td width=\"9\">&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n    </tr>\r\n    <tr> \r\n      <td nowrap height=\"45\" colspan=\"16\" align=\"center\" valign=\"top\" bgcolor=\"#9999FF\"><p class=\"text\"><b><font face=\"Century Gothic\" size=\"4\"><span style=\"font-size:20px;line-height:26px;\">Registration \r\n          Form</span></font></b><span style=\"font-size:14px;line-height:17px;\"><br>\r\n          </span></p></td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n    </tr>\r\n    <tr> \r\n      <td height=\"24\" colspan=\"16\"></td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"1\" height=\"38\"></td>\r\n      <td nowrap colspan=\"14\" align=\"center\" valign=\"top\"><p class=\"text\"><b><font face=\"Century Gothic\" color=\"#FF0066\" size=\"4\"><span style=\"font-size:20px;line-height:26px;\">You \r\n          must fill all the field</span></font></b><span style=\"font-size:14px;line-height:17px;\"><br>\r\n          </span></p></td>\r\n      <td></td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n    </tr>\r\n    <tr> \r\n      <td height=\"103\" colspan=\"16\"></td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"184\" height=\"2\" colspan=\"12\"></td>\r\n      <td colspan=\"2\" rowspan=\"3\" valign=\"top\"><input name=\"name\" value=\"\" size=\"35\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"12\" height=\"17\" colspan=\"3\"></td>\r\n      <td nowrap colspan=\"6\" align=\"center\" valign=\"top\"><p class=\"text\"><b><span style=\"font-size:14px;line-height:17px;\">Name</span></b><span style=\"font-size:14px;line-height:17px;\"><br>\r\n          </span></p></td>\r\n      <td width=\"4\" colspan=\"3\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"184\" height=\"3\" colspan=\"12\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td height=\"10\" colspan=\"16\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"184\" height=\"1\" colspan=\"12\"></td>\r\n      <td colspan=\"2\" rowspan=\"3\" valign=\"top\"><input name=\"address\" value=\"\" size=\"35\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"12\" height=\"17\" colspan=\"3\"></td>\r\n      <td nowrap colspan=\"5\" align=\"center\" valign=\"top\"><p class=\"text\"><b><span style=\"font-size:14px;line-height:17px;\">Address</span></b><span style=\"font-size:14px;line-height:17px;\"><br>\r\n          </span></p></td>\r\n      <td width=\"5\" colspan=\"4\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"184\" height=\"4\" colspan=\"12\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td height=\"5\" colspan=\"16\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"183\" height=\"2\" colspan=\"11\"></td>\r\n      <td colspan=\"2\" rowspan=\"3\" valign=\"top\"><input name=\"phone\" value=\"\" size=\"35\"></td>\r\n      <td colspan=\"3\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"11\" height=\"17\" colspan=\"2\"></td>\r\n      <td nowrap colspan=\"3\" align=\"center\" valign=\"top\"><p class=\"text\"><b><span style=\"font-size:14px;line-height:17px;\">Phone/Mobile</span></b><span style=\"font-size:14px;line-height:17px;\"><br>\r\n          </span></p></td>\r\n      <td width=\"8\" colspan=\"6\"></td>\r\n      <td colspan=\"3\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"183\" height=\"3\" colspan=\"11\"></td>\r\n      <td colspan=\"3\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td height=\"9\" colspan=\"16\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"183\" height=\"3\" colspan=\"11\"></td>\r\n      <td colspan=\"2\" rowspan=\"3\" valign=\"top\"><input name=\"email\" value=\"\" size=\"35\"></td>\r\n      <td colspan=\"3\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"11\" height=\"17\" colspan=\"2\"></td>\r\n      <td nowrap colspan=\"5\" align=\"center\" valign=\"top\"><p class=\"text\"><b><span style=\"font-size:14px;line-height:17px;\">Email</span></b><span style=\"font-size:14px;line-height:17px;\"><br>\r\n          </span></p></td>\r\n      <td width=\"6\" colspan=\"4\"></td>\r\n      <td colspan=\"3\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"183\" height=\"2\" colspan=\"11\"></td>\r\n      <td colspan=\"3\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td height=\"8\" colspan=\"16\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"184\" height=\"2\" colspan=\"12\"></td>\r\n      <td colspan=\"2\" rowspan=\"3\" valign=\"top\"><input type=\"password\" name=\"password\" value=\"\" size=\"35\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"12\" height=\"17\" colspan=\"3\"></td>\r\n      <td nowrap colspan=\"3\" align=\"center\" valign=\"top\"><p class=\"text\"><b><span style=\"font-size:14px;line-height:17px;\">Password</span></b><span style=\"font-size:14px;line-height:17px;\"><br>\r\n          </span></p></td>\r\n      <td width=\"8\" colspan=\"6\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"184\" height=\"3\" colspan=\"12\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td height=\"9\" colspan=\"16\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"184\" height=\"2\" colspan=\"12\"></td>\r\n      <td colspan=\"2\" rowspan=\"2\" valign=\"top\"><input type=\"password\" name=\"re_pass\" value=\"\" size=\"35\"> \r\n      </td>\r\n      <td colspan=\"2\"></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n      <td></td>\r\n    </tr>\r\n    <tr> \r\n      <td width=\"12\" height=\"20\" colspan=\"3\"></td>\r\n      <td nowrap colspan=\"7\" align=\"center\" valign=\"top\"><p class=\"text\"><b><span style=\"font-size:14px;line-height:17px;\">Re \r\n          Type Password</span></b><span style=\"font-size:14px;line-height:17px;\"><br>\r\n          </span></p></td>\r\n      <td width=\"2\" colspan=\"2\"></td>\r\n      <td colspan=\"2\"></td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n      <td>&nbsp;</td>\r\n    </tr>\r\n    <tr> \r\n      <td height=\"57\" colspan=\"16\"></td>\r\n      <td></td>\r\n      <td valign=\"top\"><p>&nbsp;</p>\r\n        <p>&nbsp; </p></td>\r\n      <td width=\"21\"></td>\r\n      <br>\r\n      <td valign=\"top\"><input type=\"submit\" name=\"Submit\" value=\"Continue\"> <input name=\"reset\" type=\"reset\" value=\"reset\"> \r\n      </td>\r\n    </tr>\r\n  </table>\r\n\r\n\r\n\r\n\r\n\r\n\r\n      </center>\r\n    </div>\r\n\r\n\r\n\r\n\r\n\r\n\r\n</form>\r\n  </body>\r\n</html>");

      
        } catch(Throwable t) {
            if(t instanceof ServletException)
                throw (ServletException) t;
            if(t instanceof java.io.IOException)
                throw (java.io.IOException) t;
            if(t instanceof RuntimeException)
                throw (RuntimeException) t;
            throw JRunJSPStaticHelpers.handleException(t, pageContext);
    
        } finally { 
            __jspFactory.releasePageContext(pageContext);
        }
    }



  

    public allaire.jrun.jsp.PageContextPool __getPageContextPool()
    {
        return __pageContextPool;
    }
  
    public void __setPageContextPool(allaire.jrun.jsp.PageContextPool p)
    {
        __pageContextPool = p;
    }

    public String __getPagePath()
    {
        return "/Registration.jsp";
    }
}
