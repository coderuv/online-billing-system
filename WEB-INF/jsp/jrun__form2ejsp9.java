// Generated by JRun, do not edit


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import allaire.jrun.jsp.JRunJSPStaticHelpers;


public class jrun__form2ejsp9 extends allaire.jrun.jsp.HttpJSPServlet implements allaire.jrun.jsp.JRunJspPage 
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


    out.print("<!-- pass a variable to included page -->\r\n\r\n");

request.setAttribute("color", "white"); 
    out.print("\r\n\r\n");

request.setAttribute("title", "Using Forms"); 
    out.print("\r\n\r\n");

include file="header.jsp" 
    out.print("\r\n\r\n\r\n\r\n<H3>Form Sample</H3>\r\n\r\n<HR>\r\n\r\n\r\n\r\n");

if(request.getParameter("hname")==null) {



   // This part of the script allows a person

   // to enter data on an HTML form.


    out.print("\r\n\r\n\r\n\r\n      <P>This sample shows how to use the Request collection \r\n\r\n      to get information from a posted form.\r\n\r\n      <FORM METHOD=POST ACTION=\"form.jsp\">\r\n\r\n\r\n\r\n      <P>Your Name:\r\n\r\n\r\n\r\n      <P><INPUT TYPE=TEXT SIZE=50 MAXLENGTH=50 NAME=\"name\"><BR>\r\n\r\n\r\n\r\n      <P>Movies that you like: (you may select more than one)\r\n\r\n      <SELECT NAME=\"movies\" MULTIPLE SIZE=3>\r\n\r\n      <OPTION SELECTED> Jurassic Park\r\n\r\n      <OPTION> The Usual Suspects\r\n\r\n      <OPTION> Jacob's Ladder\r\n\r\n      </SELECT>\r\n\r\n\r\n\r\n      <INPUT TYPE=HIDDEN NAME=\"hname\" VALUE=\"hvalue\" ><BR>\r\n\r\n\r\n\r\n      <P>Why do you like the movies you've selected?\r\n\r\n\r\n\r\n      <P><TEXTAREA NAME=\"describe\" ROWS=5 COLS=35></TEXTAREA><BR>\r\n\r\n\r\n\r\n      <P><INPUT TYPE=SUBMIT VALUE=\"Submit Form\"><INPUT TYPE=RESET VALUE=\"Reset Form\">\r\n\r\n      </FORM>\r\n\r\n\r\n\r\n\r\n\r\n");

} else {



   // This part of the script shows a person

   // what was selected.


    out.print("\r\n\r\n\r\n\r\n      ");

if(request.getParameter("name")==null) { 
    out.print("\r\n\r\n   <P>You did not provide your name.\r\n\r\n      ");

} else { 
    out.print("\r\n\r\n           <P>Your name is <B>");

request.getParameter("name") 
    out.print("</B>\r\n\r\n           ");

} 
    out.print("\r\n\r\n\r\n\r\n           ");

if(request.getParameterValues("movies").length == 0) { 
    out.print("      \r\n\r\n   <P>You did not select any movies.\r\n\r\n      ");

} else {
    out.print("\r\n\r\n   <P>The movies you like are: <B>\r\n\r\n");

String[] arr=request.getParameterValues("movies"); 

   for(int i=0; i<arr.length; i++) { 
    out.print("\r\n\r\n");

"<BR>" + (i+1) + ") " + arr[i] 
    out.print("\r\n\r\n");

} 
    out.print("\r\n\r\n</B>\r\n\r\n\r\n\r\n   ");

if(request.getParameter("describe").equals("")) { 
    out.print("\r\n\r\n  <P>You did not say why you like the movie(s) you have selected.\r\n\r\n  ");

} else { 
    out.print("\r\n\r\n     <P>Your description of why you like the movie(s) is:\r\n\r\n     <B><I>");

request.getParameter("describe") 
    out.print("</B></I>\r\n\r\n   ");

} 
    out.print("\r\n\r\n  ");

} 
    out.print("           \r\n\r\n");

} 
    out.print("\r\n\r\n\r\n\r\n<br>\r\n\r\n<br>\r\n\r\n");
out.flush();


pageContext.include("viewsource.jsp" + "");
out.print("\r\n");
out.flush();


pageContext.include("footer.html" + "");
out.print("\r\n\r\n\r\n\r\n</BODY>\r\n\r\n</HTML>\r\n\r\n");

      
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
        return "/form.jsp";
    }
}
