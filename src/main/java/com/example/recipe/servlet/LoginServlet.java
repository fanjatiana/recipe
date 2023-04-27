package com.example.recipe.servlet;

import com.example.recipe.model.User;
import com.example.recipe.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userEmail = req.getParameter("email");
        String userPassword = req.getParameter("password");
        HttpSession session = req.getSession();
        req.setAttribute("isError", "");
        UserService userService = new UserService();
        User user = userService.getUser(userEmail,userPassword);
        if (user != null) {
            session.setAttribute("user", user);
            req.setAttribute("isError", "");
            resp.sendRedirect(req.getContextPath() + "/userSession/my-recipes");
        } else {
            req.setAttribute("isError", "Oops utilisateur ou mot de passe inconnu");
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
            session.invalidate();
        }
    }

}
