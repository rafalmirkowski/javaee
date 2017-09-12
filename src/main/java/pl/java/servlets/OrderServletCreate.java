package pl.java.servlets;

import pl.java.daoInterface.InterfaceDao;
import pl.java.model.Order;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "OrderServletCreate", urlPatterns = "/addOrder")
public class OrderServletCreate extends HttpServlet {

    @Inject
    private InterfaceDao implementsDao;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Order order = new Order() ;
        order.setOrderDetails(req.getParameter("orderDetails"));
        order.setProduct(req.getParameter("productName"));

        Long clientId = Long.parseLong(req.getParameter("clientId"));

    }
}
