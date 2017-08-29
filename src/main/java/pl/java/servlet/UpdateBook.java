package pl.java.servlet;


import pl.java.dao.BookDao;
import pl.java.dao.BookDaoImpl;
import pl.java.model.Book;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class UpdateBook extends HttpServlet {

    private static final long serialVersionUID= 1L ;

    @Inject
    BookDao bookDao ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long id = Long.parseLong(req.getParameter("id")) ;
        String isbn = req.getParameter("isbn") ;
        String name = req.getParameter("name");
        String author = req.getParameter("author");
        Book book = new Book(isbn, name, author) ;
        book.setId(id);
        bookDao.update(book);
        resp.sendRedirect(req.getContextPath());
    }
}
