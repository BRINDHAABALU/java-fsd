//ServletInterfaces
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Interfaces</title>
</head>
<body>

<a href="interface">Show Servlet Interface</a>

</body>
</html>

//InterfaceDemo 
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

/**
* Servlet implementation class InterfaceDemo
*/
@WebServlet("/InterfaceDemo")
public class InterfaceDemo implements Servlet {
        
        ServletConfig config=null;
          public void init(ServletConfig config){
              this.config=config;
              System.out.println("Initialization complete");
           }

           public void service(ServletRequest req,ServletResponse res)
           throws IOException,ServletException{
               res.setContentType("text/html");
               PrintWriter pwriter=res.getWriter();
               pwriter.print("<html>");
               pwriter.print("<body>");
               pwriter.print("In the service() method<br>");
               pwriter.print("</body>");
               pwriter.print("</html>");
           }
           public void destroy(){
               System.out.println("In destroy() method");
           }
           public ServletConfig getServletConfig(){
               return config;
           }
           public String getServletInfo(){
               return "This is a sample servlet info";
           }
}

//web.xml 
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>Servlet Interface</display-name>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>
  <servlet>
    <servlet-name>InterfaceDemo</servlet-name>
    <servlet-class>InterfaceDemo</servlet-class>
  </servlet>
  
  <servlet-mapping>
    <servlet-name>InterfaceDemo</servlet-name>
    <url-pattern>/interface</url-pattern>
  </servlet-mapping>
  
</web-app>
