//project ServletGetPost
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="gethandler?name=John+Doe&address=145+Lake+Avenue">Do a Servlet GET</a><br><br>
<form name=frm method=post action="posthandler">
  Name <input name="name" id="name" maxlenght=50><br>
  Address <input name="address" id="address" maxlength=100><br>
<button>Submit</button>
</form>
</body>
</html>

//GetHandler
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* Servlet implementation class GetHandler
*/
@WebServlet("/GetHandler")
public class GetHandler extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public GetHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                  PrintWriter out = response.getWriter();
                    out.println("<html><body>");
                    
                    String name = request.getParameter("name");
                    String address = request.getParameter("address");
                    out.println("Name=" + name + "<br>Address=" + address);
                    out.println("</body></html>");
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}


//PostHandler
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class PostHandler
*/
@WebServlet("/PostHandler")
public class PostHandler extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public PostHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                  PrintWriter out = response.getWriter();
                    out.println("<html><body>");
                    
                    String name = request.getParameter("name");
                    String address = request.getParameter("address");
                    
                    out.println("Name=" + name + "<br>Address=" + address);
                    out.println("</body></html>");
        }

}




