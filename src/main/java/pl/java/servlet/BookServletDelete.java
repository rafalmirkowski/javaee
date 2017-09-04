package pl.java.servlet;



import pl.java.dao.BookDao;
import pl.java.model.Book;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "BookServletDelete", urlPatterns = "/delete")
public class BookServletDelete extends HttpServlet{

    @Inject
    BookDao bookDao ;


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        bookDao.remove(id);
        String showMessage = "Skasowano książkę";
        request.setAttribute("showMessage", showMessage);
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }

}
