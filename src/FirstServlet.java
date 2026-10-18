import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{


    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

        System.out.println("control in 1st servlet");
       String name= request.getParameter("uname");
        String city= request.getParameter("ucity");
      RequestDispatcher  requestDispatcher  =request.getRequestDispatcher("/SecondServlet");

     HttpSession session= request.getSession();
     session.setAttribute("name",name);

     requestDispatcher.forward(request,response);
     // requestDispatcher.include(request,response);
           PrintWriter writer =   response.getWriter();
           writer.println("<h1>response from servlet one </h1>");
       // System.out.println("control again in 1st servlet");
    }
}
