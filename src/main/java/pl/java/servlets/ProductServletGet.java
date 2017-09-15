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


@WebServlet(name = "getproduct", urlPatterns = "/getproduct")
public class ProductServletGet extends HttpServlet{




    @Inject
    InterfaceDao em ;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idProduct = req.getParameter("productId");
        Long id = Long.valueOf(idProduct) ;

        Product product = em.getProduct(id) ;
        product.getOrders().size() ;

        req.setAttribute("getproduct", product);
        req.getRequestDispatcher("index.jsp").forward(req, resp);



    }


}
