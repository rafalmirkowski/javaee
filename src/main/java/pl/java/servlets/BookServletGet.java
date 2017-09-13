package pl.java.servlets;

import pl.java.daoInterface.InterfaceDao;
import pl.java.model.Book;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BookServletGet", urlPatterns = "/getbook")
public class BookServletGet extends HttpServlet {

    @Inject
    private InterfaceDao implementsDao;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("id");
        Long id = Long.valueOf(bookId);
        Book book = implementsDao.getBook(id);
        request.setAttribute("get", book);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }


}
