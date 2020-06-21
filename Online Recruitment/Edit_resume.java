import java.util.*;
import java.io.*;
import java.util.Date;
import java.util.Calendar;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Edit_resume extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)
{
 try
{
PrintWriter out=res.getWriter();
String dburl=new String("jdbc:odbc:jobsite");
String user="";
String password="";
String uname="";
String uname1;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection(dburl,user,password);
Statement s=c.createStatement();
String compno=req.getParameter("comp_no");
uname=req.getParameter("uname");
String password1=req.getParameter("password1");
out.println(password1);
String fname=req.getParameter("fname");
String lname=req.getParameter("lname");
String add=req.getParameter("add");
String ocity=req.getParameter("ocity");
String state=req.getParameter("state");
String country=req.getParameter("country");
String pincode=req.getParameter("pincode");
String email=req.getParameter("email");
String ccode=req.getParameter("ccode");
String stdcode=req.getParameter("stdcode");
String phno=req.getParameter("phno");
String phone=ccode+"-"+stdcode+"-"+phno;
String experience=req.getParameter("experience");
String category=req.getParameter("category");
String industry=req.getParameter("industry");
String plocation=req.getParameter("plocation");
uname1=uname.trim();

String skills=req.getParameter("skills");
String qry="update resume set passwd=";
qry+="\'";
qry+=password1;
qry+="\'";
qry+=",";
qry+=" fname=";
qry+="\'";
qry+=fname;
qry+="\'";
qry+=",";
qry+=" lname=";
qry+="\'";
qry+=lname;
qry+="\'";
qry+=",";
qry+=" add=";
qry+="\'";
qry+=add;
qry+="\'";
qry+=",";
qry+=" location=";
qry+="\'";
qry+=ocity;
qry+="\'";
qry+=",";
qry+=" state=";
qry+="\'";
qry+=state;
qry+="\'";
qry+=",";
qry+=" country=";
qry+="\'";
qry+=country;
qry+="\'";
qry+=",";
qry+=" pincode=";
qry+=pincode;
qry+=",";
qry+=" email=";
qry+="\'";
qry+=email;
qry+="\'";
qry+=",";
qry+=" ph_no=";
qry+="\'";
qry+=phone;
qry+="\'";
qry+=",";
qry+=" experience=";
qry+=experience;
qry+=",";
qry+=" category=";
qry+="\'";
qry+=category;
qry+="\'";
qry+=",";
qry+=" industry=";
qry+="\'";
qry+=industry;
qry+="\'";
qry+=",";
qry+=" plocation=";
qry+="\'";
qry+=plocation;
qry+="\'";
qry+=",";
qry+=" skills=";
qry+="\'";
qry+=skills;
qry+="\'";
qry+=" where uname=";

qry+="\'";
qry+=uname1;
qry+="\'";
s.executeUpdate(qry);
}catch(Exception e)
{
System.out.println(e);
}
}
}