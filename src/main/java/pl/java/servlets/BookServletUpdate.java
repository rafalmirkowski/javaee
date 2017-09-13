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

@WebServlet(name = "BookServletUpdate", urlPatterns = "/updatebook")
public class BookServletUpdate extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Inject
    private InterfaceDao implementsDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        Book book = new Book(isbn, name, author);
        book.setId(id);
        implementsDao.updateBook(book);
        request.setAttribute("update", book);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
