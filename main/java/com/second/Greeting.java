package com.second;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="Greeting" , value = "/greeting")
public class Greeting extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //getServletContext().getRequestDispatcher("/greeting.html").forward(req,resp);
        resp.sendRedirect("/Day_19_Servlet/greeting.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String userName = req.getParameter("userName");
        resp.getWriter().write("<html><body>");
        resp.getWriter().write("<h1>Hello, " + userName + "!</h1>");
        resp.getWriter().write("</body></html>");
    }
}
