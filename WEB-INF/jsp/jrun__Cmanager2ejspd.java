// Generated by JRun, do not edit


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import allaire.jrun.jsp.JRunJSPStaticHelpers;



import java.sql.*;
import java.sql.*;
import java.sql.*;public class jrun__Cmanager2ejspd extends allaire.jrun.jsp.HttpJSPServlet implements allaire.jrun.jsp.JRunJspPage 
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


    out.print("\r\n<html>\r\n<head>\r\n<title>Untitled Document</title>\r\n\r\n</head>\r\n\r\n<body>\r\n");

String man=request.getParameter("Manager");
String	pas=request.getParameter("Password");
String  job=request.getParameter("R1");


    out.print("\r\n\r\n");

boolean val=true;
	if(man.equals("pdb")&pas.equals("pdb") )
		out.print("WELCOME to POWER DEVEVOPEMENT BOARD.");

	else if(man.equals("wasa")&pas.equals("wasa") )
		out.print("WELCOME to WATER SUPPLY ATHORITY.");

	else if(man.equals("titas")&pas.equals("titas") )
		out.print("WELCOME to TITAS GAS COMPANY.");
	else 
		{
		out.print("Invalid User or Password.");
		val=false;
		
    out.print("\r\n\t\t");

out.print("<html>\r\n\r\n<head>\r\n<meta http-equiv=\"Content-Language\" content=\"en-us\">\r\n<meta name=\"GENERATOR\" content=\"Microsoft FrontPage 5.0\">\r\n<meta name=\"ProgId\" content=\"FrontPage.Editor.Document\">\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n<title>Company Name PDB&nbsp; WASA&nbsp;&nbsp; TITAS</title>\r\n</head>\r\n\r\n<body>\r\n\r\n<form method=\"POST\" action=\"Cmanager.jsp\" >\r\n  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n  </p>\r\n  <p>&nbsp;</p>\r\n  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n  Manager&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n  <input type=\"text\" name=\"Manager\" size=\"25\"></p>\r\n  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n  Password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n  <input type=\"password\" name=\"Password\" size=\"25\"></p>\r\n  <p>&nbsp;</p>\r\n  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n    <input type=\"radio\" value=\"cb\" checked name=\"R1\">\r\n    Create Bill&nbsp; \r\n    <input type=\"radio\" name=\"R1\" value=\"vu\">\r\n    Verify User&nbsp; \r\n    <input type=\"radio\" name=\"R1\" value=\"vw\">\r\n    View&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </p>\r\n  <p>&nbsp;</p>\r\n  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n  <input type=\"submit\" value=\"Submit\" name=\"B1\">\r\n  <input type=\"reset\" value=\"Reset\" name=\"B2\"></p>\r\n\r\n</form>\r\n\r\n\r\n\r\n</body>\r\n\r\n</html>");

out.print("\r\n\t\t");

}

    out.print("\r\n\r\n\r\n");

if(val){
		if(job.equals("cb"))
		
		{

    out.print("         \r\n\t\t\t");
out.flush();


pageContext.include("createbill.jsp" + "?Company=" + pas+ "");
out.print("\r\n\r\n");

}

		if(job.equals("vu"))
		{

    out.print("\r\n\t\t\t");

out.print("\r\n<html>\r\n<head>\r\n<title>Create Bill</title>\r\n\r\n</head>\r\n\r\n<body>\r\n<form name=\"form1\" method=\"post\" action=\"\">\r\n  <pre>Customer ID\t\t\t\t<input type=\"text\" name=\"Id\">\r\n\r\n\t\t\t\t\r\n\r\n\t\t\t\t\r\n\r\nVerify Month <select name=\"Month\"><option>January</option><option>February</option><option>March</option><option>April</option><option>May</option><option>June</option><option>July</option><option>August</option><option>September</option><option>October</option><option>November</option><option>December</option></select>\tYear <select name=\"Year\"><option>2005</option><option>2006</option></select>\r\n\r\n\r\n\t\t<input type=\"submit\" name=\"Submit\" value=\"View\"><input type=\"reset\" name=\"Submit2\" value=\"Reset\">\r\n</pre>\r\n</form>\r\n</body>\r\n</html>\r\n");

out.print("\r\n\r\n");

}

		if(job.equals("vw"))
		{

    out.print("\r\n\t\t\t");

out.print("\r\n<html>\r\n<head>\r\n<title>Create Bill</title>\r\n\r\n</head>\r\n\r\n<body>\r\n<form name=\"form1\" method=\"post\" action=\"\">\r\n  <pre>Customer ID\t\t\t<input type=\"text\" name=\"Id\">\r\n\r\n\r\nPay Month <select name=\"Month\"><option>January</option><option>February</option><option>March</option><option>April</option><option>May</option><option>June</option><option>July</option><option>August</option><option>September</option><option>October</option><option>November</option><option>December</option></select>\tYear <select name=\"Year\"><option>2005</option><option>2006</option></select>\r\n\r\n\r\n\t\t<input type=\"submit\" name=\"Submit\" value=\"Submit\"><input type=\"reset\" name=\"Submit2\" value=\"Reset\">\r\n</pre>\r\n</form>\r\n</body>\r\n</html>\r\n");

out.print("\r\n\r\n");

}
}

    out.print("\r\n\r\n</body>\r\n</html>\r\n");

      
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
        return "/Cmanager.jsp";
    }
}
