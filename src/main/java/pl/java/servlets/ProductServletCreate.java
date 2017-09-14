package pl.java.servlets;

import pl.java.daoInterface.InterfaceDao;
import pl.java.model.Product;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "saveproduct", urlPatterns = "/saveproduct")
public class ProductServletCreate extends HttpServlet{

    @Inject
    InterfaceDao interfaceDao ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Product product = new Product() ;
        product.setName(req.getParameter("productName"));
        product.setPrice(Double.parseDouble(req.getParameter("productPrice")));
        product.setDetails(req.getParameter("productDetails"));

        interfaceDao.saveProduct(product);

        req.setAttribute("saveProduct", product);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
