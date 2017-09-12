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

@WebServlet(name = "BookServletCreate" , urlPatterns = "/create")
public class BookServletCreate extends HttpServlet{

    @Inject
    private InterfaceDao implementsDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String isbn = request.getParameter("isbn");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        Book book = new Book(isbn, title, author);
        implementsDao.saveBook(book);
        request.setAttribute("create", book);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

}
