import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Delete_vacancies extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)
{
 try
{
PrintWriter out=res.getWriter();
String dburl=new String("jdbc:odbc:jobsite");
String user="";
String password="";
String uname=req.getParameter("uname");
String compno=req.getParameter("compno");
String password1=req.getParameter("password");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection(dburl,user,password);
Statement s=c.createStatement();
String jobname=req.getParameter("jobname");
String qry="delete * from comp_job where job_name=";
qry+="\'";
qry+=jobname;
qry+="\'";
qry+=" and comp_no=";
qry+=compno;
out.println(qry);
s.executeUpdate(qry);
}catch(Exception e)
{
System.out.println(e);
}
}
}
