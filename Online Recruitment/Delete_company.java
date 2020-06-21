import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Delete_company extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)
{
 try
{
PrintWriter out=res.getWriter();
String dburl=new String("jdbc:odbc:jobsite");
String user="";
String password="";
String uname=req.getParameter("comp_no");
String password1=req.getParameter("password");
String compname=req.getParameter("compname");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection(dburl,user,password);
Statement s=c.createStatement();
Statement s1=c.createStatement();
Statement s2=c.createStatement();
String qry="Select * from company where lname=";
qry+="\'";
qry+=uname;
qry+="\'"; 
ResultSet r=s.executeQuery(qry);
String compname1;
while(r.next())
{
compname1=r.getString("cname");
int compno=r.getInt("comp_no");
if(compname.equals(compname1))
{
String qry1="Delete * from company where lname=";
qry1+="\'";
qry1+=uname;
qry1+="\'";
qry1+=" and pswd=";
qry1+="\'";
qry1+=password1;
qry1+="\'";
qry1+=" and cname=";
qry1+="\'";
qry1+=compname;
qry1+="\'";
out.println(qry1);
s1.executeUpdate(qry1);
String qry2="Delete * from comp_job where comp_no=";
qry2+=compno;
s2.executeUpdate(qry2);
}
else 
{
out.println("<html>"+"<head>"+
"<title>New Page 2</title>"+
"</head>"+"<body>"+
"<p>"+"You are not a valid user"+"&nbsp;"+"</p>"+
"<p>"+"<a href=\"http://localhost:8080/servlet/Modify_delete_company\">"+
"Back"+"</a>"+"</p>");
} 
}
}catch(Exception e)
{
System.out.println(e);
}
}
} 