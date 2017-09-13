package pl.java.servlets;


import pl.java.daoInterface.InterfaceDao;
import pl.java.model.User;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServletGet", urlPatterns = "/getuser")
public class UserServletGet extends HttpServlet{

    @Inject
    private InterfaceDao implementsDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = req.getParameter("id");
        Long id = Long.valueOf(userId) ;
        User user = implementsDao.getUser(id) ;
        req.setAttribute("user", user) ;
        req.getRequestDispatcher("index.jsp" ).forward(req, resp);


    }
}
