import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")

public class SecondServlet extends HttpServlet {


    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("control in 2nd servlet");
     HttpSession session= request.getSession(false);
      String name= (String) session.getAttribute("name");
        PrintWriter writer =   response.getWriter();
        writer.println("<h1>response from servlet two </h1>"+"<h1>"+name+"</h1>");

    }
}
