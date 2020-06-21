import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.text.*;

public class  contactus extends HttpServlet{


public void doGet(HttpServletRequest req1,HttpServletResponse res1)throws ServletException,IOException{


}
public void service(HttpServletRequest req1,HttpServletResponse res1)throws ServletException,IOException{

 try {

	PrintWriter out=res1.getWriter();
out.println("<html>"+
"<head>"+
"<title>"+"New Page 2"+"</title>"+
"<meta name=\"GENERATOR\" content=\"Microsoft FrontPage 3.0\">"+
"</head>"+
"<body>"+
"<p>"+"<input src=\"file:///c:/javaproject/erecruit1.gif\" name=\"I1\" width=\"199\" height=\"96\""+
"alt=\"erecruit1.gif (2047 bytes)\" type=\"image\">"+"</p>"+
"<table border=\"0\" width=\"99%\">"+
"  <tr>"+
"<td width=\"9%\" bgcolor=\"#0683FF\">"+
"<a href=\"http://localhost:8080/servlet/Jobfront\">"+"&nbsp;&nbsp;&nbsp;"+
"Home"+"</a>"+"</td>"+
"<td width=\"10%\" bgcolor=\"#0683FF\">"+
"<a href=\"http://localhost:8080/servlet/Search_jobs\">"+"Search"+"&nbsp;"+
" Jobs"+"</a>"+"</td>"+
"<td width=\"12%\" bgcolor=\"#0683FF\">"+"&nbsp;&nbsp;&nbsp;&nbsp;"+
 "<a href=\"http://localhost:8080/servlet/about\">"+
"About&nbsp;"+
" Us&nbsp;&nbsp;"+"</a>"+" </td>"+
"  </tr>"+"</table>"+"<p>"+"&nbsp;"+"</p>"+
"<table border=\"0\" width=\"100%\">"+
"  <tr>"+
"<td width=\"100%\" colspan=\"2\" bgcolor=\"#0683FF\">"+
"<font size=\"3\">"+"Contact Us"+"</font>"+"</td>"+
"  </tr>"+"  <tr>"+
" <td width=\"27%\">"+
"<input src=\"file:///c:/javaproject/cont_pic.jpg\" name=\"I1\" width=\"157\" height=\"91\" "+
"alt=\"cont_pic.jpg (5240 bytes)\" type=\"image\">"+"</td>"+
"<td width=\"73%\">"+"<font face=\"verdana, Ariel\" size=\"1\">"+
"<span>"+
" If you wish to know more"+
" about our services&nbsp;&nbsp;"+" please feel free to call on the contact numbers&nbsp;"+
" given across the country ."+"</span>"+"</font>"+"</td>"+
"  </tr>"+"</table>"+
"<p>"+"&nbsp;"+"</p>"+
"<table border=\"0\" width=\"94%\" height=\"1\">"+
 " <tr>"+
"<td width=\"1%\" height=\"1\" rowspan=\"6\">"+
"<input src=\"file:///c:/javaproject/Phone.jpg\" name=\"I1\""+
" width=\"218\"  height=\"156\" alt=\"Phone.wmf (20118 bytes)\" type=\"image\">"+"</td>"+
"<td width=\"23%\" height=\"1\">"+"<font face=\"verdana\" size=\"1\">"+"Delhi :"+"</font>"+
"</td>"+
"<td width=\"22%\" height=\"1\">"+"<font face=\"verdana\" size=\"1\">"+"91-11-6320702/52"+
"</font>"+"</td>"+" </tr>"+" <tr>"+
"<td width=\"23%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"Mumbai :"+"</font>"+
"</td>"+
"<td width=\"22%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"91-22-6431914/849"+
"</font>"+"</td>"+" </tr>"+" <tr>"+
"<td width=\"23%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"Bangalore :"+"</font>"+
"</td>"+
"<td width=\"22%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"91-80-2296853/54"+
"</font>"+"</td>"+"</tr>"+" <tr>"+
"<td width=\"23%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"Hyderabad :"+
"</font>"+"</td>"+
"<td width=\"22%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"91-40-6664871/72"+
"</font>"+"</td>"+"</tr>"+"<tr>"+
"<td width=\"23%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"Pune :"+"</font>"+
"</td>"+
"<td width=\"22%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"98230-19291"+
"</font>"+"</td>"+"</tr>"+"<tr>"+
"<td width=\"23%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"Chennai :"+"</font>"+
"</td>"+
"<td width=\"22%\" height=\"0\">"+"<font face=\"verdana\" size=\"1\">"+"040-8279933/3904"+
"</font>"+"</td>"+"</tr>"+"</table>"+
"<p>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"</p>"+"</body>"+"</html>");}catch(Exception ioe) {
	System.out.println(ioe);
}
}
}
