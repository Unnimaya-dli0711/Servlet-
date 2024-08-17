package com.five;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EmailServlet" , value = "/email")
public class EmailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.sendRedirect("/Day_19_Servlet/email.html");
        getServletContext().getRequestDispatcher("/email.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String email=req.getParameter("email");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<html><body>");
        printWriter.println("<h1>Email received: " + email + "</h1>");
        printWriter.println("</body></html>");

    }
}
