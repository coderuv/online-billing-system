// Generated by JRun, do not edit


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import allaire.jrun.jsp.JRunJSPStaticHelpers;



import java.sql.*;public class jrun__UpdateUser2ejspf extends allaire.jrun.jsp.HttpJSPServlet implements allaire.jrun.jsp.JRunJspPage 
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


    out.print("\r\n<html>\r\n<script language=\"JavaScript\" src=\"/profile.js\"></script> \r\n<script>\r\nfunction validate()\r\n{\r\nvar errors=\"\";\r\nif(trim(register.Name.value)==\"\")\r\n  errors+=\"...............Name required\\n\";\r\nif(trim(register.Address.value)==\"\")\r\nerrors+=\"...............Address required\\n\";\r\n\r\nif(trim(register.Balance.value)==\"\")\r\n errors+=\"...............Balance required\\n\";\r\n\r\n\r\nif(trim(register.Phone.value)==\"\")\r\nerrors+=\"...............Phone required\\n\";\r\nif(trim(register.Email.value)==\"\")\r\nerrors+=\"...............Email Address required\\n\";\r\nif(trim(register.Password.value)==\"\")\r\n errors+=\"...............Password required\\n\";\r\nif(trim(register.Repassword.value)==\"\")\r\n errors+=\"...............Retype your password \\n\";\r\nif(register.Password.value!=register.Repassword.value)\r\nerrors+=\"...............Password do not match\\n\";\r\n\r\nvar iStr=register.Password.value;\r\nif(errors)\r\n{\r\n alert(\"The following required\\n\"+errors);\r\n return false;\r\n}\r\nif(!checkemail(register.Email.value))\r\n{\r\nalert(\"Your Email is invalid\");\r\nreturn false;\r\n}\r\n\r\n\r\nif(!isNaN(register.Name.value)||register.Name.value.length<3 )\r\n{\r\nalert(\"Digiits are not allowed for Name & \\n must be at least 3 Charaters.\");\r\nreturn false;\r\n}\r\n\r\n\r\n\r\n\r\n\r\nif(isNaN(register.Phone.value)||register.Phone.value.length<9 )\r\n{\r\nalert(\"Enter a Valid Phone Number.\");\r\nreturn false;\r\n}\r\n\r\nif(isNaN(register.Balance.value)||register.Balance.value.length<4)\r\n{\r\nalert(\"Enter a Valid Balance Amount .\");\r\nreturn false;\r\n}\r\n\r\n\r\nif(iStr.length < 5)\r\n{\r\nalert(\"Your Passwords must contain minimum of 5 characters\");\r\nreturn false;\r\n}\r\n\r\n\r\n\r\n\r\nreturn  true;\r\n}\r\n</script>\r\n\r\n\r\n\r\n\r\n\r\n\r\n<head>\r\n<title>NewUser</title>\r\n</head>\r\n\r\n<body>\r\n\r\n");

String ach= request.getParameter("Holder");
String acno= request.getParameter("Accno");



    out.print("\r\n");

String ucnt="1";
// =new Integer();//=(Integer) session.getAttribute("count");

//count = parm.intValue();

session.setAttribute("ucount", ucnt);
//out.print(session.getLastAccessedTime());
//out.print(count);
session.setMaxInactiveInterval(180);
//if(count==0)out.print("DATE HAS EXPIRED.");

//
    out.print("\r\n\r\n");

out.print("\r\n");

Class.forName("allaire.jrun.jdbc.JRunDriver");
Connection con=DriverManager.getConnection("jdbc:jrun:sqlserver://127.0.0.1:1433;databaseName=rai","sa","");

//Connection con=DriverManager.getConnection("jdbc:jrun:sqlserver://127.0.0.1:1433;databaseName=rai;user=sa;password=raihan");


    out.print("\r\n\r\n\r\n\r\n\r\n");

out.print("\r\n");

Statement stu = con.createStatement();
ResultSet rsu = stu.executeQuery("select * from newuser where name='"+ach+"' and accno='"+acno+"'");



    out.print("\r\n");

while(rsu.next())
{
String name=	rsu.getString(1);
String add=		rsu.getString(2);
String bday=	rsu.getString(3);
String nalty=	rsu.getString(4);
String occu=	rsu.getString(5);
String ph=		rsu.getString(6);
String eml=		rsu.getString(7);
String blnc=	rsu.getString(8);
String pass=	rsu.getString(9);
String repass=	rsu.getString(10);








    out.print("\r\n<form name=\"register\" method=\"post\" action=\"Updateinsert.jsp\" onSubmit=\"return validate();\" >\r\n  <pre><font color=\"#000099\">\t\r\n  <b>\t\r\n\t\t   To Create a new Account Holder please fill up the following informations.\t\r\n\t</b>\t</font>\r\n\t\t<input type=\"hidden\" name=\"Accno\" value=\"");

out.print(acno);
out.print("\">\r\n<font color=\"#660000\">\r\n\r\n\t\t\tName\t      \t<input type=\"text\" name=\"Name\" value=\"");

out.print(name);
out.print("\" size=\"27\"><font color=\"#FF0000\">(*)</font>\r\n\t      \t\t\t\r\n\t\t    \tAddress         <textarea name=\"Address\" value=\"asd\" rows=\"2\" cols=\"21\"></textarea><font color=\"#FF0000\">(*)</font>\r\n \r\n\t\t\tDate of Birth   <input type=\"text\" name=\"Birthday\" value=\"");

out.print(bday);
out.print("\" size=\"28\"><font color=\"#FF0000\">(*)</font>\r\n\r\n\t\t\tNationality     <input type=\"text\" name=\"Nationality\" value=\"");

out.print(nalty);
out.print("\" size=\"28\">\r\n\r\n\t\t\tOccupation      <input type=\"text\" name=\"Occupation\" value=\"");

out.print(occu);
out.print("\" size=\"28\">\r\n\r\n\t\t\tPhone           <input type=\"text\" name=\"Phone\" value=\"");

out.print(ph);
out.print("\" size=\"28\"></font><font color=\"#FF0000\">(*)</font><font color=\"#660000\">\r\n\r\n\t\t\tE-mail          <input name=\"Email\" type=\"text\" value=\"");

out.print(eml);
out.print("\" size=\"28\" ><font color=\"#FF0000\">(*)</font>\r\n\r\n\t\t\tBalance \t<input type=\"text\" name=\"Balance\" value=\"");

out.print(blnc);
out.print("\" size=\"28\"><font color=\"#FF0000\">(*)</font>\r\n\r\n\t\t\tPassword \t<input type=\"password\" name=\"Password\" size=\"28\" ><font color=\"#FF0000\">(*)</font>\r\n\r\n\t\t\tRetype Password <input type=\"password\" name=\"Repassword\" size=\"28\" ><font color=\"#FF0000\">(*)</font>\r\n</font>\r\n\t\t\t\t\t<input type=\"submit\" name=\"Submit2\" value=\"Submit\"> <input name=\"Reset\" type=\"reset\" id=\"Submit\" value=\"Reset\">      \t\t\r\n    \t \r\n\r\n</p></pre>\r\n  ");

}

    out.print("\r\n</form>\r\n\r\n\r\n\r\n\r\n\r\n</body>\r\n</html>");

      
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
        return "/UpdateUser.jsp";
    }
}
