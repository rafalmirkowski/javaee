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

@WebServlet(name = "UpdateBook", urlPatterns = "/update")
public class UpdateBook extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Inject
    private BookDao bookDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        Book book = new Book(isbn, name, author);
        book.setId(id);
        bookDao.update(book);
        request.setAttribute("update", book);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}