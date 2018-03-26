/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mitchell
 */
@WebServlet(name = "NewCustomerServlet", urlPatterns = {"/NewCustomerServlet"})
public class NewCustomerServlet extends HttpServlet {
    private String message;

    public NewCustomerServlet() {
        this.message = "butts";
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewCustomerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewCustomerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/Success.html";
        String FirstName = request.getParameter("FirstName");
        String LastName = request.getParameter("LastName");
        String Phone = request.getParameter("Phone");
        String Address = request.getParameter("Address");
        String City = request.getParameter("City");
        String State = request.getParameter("State");
        String Zipcode = request.getParameter("Zipcode");
        String Email = request.getParameter("Email");
        
        //Validation code
        if (
                "".equals(FirstName) ||
                "".equals(LastName) ||
                "".equals(Phone) ||
                "".equals(Address) ||
                "".equals(City) ||
                "".equals(State) ||
                "".equals(Zipcode) ||
                "".equals(Email)){
            url = "/New_customer.jsp";
            message = "All fields must be filled in";
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
