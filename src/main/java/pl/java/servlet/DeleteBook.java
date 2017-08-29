package pl.java.servlet;


import pl.java.dao.BookDao;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteBook extends HttpServlet {

    private static final long serialVersionUID = 1L ;

    @Inject
    private BookDao bookDao ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long id = Long.parseLong(req.getParameter("id")) ;
        bookDao.remove(id);
        resp.sendRedirect(req.getContextPath());



    }
}
