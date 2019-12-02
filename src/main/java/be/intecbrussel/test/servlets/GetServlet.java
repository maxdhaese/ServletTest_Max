package be.intecbrussel.test.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getservlet")
public class GetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>");
        writer.println("Welcome please enter your name");
        writer.println("</h1>");
        writer.println("<h1>");
        writer.println("<form method=\"Post\" action=\"postservlet\">\n" +
                "    <input type=\"text\" name=\"name\"/>\n" +
                "    <input type=\"submit\" value=\"push here\"/>\n" +
                "</form>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }


    }

