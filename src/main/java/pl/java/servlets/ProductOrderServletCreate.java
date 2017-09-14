package pl.java.servlets;

import pl.java.daoInterface.InterfaceDao;
import pl.java.model.Order;
import pl.java.model.Product;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addproductorder", urlPatterns = "/addproductorder")
public class AddProductOrder extends HttpServlet{

    @Inject
    InterfaceDao em ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idProduct = req.getParameter("productId");
        Long idP = Long.valueOf(idProduct) ;

        String idOrder = req.getParameter("orderId") ;
        Long idO = Long.valueOf(idOrder) ;

        Product product = em.getProduct(idP) ;
        Order order = em.getOrder(idO) ;

        order.getProducts().add(product) ;

    }
}
