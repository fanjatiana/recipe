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


@WebServlet(urlPatterns = "/userSession/profile")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String userEmail = (String) session.getAttribute("userEmail");
        System.out.println(userEmail);
        UserService userService = new UserService();
        User user = userService.getUserByEmail(userEmail);
        System.out.println(user.getEmail());
        req.setAttribute("user", user);
        req.getRequestDispatcher("/WEB-INF/profile.jsp").forward(req, resp);
    }

}
