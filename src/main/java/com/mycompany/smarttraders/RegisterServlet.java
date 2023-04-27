
package com.mycompany.smarttraders;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            String fname = request.getParameter("fullname");
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String pnum = request.getParameter("pnum");
            String pword = AES.encrypt(request.getParameter("pword"), "1234");
            
            RegisterDao dao = new RegisterDao();
            
            if(dao.submitData(fname, username, email, pnum, pword)){
     
                    out.println("Registration Successful");
                 
                
            }else{ 
                    out.println("Registration Unsuccessful");
              
            }
            
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
