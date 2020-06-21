import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class comp_job extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)
{
 try
{ 
PrintWriter out=res.getWriter();
String dburl=new String("jdbc:odbc:jobsite");
String jobname,cat,loc,education;
int  exp;
String comp_no=req.getParameter("comp_no");
String user="";
String password="";
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection(dburl,user,password);
Statement s=c.createStatement();
String qry="Select * from comp_job where comp_no=";
qry+=comp_no;
ResultSet r=s.executeQuery(qry);
out.println("<html>"+"<body>"+
"<strong>"+
"<input src=\"file:///javaproject/erecruit1.gif\" name=\"I1\"width=\"199\" "+ "height=\"96\" alt=\"erecruit1.gif (2047 bytes)\" type=\"image\">"+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"</strong>"+
"<font face=\"Verdana\" size=\"1\">"+"<b>"+
"&nbsp;&nbsp;&nbsp;"+"</b>"+"</font>"+
"<table border=\"0\" width=\"100%\" height=\"17\">"+
"<tr>"+
"<td width=\"20%\" height=\"21\" bgcolor=\"#0683FF\">"+
"<p align=\"center\">"+
"<a href=\"http://localhost:8080/servlet/Jobfront\">"+"Home"+"</a>"+"</td>"+
"<td width=\"19%\" height=\"21\" bgcolor=\"#0683FF\">"+
"<p align=\"center\">"+
"<a href=\"http://localhost:8080/servlet/about\">"+"About Us"+"</a>"+"</td>"+
"<td width=\"18%\" height=\"21\" bgcolor=\"#0683FF\">"+
"<p align=\"center\">"+
"<a href=\"http://localhost:8080/servlet/contactus\">"+"Contact Us"+
"</a>"+
"</td>"+
"</tr>"+"</table>"+
"</br>"+
"<table border=\"0\" width=\"100%\" height=\"9\">"+"<tr>"+
"<td width=\"100%\" height=\"5\">"+
"<p align=\"center\">"+"<strong>"+"<font size=\"5\" color=\"#FF0000\">"+
"</font>"+"<font size=\"4\" color=\"#FF0000\">"+
"Company Jobs"+"</font>"+"</strong>"+"</td>"+"</tr>"+"</table>"+
"<p>"+"</p>"+"<table border=\"0\" width=\"102%\">"+
"<tr>"+
"<td width=\"29%\" align=\"center\" bgcolor=\"#0683FF\">"+"Position"+ "Vacant"+"</td>"+
"<td width=\"30%\" align=\"center\" bgcolor=\"#0683FF\">"+"Education"+
"</td>"+
"<td width=\"19%\" align=\"center\" bgcolor=\"#0683FF\">"+"&nbsp;&nbsp;"+
"&nbsp;"+" Category"+"</td>"+
"<td width=\"9%\" align=\"center\" bgcolor=\"#0683FF\">"+"Experience"+
"</td>"+
"<td width=\"13%\" align=\"center\" bgcolor=\"#0683FF\">"+"Location"+
"</td>"+"</tr>");
while(r.next())
{
jobname=r.getString("job_name");
loc=r.getString("location");
exp=r.getInt("experience");
cat=r.getString("category");
String degree=r.getString("highest_degree_held");
String discipline=r.getString("discipline");
 education=degree+discipline;
out.println("<tr>"+
"<td width=\"29%\" bgcolor=\"#DEE2E7\">"+jobname+"</td>"+
"<td width=\"30%\" bgcolor=\"#DEE2E7\">"+education+"</td>"+
"<td width=\"19%\" bgcolor=\"#DEE2E7\">"+"&nbsp;&nbsp;&nbsp;&nbsp;"+cat+
"</td>"+
"<td width=\"6%\" bgcolor=\"#DEE2E7\">"+"&nbsp;&nbsp;&nbsp;"+exp+"</td>"+
"<td width=\"20%\" bgcolor=\"#DEE2E7\">"+"&nbsp;&nbsp;"+loc+"</td>"+"</tr>");
}
}catch(Exception e)
{
System.out.println(e);
}
}
}

 
