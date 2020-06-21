import java.util.*;
import java.util.Date;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Comp_description extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)
{
 try
{
PrintWriter out=res.getWriter();
String dburl=new String("jdbc:odbc:jobsite");
String user="";
String password="";
String comp_no=req.getParameter("comp_no");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection(dburl,user,password);
Statement s=c.createStatement();
String qry="Select * from company where comp_no=";
qry+=comp_no;
ResultSet r=s.executeQuery(qry);
out.println("<html>"+"<head>"+"<title>Home</title>"+
"</head>"+"<body>"+
"<strong>"+
"<input src=\"file:///javaproject/erecruit1.gif\" name=\"I1\"width=\"199\" "+ "height=\"96\" alt=\"erecruit1.gif (2047 bytes)\" type=\"image\">"+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"</strong>"+
"<font face=\"Verdana\" size=\"1\">"+"<b>"+
"&nbsp;&nbsp;&nbsp;"+"</b>"+"</font>"+
"<table border=\"0\" width=\"100%\">"+
"<tr>"+
"<td width=\"14%\" bgcolor=\"#0683FF\">"+
"<a href=\"http://localhost:8080/servlet/Jobfront\">"+"Home"+
"</a>"+"</td>"+

"<td width=\"17%\" bgcolor=\"#0683FF\">"+"&nbsp;&nbsp;"+
"<a href=\"http://localhost:8080/servlet/about\">"+
"About Us"+"</a>"+ "</td>"+
"<td width=\"21%\" bgcolor=\"#0683FF\">"+"&nbsp;&nbsp;&nbsp;&nbsp;"+
"<a href=\"http://localhost:8080/servlet/contactus\">"+
" Contact Us"+"</a>"+"</td>"+

"</tr>"+"</table>");

while(r.next())
{
String add=r.getString("add");
String cname=r.getString("cname");
String category=r.getString("category");
String type=r.getString("type");
String desc1=r.getString("desc1");
int phno=r.getInt("cphno");
String cemail=r.getString("cemail");
out.println("<table border=\"0\" width=\"100%\" height=\"169\">"+
"<tr>"+
"<td width=\"80%\" height=\"165\">"+
"<font face=\"Book Antiqua\" size=\"4\"color=\"#FF0000\">"+"<strong>"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
cname+"</strong>"+"</font>"+"</td>"+"</tr>"+"</table>"+
"<table border=\"0\" width=\"100%\">"+"<tr>"+
"<td width=\"100%\" colspan=\"2\" bgcolor=\"#0683FF\">"+
"Company Details"+"</td>"+"</tr>"+"<tr>"+
"<td width=\"21%\" bgcolor=\"#DEE2E7\">Business address: "+"</td>"+
"<td width=\"79%\" bgcolor=\"#DEE2E7\">"+add+"</td>"+
 " </tr>"+"<tr>"+
"<td width=\"21%\" bgcolor=\"#DEE2E7\">"+"Phone Number:"+"</td>"+
"<td width=\"79%\" bgcolor=\"#DEE2E7\">"+phno+"</td>"+"</tr>"+
"<tr>"+"<td width=\"21%\" bgcolor=\"#DEE2E7\">"+"Email:"+"</td>"+
"<td width=\"79%\" bgcolor=\"#DEE2E7\">"+cemail+"</td>"+
"</tr>"+"<tr>"+"<td width=\"21%\" bgcolor=\"#DEE2E7\">"+
"Category:"+"</td>"+"<td width=\"79%\" bgcolor=\"#DEE2E7\">"+category+
"</td>"+"</tr>"+
"<tr>"+
"<td width=\"21%\" bgcolor=\"#DEE2E7\">Company type: "+"</td>"+
"<td width=\"79%\" bgcolor=\"#DEE2E7\">"+type+"</td>"+
 " </tr>"+
"<tr>"+
"<td width=\"21%\" bgcolor=\"#DEE2E7\">Description: "+"</td>"+
"<td width=\"79%\" bgcolor=\"#DEE2E7\">"+desc1+"</td>"+
 " </tr>"+"</table>"+"</body>"+"</html>");
}
}catch(Exception e)
{
System.out.println(e);
}
}
}


 