import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class  about extends HttpServlet{
public void service(HttpServletRequest req1,HttpServletResponse res1)throws ServletException,IOException{
 try {
	PrintWriter out=res1.getWriter();
out.println("<html>"+

"<head>"+
"<title>"+"About&nbsp;"+" Us"+"</title>"+
"<meta name=\"GENERATOR\" content=\"Microsoft FrontPage 3.0\">"+
"</head>"+

"<body>"+
"<strong>"+
"<input src=\"file:///javaproject/erecruit1.gif\" name=\"I1\" width=\"199\""+ "height=\"96\" "+
"alt=\"erecruit1.gif (2047 bytes)\" type=\"image\">"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"</strong>"+
"<font face=\"Verdana\" size=\"1\">"+"<b>"+
"&nbsp;&nbsp;&nbsp;"+"</b>"+"</font>"+"</p>"+
"<p>"+"&nbsp;"+"</p>"+

"<table border=\"0\" width=\"100%\">"+
 " <tr>"+
"<td width=\"11%\" bgcolor=\"#1083FF\">"+
"&nbsp;&nbsp;&nbsp;&nbsp;"+
"<a href=\"http://localhost:8080/servlet/Jobfront\">"+
" Home"+"</a>"+"</td>"+
"<td width=\"12%\" bgcolor=\"#1083FF\">"+
"<a href=\"http://localhost:8080/servlet/Search_jobs\">"+
"Search&nbsp;"+" Jobs"+"</a>"+"</td>"+
"<td width=\"12%\"  bgcolor=\"#1083FF\">"+
"<a href=\"http://localhost:8080/servlet/contactus\">"+
"Contact&nbsp;"+" Us"+"</a>"+"</td>"+

  "</tr>"+
"</table>"+
"<br>"+
/*"<p>"+"&nbsp;"+"</p>"+*/

"<table border=\"0\" width=\"91%\">"+
  "<tr>"+
    "<td width=\"100%\" bordercolor=\"#FF0000\">"+
"<font size=\"3\" bgcolor=\"FF0000\">"+"About&nbsp;"+" Us"+"</font>"+"</td>"+
"  </tr>"+
"</table>"+

"<table border=\"0\" width=\"91%\">"+
  "<tr>"+
   " <td width=\"100%\">"+"The&nbsp; development&nbsp; of&nbsp; e-recruitment&nbsp; in&nbsp;"+
" India&nbsp; is&nbsp; growing&nbsp; with&nbsp; the&nbsp; fast&nbsp; growing&nbsp; netizen &nbsp;"+
"population.&nbsp; The&nbsp; online&nbsp; recruitment&nbsp; market&nbsp; is &nbsp;"+
   "expected&nbsp; to&nbsp; grow&nbsp; from&nbsp; $500&nbsp; million&nbsp;"+
" in&nbsp;&nbsp;2000 to&nbsp; $1.7&nbsp; billion&nbsp; in&nbsp;"+"2003."+
"<font color=\"#FF0000\">"+"<font face=\"Brush Script MT\" size=\"4\">"+" eRecruit"+"</font>"+"&nbsp;"+" </font>"+
"is&nbsp; a&nbsp; career&nbsp; portal&nbsp; connecting&nbsp; high&nbsp; quality&nbsp;"+
" Indian&nbsp; talent&nbsp; with&nbsp; best&nbsp; organizations&nbsp;"+" worldwide."+"</td>"+
 " </tr>"+
"</table>"+
"<br>"+
/*"<p>"+"&nbsp;"+"</p>"+*/

"<table border=\"0\" width=\"100%\">"+
  "<tr>"+
   " <td width=\"100%\">"+
"<font size=\"3\" bgcolor=\"FF0000\">"+
"Our&nbsp; "+"Aim"+"</font>"+"</td>"+" </tr>"+"</table>"+
"<table border=\"0\" width=\"100%\">"+" <tr>"+
   " <td width=\"100%\">"+"We&nbsp; offer&nbsp; our&nbsp; clients&nbsp; job&nbsp; vacancies , &nbsp;"+
"   the&nbsp; highest&nbsp; exposure&nbsp; and&nbsp; the&nbsp; best&nbsp; response &nbsp;"+
  "  in&nbsp; less time. The&nbsp; recruitment&nbsp; process is&nbsp; such&nbsp; that &nbsp;"+
 "   the&nbsp; employees&nbsp; get&nbsp; 100%&nbsp; satisfaction&nbsp; and &nbsp;"+
  "  jobseekers&nbsp; the&nbsp; best&nbsp; jobs.&nbsp; The&nbsp; needs&nbsp; of &nbsp;"+
  " employers&nbsp; and&nbsp; jobseekers&nbsp; is&nbsp; fully&nbsp; understood &nbsp;"+
  "  and&nbsp; hence&nbsp; provided&nbsp; with&nbsp; the&nbsp; best&nbsp; they&nbsp; can &nbsp;"+
 "   have .&nbsp;"+" </td>"+"  </tr>"+"</table>"+
"<br>"+
"<table border=\"0\" width=\"100%\">"+
 " <tr>"+
"<td width=\"100%\">"+
"<font size=\"3\" bgcolor=\"FF0000\">"+
"Services eRecruit provides :"+"</font>"+
    
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"&nbsp;&nbsp;&nbsp;&nbsp;"+
"    </td>"+
 " </tr>"+
"</table>"+
"<table border=\"0\" width=\"100%\">"+
  "<tr>"+
    "<td width=\"100%\">"+" ~&nbsp;"+"User's&nbsp; can&nbsp; search&nbsp; the&nbsp; jobs&nbsp;"+ 
"anywhere&nbsp; in&nbsp; the&nbsp;"+" world."+"<p>"+"~&nbsp; Employers&nbsp; can&nbsp; scan&nbsp;"+
" through&nbsp; the&nbsp; quality&nbsp; Resume's&nbsp; and&nbsp; choose&nbsp; according&nbsp;"+
" to&nbsp; their&nbsp;"+" needs."+"</p>"+
   " <p>"+"~&nbsp; Complete&nbsp; confidentiality&nbsp; is&nbsp; assured&nbsp; to&nbsp;"+
" jobseekers&nbsp; by&nbsp; keeping&nbsp; their&nbsp;resume&nbsp;"+
"safe&nbsp;" +"."+"</p>"+
 "<p>"+"~ The&nbsp; vacancies&nbsp; put&nbsp; up&nbsp; by&nbsp; the&nbsp; employers&nbsp;"+
" are&nbsp; updated&nbsp; according&nbsp; to&nbsp; daily&nbsp; "+"basis."+"</p>"+
 /*  " <p>"+"~ Employers&nbsp; can&nbsp; reach&nbsp; out&nbsp; to&nbsp; millions&nbsp;"+
" of&nbsp; jobseekers&nbsp; by&nbsp; advertising&nbsp;"+
" on&nbsp; eRecruit.&nbsp;&nbsp;&nbsp;&nbsp; "+"</p>"+*/
   " <p>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
"    </td>"+
 " </tr>"+
"</table>"+
"</body>"+
"</html>");}catch(Exception ioe) {
	System.out.println(ioe);
}
}
}