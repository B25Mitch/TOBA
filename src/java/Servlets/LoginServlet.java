package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mitchell
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";
        String action = request.getParameter("action");
        if (action == null){
            action = "login";
        }
        String Username = null;
        String Password = null;
        if (action.equals("login")){
            Username = request.getParameter("username");
            Password = request.getParameter("password");
        }
        if (Username.equals("jsmith@toba.com") && Password.equals("letmein")){
            url = "/Account_activity.html";
        }
        else{
            url = "/Login_failure.html";
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}
