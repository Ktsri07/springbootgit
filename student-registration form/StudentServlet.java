package com.tejasri;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/register")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form data
        String name = request.getParameter("name");
        String branch = request.getParameter("branch");
        String email = request.getParameter("email");
        String roll = request.getParameter("roll");
        String year = request.getParameter("year");

        // Store data in request attributes to pass to JSP
        request.setAttribute("name", name);
        request.setAttribute("branch", branch);
        request.setAttribute("email", email);
        request.setAttribute("roll", roll);
        request.setAttribute("year", year);

        // Forward to result.jsp
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
