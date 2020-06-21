import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Delete_resume extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)
{
 try
{
PrintWriter out=res.getWriter();
String dburl=new String("jdbc:odbc:jobsite");
String user="";
String password="";
String user1=req.getParameter("user");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection(dburl,user,password);
Statement s=c.createStatement();
String qry="Delete * from resume where uname=";
qry+="\'";
qry+=user1;
qry+="\'";
out.println(qry);
s.executeUpdate(qry);
}catch(Exception e)
{
System.out.println(e);
}
}
} 