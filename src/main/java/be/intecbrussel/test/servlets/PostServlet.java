package be.intecbrussel.test.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/postservlet")
public class PostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");



        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>");
        writer.println("Hello");
        writer.println("</h1>");
        writer.println("<h1>");
        writer.println("You reached the POST servlet");
        writer.println("</h1>");
        if (name != null && !name.trim().isEmpty()) {
            writer.println("	Welcome " + name + ".\r\n");
            writer.println("	\r\n");
        } else {
            writer.println("	Welcome Guest\r\n");
        }
        writer.println("		</body>\r\n");
                writer.println("</html>\r\n");

    }
}
