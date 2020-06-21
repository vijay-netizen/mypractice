import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class compregister extends HttpServlet{

public void service(HttpServletRequest req1,HttpServletResponse res1){

 try {
  PrintWriter out=res1.getWriter() ;
out.println("usha");
}catch(Exception e){
System.out.println(e);
}
}
}