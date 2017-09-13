package pl.java.servlets;


import pl.java.daoInterface.InterfaceDao;
import pl.java.model.User;
import pl.java.model.DetailsUser;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServletCreate" , urlPatterns = "/saveuser")
public class UserServletCreate extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DetailsUser details = new DetailsUser() ;
        details.setFirstname(req.getParameter("firstname"));
        details.setLastname(req.getParameter("lastname"));
        details.setAddress(req.getParameter("address"));

        User user = new User() ;
        user.setUsername(req.getParameter("username"));
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));
        user.setDetailsUser_(details);

        req.setAttribute("user", user);
        req.setAttribute("user_details", details);
        req.getRequestDispatcher("index.jsp").forward(req,resp);









    }
}
