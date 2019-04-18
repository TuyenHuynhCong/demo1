package hoc_servlet_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Simple-servlet")
public class SimpleServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //super.doGet(req, resp);
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        //out.println("hello servlet");
        List<String> listStudent = new ArrayList<String>();
        listStudent.add("student 1 ");
        listStudent.add(" dtu");
        listStudent.add("das");
        out.println("<table>");
        for (String item :listStudent)
        {
            out.println("<tr>");
            out.println("<td>");
            out.println(item);
            out.println("</td>");
            out.println("</tr>");
        }
        out.println("<table>");

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //super.doPost(req, resp);
    }
}
