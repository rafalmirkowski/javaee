package pl.java.servlet_user;


import pl.java.dao.UserDao;
import pl.java.dao.UserDetailsDao;
import pl.java.user.User;
import pl.java.user.User_details;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "createUser" , urlPatterns = "/create")
public class CreateUser extends HttpServlet {


    @Inject
    UserDao userDao ;
    @Inject
    UserDetailsDao userDetailsDao ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User_details details = new User_details() ;
        details.setFirstname(req.getParameter("firstname"));
        details.setLastname(req.getParameter("lastname"));
        details.setAddress(req.getParameter("address"));

        User user = new User() ;
        user.setUsername(req.getParameter("username"));
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));
        user.setUser_details(details);

        userDao.saveUser(user);
        userDetailsDao.createDetails(details);

        req.setAttribute("user", user);
        req.setAttribute("user_details", details);
        req.getRequestDispatcher("index.jsp").forward(req,resp);








    }
}
