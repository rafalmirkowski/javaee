package pl.java.servlet_user;


import pl.java.dao.UserDao;
import pl.java.user.User;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetUser", urlPatterns = "/get")
public class GetUser extends HttpServlet{

    @Inject
    UserDao userDao ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long id = Long.parseLong("id") ;
        User user = userDao.get(id) ;
        req.setAttribute("user", user) ;
        req.getRequestDispatcher("index.jsp" ).forward(req, resp);


    }
}
