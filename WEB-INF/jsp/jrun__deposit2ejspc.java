// Generated by JRun, do not edit


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import allaire.jrun.jsp.JRunJSPStaticHelpers;



import java.sql.*;public class jrun__deposit2ejspc extends allaire.jrun.jsp.HttpJSPServlet implements allaire.jrun.jsp.JRunJspPage 
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


    out.print("\r\n<html>\r\n\r\n<body>\r\n<pre>\r\n\r\n\r\n<p>&nbsp;</p>\t\t<form name=\"Deposit\" method=\"post\" action=\"depositpost.jsp\">\r\n\t\tPlease provide the following information to deposit money against an account<p>&nbsp;\t\t\t</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>\t\t\t\t\tAccount Holder\t<input type=\"text\" name=\"Holder\"></p><p>\t\t\t\t\tAccount No.\t<input type=\"text\" name=\"Accno\"></p><p>\t\t\t\t\tDeposit Amuont  <input type=\"text\" name=\"Amount\"></p><p>&nbsp;</p><p>&nbsp;</p><p>\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"Submit\" value=\"Submit\"><input type=\"reset\" name=\"Submit2\" value=\"Reset\"></p></form>\r\n\r\n</pre>\r\n<p>&nbsp; </p>\r\n\r\n\r\n</pre>\r\n</body>\r\n</html>\r\n");

      
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
        return "/deposit.jsp";
    }
}
