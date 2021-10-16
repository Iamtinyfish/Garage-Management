package com.tfgarage.controller.servlet;

import com.tfgarage.controller.dao.AccountDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import javax.naming.NamingException;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CheckLoginServlet", urlPatterns = {"/check-login"})
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("inUsername");
        String password = request.getParameter("inPassword");

        AccountDAO dao = new AccountDAO();
        try {
            boolean result = dao.checkLogin(username,password);
            String url = "invalid.html";
            if (result) {
                url = "search.jsp";
                HttpSession session = request.getSession();
                session.setAttribute("USER", username);
            }
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request,response);
        } catch (SQLException e) {
            log("LoginServlet_SQL " + e.getMessage());
        } catch (NamingException e) {
            log("LoginServlet_JNDI " + e.getMessage());
        }
    }
}
