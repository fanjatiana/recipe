package com.example.recipe.servlet;

import com.example.recipe.dao.UserJdbcDao;
import com.example.recipe.model.User;
import com.example.recipe.service.RegisterService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/register.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String urlPicture = req.getParameter("picture");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        User newUser = new RegisterService().createAUser(firstname, lastname, urlPicture, email, password);
        boolean newUserAdded = new UserJdbcDao().create(newUser);
        HttpSession session = req.getSession();
        if (newUserAdded) {
            session.setAttribute("userEmail", email);
            resp.sendRedirect(req.getContextPath() + "/userSession/my-recipes");
        } else {
            req.setAttribute("isError", "Oops une erreur obscure est survenue");
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
            session.invalidate();
        }

    }
}