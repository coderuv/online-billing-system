// Generated by JRun, do not edit


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import allaire.jrun.jsp.JRunJSPStaticHelpers;


public class jrun__New2ejsp8 extends allaire.jrun.jsp.HttpJSPServlet implements allaire.jrun.jsp.JRunJspPage 
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


    out.print("<html>\r\n<body background=\"frame.bmp\">\r\n\r\n\t\t\t<pre>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\tElectric Bill\r\n\r\n</pre>\r\n</body> \r\n</html>");

      
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
        return "/New.jsp";
    }
}
